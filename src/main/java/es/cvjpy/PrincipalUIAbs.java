/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package es.cvjpy;

import es.cvjpy.aplicacion.PreferenciasCli;
import es.cvjpy.aplicacion.ConfiguracionCli;
import es.cvjpy.aplicacion.SalirCli;
import java.awt.Image;
import java.net.URL;
import java.util.Collection;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JMenuBar;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author carlos
 */
public abstract class PrincipalUIAbs extends PrincipalCliAbs implements PrincipalUIPro {

    private PrincipalFrame principalFrame;
    private JMenuBar barraMenu;
    private Map<String, GuiPro> enEjecucionGUI;

    public PrincipalUIAbs() {
    }

    private Map<String, GuiPro> getEnEjecucionGUI() {
        if (enEjecucionGUI == null) {
            enEjecucionGUI = new HashMap();
        }
        return enEjecucionGUI;
    }

    protected void limpiarRecursos() {

        getPrincipalFrame().setVisible(false);

        enEjecucionGUI = null;
        principalFrame = null;
        barraMenu = null;

        System.gc();
    }

    private boolean puedosalir() {
        boolean ret = true;
        Collection<GuiPro> values = getEnEjecucionGUI().values();
        for (GuiPro uno : values) {
            ret = uno.puedosalir();
            if (!ret) {
                JOptionPane.showMessageDialog(null, ResourceBundle.getBundle("alfalit").getString("Hay_un_proceso_sin_terminar"));
                break;
            }
        }
        return ret;
    }

    protected PrincipalFrame getPrincipalFrame() {
        if (principalFrame == null) {
            principalFrame = new PrincipalFrame();
        }
        return principalFrame;
    }

    protected abstract JMenuBar crearBarraMenu();

    protected abstract void llamaConfiguracionInicial(ConfiguracionCli confCli);

    protected abstract String getUsuarioEnTitulo();

    protected abstract void reiniciaTu();

    protected String getIconStr() {
        return "/es/cvjpy/resources/Alfa0.jpg";
    }

    protected String getTextoEnTitulo() {
        String aplicacion = "";
        try {
            aplicacion = getServidor().getConfiguracionPro().getConfiguracion().getVersionAlfa().getAplicacion();
        } catch (Exception ex) {
            Logger.getLogger(PrincipalUIAbs.class.getName()).log(Level.SEVERE, null, ex);
        }
        return aplicacion;
    }

    @Override
    public void llamarA(GuiPro guiPro) {
        try {
            if (sePermite(guiPro.getClass())) {
                if (guiPro.isIniciado()) {
                    guiPro.rellama();
                } else {
                    guiPro.inicio(this);//, cliPro);
                }
            } else {
                JOptionPane.showMessageDialog(null, ResourceBundle.getBundle("alfalit").getString("No_tiene_permiso_para_ejecutar_esta_opcion"));
            }
        } catch (Exception ex) {
            Logger.getLogger(PrincipalUIAbs.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public JMenuBar getBarraMenu() {
        barraMenu = crearBarraMenu();
        return barraMenu;
    }

    @Override
    public GuiPro getGui(MenuElemento mitem) {
        Class cachoPro = mitem.getGui();
        GuiPro ret = getEnEjecucionGUI().get(cachoPro.getName());
        if (ret == null) {
            try {
                ret = (GuiPro) cachoPro.newInstance();
                getEnEjecucionGUI().put(cachoPro.getName(), ret);
            } catch (InstantiationException ex) {
                Logger.getLogger(PrincipalUIAbs.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IllegalAccessException ex) {
                Logger.getLogger(PrincipalUIAbs.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
        return ret;
    }

    @Override
    public void remover(GuiPro hijo) {
        getPrincipalFrame().remover(hijo);
        getEnEjecucionGUI().remove(hijo.getClass().getName());
    }

    @Override
    public void reiniciar() {
        try {
            if (puedosalir()) {
                SalirCli salir = new SalirCli();
                salir.setPrincipalPro(getServidor());
                salir.salir(); // Para terminar los procesos de cobol.
                limpiarRecursos();
                reiniciaTu();
            }
        } catch (Exception ex) {
            Logger.getLogger(PrincipalUIAbs.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void inicio() throws Exception {
        PreferenciasCli preferenciasCli = new PreferenciasCli();
        preferenciasCli.setPrincipalPro(getServidor());
        estableceLookAndFeel(preferenciasCli.getPreferencias().getAspectoSwing().getLineaSelected());
        String idioma = preferenciasCli.getPreferencias().getIdioma();
        Locale.setDefault(new Locale(idioma, Locale.getDefault().getCountry()));
        ConfiguracionCli confCli = new ConfiguracionCli();
        confCli.setPrincipalPro(getServidor());

        if (confCli.getConfiguracion().getMostrarInicial()) {
            llamaConfiguracionInicial(confCli);
        }

        getPrincipalFrame().setBarraMenu(getBarraMenu());
        getPrincipalFrame().inicio(this);
        getPrincipalFrame().setVisible(true);
    }

    @Override
    public String getTitulo() {
        String ret = getTextoEnTitulo();
        ret = ret + " - " + getUsuarioEnTitulo();
        return ret;
    }

    @Override
    public Image getIcono() {
        URL resource = getClass().getResource(getIconStr());
        Image image = new ImageIcon().getImage();
        if (resource != null) {
            image = new ImageIcon(resource).getImage();
        }
        return image;
    }

    @Override
    public void ensenaInfos(boolean sino) {
        getPrincipalFrame().verInfos(sino);
    }

    @Override
    public void salir() {
        if (puedosalir()) {
            SalirCli salir = new SalirCli();
            salir.setPrincipalPro(getServidor());
            salir.salir(); // Para terminar los procesos de cobol.
            limpiarRecursos();
            System.exit(0);
        }
    }

    @Override
    public void cambioDePreferencias() throws Exception {
        limpiarRecursos();
        PreferenciasCli preferenciasCli = new PreferenciasCli();
        preferenciasCli.setPrincipalPro(getServidor());
        estableceLookAndFeel(preferenciasCli.getPreferencias().getAspectoSwing().getLineaSelected());
        String idioma = preferenciasCli.getPreferencias().getIdioma();
        Locale.setDefault(new Locale(idioma, Locale.getDefault().getCountry()));
        getPrincipalFrame().setBarraMenu(getBarraMenu());
        getPrincipalFrame().inicio(this);
        getPrincipalFrame().setVisible(true);
    }

    public void estableceLookAndFeel(String lineaSelected) {
        try {
            UIManager.setLookAndFeel(lineaSelected);
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {
            Logger.getLogger(PrincipalUIAbs.class.getName()).log(Level.WARNING, null, ex);
            try {
                UIManager.setLookAndFeel("javax.swing.plaf.metal.MetalLookAndFeel");
            } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex1) {
                Logger.getLogger(PrincipalUIAbs.class.getName()).log(Level.SEVERE, null, ex1);
            }
        }
    }

}
