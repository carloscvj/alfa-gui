/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * ContenedorFrame.java
 *
 * Created on 16-sep-2011, 13:09:36
 */
package es.cvjpy;

import java.awt.Cursor;
import java.awt.Dialog;
import java.awt.Dimension;
import java.awt.Frame;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JPanel;
import javax.swing.MenuElement;

/**
 *
 * @author carlos
 */
public class PrincipalFrame extends javax.swing.JFrame implements GuiPro {

    //private boolean ejecutadoinicial;
    /**
     * Creates new form ContenedorFrame
     */
    public PrincipalFrame() {
        initComponents();
        ErroresHandler eh = new ErroresHandler();
        eh.setTextArea(saco, saco1);
        Logger logger = Logger.getLogger(PrincipalFrame.class.getName());
        logger.getParent().addHandler(eh);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        bindingGroup = new org.jdesktop.beansbinding.BindingGroup();

        erroresFrame = new javax.swing.JFrame();
        panelarriba = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        visor = new javax.swing.JScrollPane();
        saco = new javax.swing.JTextArea();
        panelabajo = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        botonSalir = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        infosFrame = new javax.swing.JFrame();
        panelarriba1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        visor1 = new javax.swing.JScrollPane();
        saco1 = new javax.swing.JTextArea();
        panelabajo1 = new javax.swing.JPanel();
        jButton4 = new javax.swing.JButton();
        limpirarInfos = new javax.swing.JButton();
        pestanyas = new javax.swing.JTabbedPane();
        barraMenusCMP = new javax.swing.JMenuBar();

        erroresFrame.setAlwaysOnTop(true);
        erroresFrame.setLocationByPlatform(true);
        erroresFrame.setMinimumSize(new java.awt.Dimension(900, 600));

        org.jdesktop.beansbinding.Binding binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, this, org.jdesktop.beansbinding.ELProperty.create("${iconImage}"), erroresFrame, org.jdesktop.beansbinding.BeanProperty.create("iconImage"));
        bindingGroup.addBinding(binding);

        jLabel2.setFocusable(false);
        jLabel2.setRequestFocusEnabled(false);
        panelarriba.add(jLabel2);

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        java.util.ResourceBundle bundle = java.util.ResourceBundle.getBundle("alfalit"); // NOI18N
        jLabel1.setText(bundle.getString("Error")); // NOI18N
        panelarriba.add(jLabel1);

        erroresFrame.getContentPane().add(panelarriba, java.awt.BorderLayout.NORTH);

        visor.setPreferredSize(new java.awt.Dimension(900, 600));

        saco.setColumns(20);
        saco.setRows(5);
        saco.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                sacoCaretUpdate(evt);
            }
        });
        visor.setViewportView(saco);

        erroresFrame.getContentPane().add(visor, java.awt.BorderLayout.CENTER);

        jButton1.setText(bundle.getString("Ignorar")); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        panelabajo.add(jButton1);

        botonSalir.setText(bundle.getString("Salir")); // NOI18N
        botonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonSalirActionPerformed(evt);
            }
        });
        panelabajo.add(botonSalir);

        jButton3.setText(bundle.getString("Limpiar")); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        panelabajo.add(jButton3);

        erroresFrame.getContentPane().add(panelabajo, java.awt.BorderLayout.SOUTH);

        infosFrame.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        infosFrame.setLocationByPlatform(true);
        infosFrame.setMinimumSize(new java.awt.Dimension(900, 600));

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, this, org.jdesktop.beansbinding.ELProperty.create("${iconImage}"), infosFrame, org.jdesktop.beansbinding.BeanProperty.create("iconImage"));
        bindingGroup.addBinding(binding);

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/es/cvjpy/resources/Info.png"))); // NOI18N
        jLabel3.setFocusable(false);
        jLabel3.setRequestFocusEnabled(false);
        panelarriba1.add(jLabel3);

        jLabel4.setFont(new java.awt.Font("Dialog", 0, 36)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText(bundle.getString("Procesando")); // NOI18N
        panelarriba1.add(jLabel4);

        infosFrame.getContentPane().add(panelarriba1, java.awt.BorderLayout.NORTH);

        visor1.setPreferredSize(new java.awt.Dimension(900, 600));

        saco1.setColumns(20);
        saco1.setRows(5);
        visor1.setViewportView(saco1);

        infosFrame.getContentPane().add(visor1, java.awt.BorderLayout.CENTER);

        jButton4.setText(bundle.getString("Cerrar")); // NOI18N
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        panelabajo1.add(jButton4);

        limpirarInfos.setText(bundle.getString("Limpiar")); // NOI18N
        limpirarInfos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limpirarInfosActionPerformed(evt);
            }
        });
        panelabajo1.add(limpirarInfos);

        infosFrame.getContentPane().add(panelabajo1, java.awt.BorderLayout.SOUTH);

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setLocationByPlatform(true);
        setMinimumSize(new java.awt.Dimension(800, 600));

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, this, org.jdesktop.beansbinding.ELProperty.create("${padre.titulo}"), this, org.jdesktop.beansbinding.BeanProperty.create("title"));
        bindingGroup.addBinding(binding);
        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, this, org.jdesktop.beansbinding.ELProperty.create("${padre.icono}"), this, org.jdesktop.beansbinding.BeanProperty.create("iconImage"));
        bindingGroup.addBinding(binding);

        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        pestanyas.setPreferredSize(new java.awt.Dimension(800, 600));
        getContentPane().add(pestanyas, java.awt.BorderLayout.CENTER);

        barraMenusCMP.setMinimumSize(new java.awt.Dimension(59, 21));
        barraMenusCMP.setPreferredSize(new java.awt.Dimension(59, 21));
        setJMenuBar(barraMenusCMP);

        bindingGroup.bind();

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        fin();
    }//GEN-LAST:event_formWindowClosing

    private void sacoCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_sacoCaretUpdate
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        Dimension frameSize = erroresFrame.getSize();
        if (frameSize.height > screenSize.height) {
            frameSize.height = screenSize.height;
        }
        if (frameSize.width > screenSize.width) {
            frameSize.width = screenSize.width;
        }
        erroresFrame.setLocation((screenSize.width - frameSize.width) / 2, (screenSize.height - frameSize.height) / 2);
        erroresFrame.setVisible(true);
        erroresFrame.toFront();
    }//GEN-LAST:event_sacoCaretUpdate

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        erroresFrame.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void botonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonSalirActionPerformed
        erroresFrame.setVisible(false);
        fin();
    }//GEN-LAST:event_botonSalirActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        saco.setText("");
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        infosFrame.dispose();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void limpirarInfosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limpirarInfosActionPerformed
        saco1.setText("");
    }//GEN-LAST:event_limpirarInfosActionPerformed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar barraMenusCMP;
    private javax.swing.JButton botonSalir;
    private javax.swing.JFrame erroresFrame;
    private javax.swing.JFrame infosFrame;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JButton limpirarInfos;
    private javax.swing.JPanel panelabajo;
    private javax.swing.JPanel panelabajo1;
    private javax.swing.JPanel panelarriba;
    private javax.swing.JPanel panelarriba1;
    private javax.swing.JTabbedPane pestanyas;
    private javax.swing.JTextArea saco;
    private javax.swing.JTextArea saco1;
    private javax.swing.JScrollPane visor;
    private javax.swing.JScrollPane visor1;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables

    private void anadeMenu(JMenu este) {
        for (int j = 0; j < este.getMenuComponentCount(); j++) {
            Object menu = este.getMenuComponent(j);
            if (menu instanceof MenuElemento) {
                anadeMenuItemUI((MenuElemento) menu);
            } else {
                anadeMenu((JMenu) menu);
            }
        }
    }

    private void anadeMenuItemUI(MenuElemento este) {
        este.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                procesaritem(e);
            }
        });
    }

    private void procesaritem(ActionEvent e) {
        final ActionEvent evt = e;
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                MenuElemento src = (MenuElemento) evt.getSource();
                try {
                    ejecutar(src);
                } catch (Exception ex) {
                    Logger.getLogger(PrincipalFrame.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    private void ejecutar(MenuElemento mitem) throws Exception {
        Cursor antes = this.getCursor();
        this.setCursor(new Cursor(Cursor.WAIT_CURSOR));
        llama(mitem);
        this.setCursor(antes);
    }

    private void llama(MenuElemento mitem) throws Exception {
        GuiPro llamado = getPadre().getGui(mitem);
        if (llamado != null) {
            if (llamado instanceof JInternalFrame) {
                remover(llamado);
                pestanyas.addTab(mitem.getText(), (JInternalFrame) llamado);
                ((JInternalFrame) llamado).setTitle(mitem.getText());
            }
            if (llamado instanceof JPanel) {
                remover(llamado);
                pestanyas.addTab(mitem.getText(), (JPanel) llamado);
            }
            if (llamado instanceof JFrame) {
                ((Frame) llamado).setTitle(mitem.getText());
                ((Frame) llamado).setIconImage(getIconImage());
            }
            if (llamado instanceof JDialog) {
                ((Dialog) llamado).setTitle(mitem.getText());
                ((Dialog) llamado).setIconImage(getIconImage());
            }
        }
        //CliPro cliPro = getPadre().getCli(mitem.getCli());
        if (llamado != null) {
            getPadre().llamarA(llamado);//, cliPro);
        }
        refresh();
    }
    private JMenuBar barraMenu;
    public static final String PROP_BARRAMENU = "barraMenu";

    public JMenuBar getBarraMenu() {
        return barraMenu;
    }

    public void setBarraMenu(JMenuBar datos) {
        JMenuBar oldDatos = this.barraMenu;
        this.barraMenu = datos;
        MenuElement[] subElements = datos.getSubElements();
        for (MenuElement este : subElements) {
            JMenu cada = (JMenu) este;
            JMenu add = barraMenusCMP.add(cada);
            for (int j = 0; j < cada.getMenuComponentCount(); j++) {
                Object menu = cada.getMenuComponent(j);
                if (menu instanceof MenuElemento) {
                    anadeMenuItemUI((MenuElemento) menu);
                } else {
                    anadeMenu((JMenu) menu);
                }
            }

        }
        firePropertyChange(PROP_BARRAMENU, oldDatos, datos);
    }
    private PrincipalUIPro padre;

    @Override
    public void inicio(PrincipalUIPro padre) {
        this.setPadre(padre);
    }

    @Override
    public boolean puedosalir() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void fin() {
        getPadre().salir();
    }

    public PrincipalUIPro getPadre() {
        return padre;
    }

    public void setPadre(PrincipalUIPro padre) {
        this.padre = padre;
        firePropertyChange("padre", null, padre);
    }

    public void remover(GuiPro hijo) {
        if (hijo instanceof JInternalFrame) {
            pestanyas.remove((JInternalFrame) hijo);
        }
        if (hijo instanceof JPanel) {
            pestanyas.remove((JPanel) hijo);
        }
        refresh();
    }

    public void verInfos(boolean sino) {
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        Dimension frameSize = infosFrame.getSize();
        if (frameSize.height > screenSize.height) {
            frameSize.height = screenSize.height;
        }
        if (frameSize.width > screenSize.width) {
            frameSize.width = screenSize.width;
        }
        infosFrame.setLocation((screenSize.width - frameSize.width) / 2, (screenSize.height - frameSize.height) / 2);
        infosFrame.setVisible(sino);
        if (sino) {
            infosFrame.toFront();
            infosFrame.setState(0);
        }
    }

    public void refresh() {
        firePropertyChange("padre", null, padre);
    }

    @Override
    public boolean isIniciado() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void rellama() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void setCli(PrincipalCliPro principalCliPro) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


}
