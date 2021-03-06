/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package es.cvjpy.cobol.utilidades;

import es.cvjpy.GuiPro;
import es.cvjpy.PrincipalUIPro;
import es.cvjpy.util.ModeloGuiPro;
import java.awt.Cursor;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.SwingUtilities;

/**
 *
 * @author carlos
 */
public class ReconstruirIdxFrame extends javax.swing.JFrame implements GuiPro {

    /**
     * Creates new form ReconstruirIdxCliFrame
     */
    public ReconstruirIdxFrame() {
        initComponents();
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

        listadoBarra1 = new es.cvjpy.componentes.ProcesoBarra();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        listadoBarra1.setF1(false);
        listadoBarra1.setF3(false);
        listadoBarra1.setF5(false);
        listadoBarra1.setF6(false);
        listadoBarra1.setF7(false);
        listadoBarra1.setF8(false);
        listadoBarra1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listadoBarra1ActionPerformed(evt);
            }
        });

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        java.util.ResourceBundle bundle = java.util.ResourceBundle.getBundle("alfalit"); // NOI18N
        jLabel1.setText(bundle.getString("Nombre_interno")); // NOI18N

        org.jdesktop.beansbinding.Binding binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, this, org.jdesktop.beansbinding.ELProperty.create("${datos.ficheroCobolFiltro.nombreInterno}"), jTextField1, org.jdesktop.beansbinding.BeanProperty.create("text"));
        bindingGroup.addBinding(binding);

        jTextField1.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                jTextField1CaretUpdate(evt);
            }
        });

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel2.setText(bundle.getString("Nombre_externo")); // NOI18N

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, this, org.jdesktop.beansbinding.ELProperty.create("${datos.ficheroCobolFiltro.nombreExterno}"), jTextField2, org.jdesktop.beansbinding.BeanProperty.create("text"));
        bindingGroup.addBinding(binding);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField2, javax.swing.GroupLayout.DEFAULT_SIZE, 465, Short.MAX_VALUE)))
                .addContainerGap())
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jLabel1, jLabel2});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(listadoBarra1, javax.swing.GroupLayout.DEFAULT_SIZE, 615, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(listadoBarra1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        bindingGroup.bind();

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void listadoBarra1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listadoBarra1ActionPerformed

        String cual = evt.getActionCommand().trim();
        if (cual.equals("ESC")) {
            fin();
            return;
        }
        refresh();
        if (cual.equals("F2")) {
            auxiliar.getPadre().ensenaInfos(true);
        }

        if (cual.equals("F4")) {
            empezar();
        }

    }//GEN-LAST:event_listadoBarra1ActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing

        fin();

    }//GEN-LAST:event_formWindowClosing

    private void jTextField1CaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_jTextField1CaretUpdate
        reconstruyeExterno();
    }//GEN-LAST:event_jTextField1CaretUpdate

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private es.cvjpy.componentes.ProcesoBarra listadoBarra1;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables
    ;
    private final ModeloGuiPro auxiliar = new ModeloGuiPro(this);

    private void refresh() {
        firePropertyChange(PROP_DATOS, null, datos);
    }
    private ReconstruirIdxCli datos;
    public static final String PROP_DATOS = "datos";

    public ReconstruirIdxCli getDatos() {
        return datos;
    }

    public void setDatos(ReconstruirIdxCli datos) {
        ReconstruirIdxCli oldDatos = this.datos;
        this.datos = datos;
        firePropertyChange(PROP_DATOS, oldDatos, datos);
    }

    @Override
    public void inicio(PrincipalUIPro padre) {
        try {
            auxiliar.inicio(padre);
            ReconstruirIdxCli prog = new ReconstruirIdxCli();
            prog.setPrincipalPro(padre.getServidor());
            prog.reiniciarSesionCobol();
            setDatos(prog);
            setVisible(true);
            refresh();
        } catch (Exception ex) {
            Logger.getLogger(ReconstruirIdxFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public boolean puedosalir() {
        return auxiliar.puedosalir();
    }

    @Override
    public void fin() {
        if (puedosalir()) {
            auxiliar.fin();
        }
    }

    private void empezar() {
        try {
            datos.guardarFicheroCobolFiltro();
        } catch (Exception ex) {
            Logger.getLogger(ReconstruirIdxFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        Thread t = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    listadoBarra1.setF4(false);
                    Cursor antcursor = getCursor();
                    setCursor(new Cursor(Cursor.WAIT_CURSOR));
                    auxiliar.getPadre().ensenaInfos(true);
                    ReconstruirIdxGenCli generador = new ReconstruirIdxGenCli();
                    generador.setPrincipalPro(getDatos().getPrincipalPro());
                    generador.guardarFiltros(getDatos().getFicheroCobolFiltro());
                    generador.preparado();
                    generador.procesar();
                    setCursor(antcursor);
                    listadoBarra1.setF4(true);
                    auxiliar.getPadre().ensenaInfos(false);
                    refresh();
                } catch (Exception ex) {
                    Logger.getLogger(ReconstruirIdxFrame.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
        t.start();
    }

    @Override
    public boolean isIniciado() {
        return auxiliar.isIniciado();
    }

    @Override
    public void rellama() {
        setState(0);
        setVisible(true);
    }

    private void reconstruyeExterno() {
        SwingUtilities.invokeLater(new Runnable() {

            @Override
            public void run() {
                try {
                    datos.getFicheroCobolFiltro().toExtern();
                    refresh();
                } catch (Exception ex) {
                    Logger.getLogger(ReconstruirIdxFrame.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
        
    }
}
