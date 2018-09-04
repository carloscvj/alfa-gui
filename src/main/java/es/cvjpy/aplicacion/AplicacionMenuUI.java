/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package es.cvjpy.aplicacion;

import es.cvjpy.MenuElemento;
import es.cvjpy.cobol.utilidades.ReconstruirIdxFrame;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JMenu;

/**
 *
 * @author carlos
 */
public class AplicacionMenuUI {

    public static MenuElemento crearConfiguracionME() {
        try {
            MenuElemento ret = new MenuElemento();
            ret.setGui(Class.forName("es.cvjpy.aplicacion.ConfiguracionDialog"));
            ret.setText(ResourceBundle.getBundle("alfalit").getString("menu." + ret.getGui().getName()));
            return ret;
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(AplicacionMenuUI.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public static MenuElemento crearPreferenciasME() {
        MenuElemento ret = new MenuElemento();
        ret.setGui(PreferenciasDialog.class);
        ret.setText(ResourceBundle.getBundle("alfalit").getString("menu." + ret.getGui().getName()));
        return ret;
    }

    public static JMenu crearConfiguracionPreferenciasJM() {
        JMenu papa = new JMenu();
        papa.setName("configuracionpreferencias");
        papa.setText(ResourceBundle.getBundle("alfalit").getString("menu." + papa.getName()));
        papa.add(crearConfiguracionME());
        papa.add(crearPreferenciasME());
        return papa;

    }

    public static MenuElemento crearSalirME() {
        MenuElemento ret = new MenuElemento();
        ret.setGui(SalirDialog.class);
        ret.setText(ResourceBundle.getBundle("alfalit").getString("menu." + ret.getGui().getName()));
        return ret;
    }

    public static JMenu crearAplicacionJM() {
        JMenu papa = new JMenu();
        papa.setName("aplicacion");
        papa.setText(ResourceBundle.getBundle("alfalit").getString("menu." + papa.getName()));
        papa.setMnemonic((int) 'A');
        papa.add(crearSalirME());
        papa.add(crearConfiguracionPreferenciasJM());
        return papa;
    }
    
    public static MenuElemento crearReconstruirIdxFrameME() {
        MenuElemento ret = new MenuElemento();
        ret.setGui(ReconstruirIdxFrame.class);
        ret.setText(ResourceBundle.getBundle("alfalit").getString("menu." + ret.getGui().getName()));
        return ret;

    }

    public static JMenu crearUtilidadesJM() {
        JMenu papa = new JMenu();
        papa.setName("utilidades");
        papa.setText(ResourceBundle.getBundle("alfalit").getString("menu." + papa.getName()));
        papa.setMnemonic((int) 'U');
        papa.add(crearReconstruirIdxFrameME());
        return papa;
    }

    private AplicacionMenuUI() {
    }
    
}
