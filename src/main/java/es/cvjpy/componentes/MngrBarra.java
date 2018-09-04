/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * MntoBarra.java
 *
 * Created on 28-may-2010, 11:31:50
 */
package es.cvjpy.componentes;

import es.cvjpy.MngrCliPro;
import java.awt.Cursor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.ActionMap;
import javax.swing.ComponentInputMap;
import javax.swing.InputMap;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.KeyStroke;
import javax.swing.SwingUtilities;
import javax.swing.plaf.ActionMapUIResource;

/**
 *
 * @author CarlosVJ
 */
public class MngrBarra extends javax.swing.JPanel {

    /**
     * Creates new form MntoBarra
     */
    public MngrBarra() {
        initComponents();
        lasteclas();
    }

    private void lasteclas() {
        InputMap keyMap;
        ActionMap actionMap;

        Action escapeaction = new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                botonsalir();
            }
        };
        Action f1action = new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                botonayuda();
            }
        };
        Action f2action = new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                botonbuscar();
            }
        };
        Action f3action = new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                botonguardar();
            }
        };
        Action f4action = new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                botonactualizar();
            }
        };
        Action f5action = new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                botonnuevo();
            }
        };
        Action f6action = new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                botonborrar();
            }
        };
        Action f7action = new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                botonimprimir();
            }
        };
        Action f8action = new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                botoninternet();
            }
        };
        Action inicioaction = new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                botonprimero();
            }
        };
        Action repagaction = new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                botonanterior();
            }
        };
        Action avpagaction = new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                botonsiguiente();
            }
        };
        Action finaction = new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                botonultimo();
            }
        };


        keyMap = new ComponentInputMap(botonesc);
        keyMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_ESCAPE, 0), "escape");
        actionMap = new ActionMapUIResource();
        actionMap.put("escape", escapeaction);
        SwingUtilities.replaceUIActionMap(botonesc, actionMap);
        SwingUtilities.replaceUIInputMap(botonesc, JComponent.WHEN_IN_FOCUSED_WINDOW, keyMap);

        keyMap = new ComponentInputMap(botonF1);
        keyMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_F1, 0), "f1");
        actionMap = new ActionMapUIResource();
        actionMap.put("f1", f1action);
        SwingUtilities.replaceUIActionMap(botonF1, actionMap);
        SwingUtilities.replaceUIInputMap(botonF1, JComponent.WHEN_IN_FOCUSED_WINDOW, keyMap);

        keyMap = new ComponentInputMap(botonF2);
        keyMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_F2, 0), "f2");
        actionMap = new ActionMapUIResource();
        actionMap.put("f2", f2action);
        SwingUtilities.replaceUIActionMap(botonF2, actionMap);
        SwingUtilities.replaceUIInputMap(botonF2, JComponent.WHEN_IN_FOCUSED_WINDOW, keyMap);

        keyMap = new ComponentInputMap(botonF3);
        keyMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_F3, 0), "f3");
        actionMap = new ActionMapUIResource();
        actionMap.put("f3", f3action);
        SwingUtilities.replaceUIActionMap(botonF3, actionMap);
        SwingUtilities.replaceUIInputMap(botonF3, JComponent.WHEN_IN_FOCUSED_WINDOW, keyMap);

        keyMap = new ComponentInputMap(botonF4);
        keyMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_F4, 0), "f4");
        actionMap = new ActionMapUIResource();
        actionMap.put("f4", f4action);
        SwingUtilities.replaceUIActionMap(botonF4, actionMap);
        SwingUtilities.replaceUIInputMap(botonF4, JComponent.WHEN_IN_FOCUSED_WINDOW, keyMap);

        keyMap = new ComponentInputMap(botonF5);
        keyMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_F5, 0), "f5");
        actionMap = new ActionMapUIResource();
        actionMap.put("f5", f5action);
        SwingUtilities.replaceUIActionMap(botonF5, actionMap);
        SwingUtilities.replaceUIInputMap(botonF5, JComponent.WHEN_IN_FOCUSED_WINDOW, keyMap);

        keyMap = new ComponentInputMap(botonF6);
        keyMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_F6, 0), "f6");
        actionMap = new ActionMapUIResource();
        actionMap.put("f6", f6action);
        SwingUtilities.replaceUIActionMap(botonF6, actionMap);
        SwingUtilities.replaceUIInputMap(botonF6, JComponent.WHEN_IN_FOCUSED_WINDOW, keyMap);

        keyMap = new ComponentInputMap(botonF7);
        keyMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_F7, 0), "f7");
        actionMap = new ActionMapUIResource();
        actionMap.put("f7", f7action);
        SwingUtilities.replaceUIActionMap(botonF7, actionMap);
        SwingUtilities.replaceUIInputMap(botonF7, JComponent.WHEN_IN_FOCUSED_WINDOW, keyMap);

        keyMap = new ComponentInputMap(botonF8);
        keyMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_F8, 0), "f8");
        actionMap = new ActionMapUIResource();
        actionMap.put("f8", f8action);
        SwingUtilities.replaceUIActionMap(botonF8, actionMap);
        SwingUtilities.replaceUIInputMap(botonF8, JComponent.WHEN_IN_FOCUSED_WINDOW, keyMap);

        keyMap = new ComponentInputMap(botonprimero);
        keyMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_HOME, KeyEvent.CTRL_MASK), "inicio");
        actionMap = new ActionMapUIResource();
        actionMap.put("inicio", inicioaction);
        SwingUtilities.replaceUIActionMap(botonprimero, actionMap);
        SwingUtilities.replaceUIInputMap(botonprimero, JComponent.WHEN_IN_FOCUSED_WINDOW, keyMap);

        keyMap = new ComponentInputMap(botonanterior);
        keyMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_PAGE_UP, KeyEvent.CTRL_MASK), "repag");
        actionMap = new ActionMapUIResource();
        actionMap.put("repag", repagaction);
        SwingUtilities.replaceUIActionMap(botonanterior, actionMap);
        SwingUtilities.replaceUIInputMap(botonanterior, JComponent.WHEN_IN_FOCUSED_WINDOW, keyMap);

        keyMap = new ComponentInputMap(botonsiguiente);
        keyMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_PAGE_DOWN, KeyEvent.CTRL_MASK), "avpag");
        actionMap = new ActionMapUIResource();
        actionMap.put("avpag", avpagaction);
        SwingUtilities.replaceUIActionMap(botonsiguiente, actionMap);
        SwingUtilities.replaceUIInputMap(botonsiguiente, JComponent.WHEN_IN_FOCUSED_WINDOW, keyMap);

        keyMap = new ComponentInputMap(botonultimo);
        keyMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_END, KeyEvent.CTRL_MASK), "fin");
        actionMap = new ActionMapUIResource();
        actionMap.put("fin", finaction);
        SwingUtilities.replaceUIActionMap(botonultimo, actionMap);
        SwingUtilities.replaceUIInputMap(botonultimo, JComponent.WHEN_IN_FOCUSED_WINDOW, keyMap);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        teclasPanel = new javax.swing.JPanel();
        botonesc = new javax.swing.JButton();
        botonF1 = new javax.swing.JButton();
        botonF2 = new javax.swing.JButton();
        botonF3 = new javax.swing.JButton();
        botonF4 = new javax.swing.JButton();
        botonF5 = new javax.swing.JButton();
        botonF6 = new javax.swing.JButton();
        botonF7 = new javax.swing.JButton();
        botonF8 = new javax.swing.JButton();
        navegarPanel = new javax.swing.JPanel();
        botonprimero = new javax.swing.JButton();
        botonanterior = new javax.swing.JButton();
        botonsiguiente = new javax.swing.JButton();
        botonultimo = new javax.swing.JButton();
        imagenPanel = new javax.swing.JPanel();
        botonimagen = new javax.swing.JButton();

        setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 0, 0));

        java.util.ResourceBundle bundle = java.util.ResourceBundle.getBundle("alfalit"); // NOI18N
        teclasPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, bundle.getString("Accion"), javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 0, 10))); // NOI18N
        teclasPanel.setOpaque(false);

        botonesc.setFont(botonesc.getFont().deriveFont((botonesc.getFont().getStyle() & ~java.awt.Font.ITALIC) & ~java.awt.Font.BOLD, botonesc.getFont().getSize()-2));
        botonesc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/es/alfamicroges/resources/Salir16.gif"))); // NOI18N
        botonesc.setText(bundle.getString("Esc")); // NOI18N
        botonesc.setToolTipText(bundle.getString("Salir")); // NOI18N
        botonesc.setActionCommand("ESC");
        botonesc.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        botonesc.setFocusable(false);
        botonesc.setPreferredSize(new java.awt.Dimension(50, 25));
        botonesc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonescActionPerformed(evt);
            }
        });
        teclasPanel.add(botonesc);

        botonF1.setFont(botonF1.getFont().deriveFont((botonF1.getFont().getStyle() & ~java.awt.Font.ITALIC) & ~java.awt.Font.BOLD, botonF1.getFont().getSize()-2));
        botonF1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/es/alfamicroges/resources/Ayuda16.gif"))); // NOI18N
        botonF1.setText(bundle.getString("F1")); // NOI18N
        botonF1.setToolTipText(bundle.getString("Ayuda")); // NOI18N
        botonF1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        botonF1.setFocusable(false);
        botonF1.setPreferredSize(new java.awt.Dimension(40, 25));
        botonF1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonF1ActionPerformed(evt);
            }
        });
        teclasPanel.add(botonF1);

        botonF2.setFont(botonF2.getFont().deriveFont((botonF2.getFont().getStyle() & ~java.awt.Font.ITALIC) & ~java.awt.Font.BOLD, botonF2.getFont().getSize()-2));
        botonF2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/es/alfamicroges/resources/Buscar16.gif"))); // NOI18N
        botonF2.setText(bundle.getString("F2")); // NOI18N
        botonF2.setToolTipText(bundle.getString("Buscar")); // NOI18N
        botonF2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        botonF2.setFocusable(false);
        botonF2.setPreferredSize(new java.awt.Dimension(40, 25));
        botonF2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonF2ActionPerformed(evt);
            }
        });
        teclasPanel.add(botonF2);

        botonF3.setFont(botonF3.getFont().deriveFont((botonF3.getFont().getStyle() & ~java.awt.Font.ITALIC) & ~java.awt.Font.BOLD, botonF3.getFont().getSize()-2));
        botonF3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/es/alfamicroges/resources/Salva16.gif"))); // NOI18N
        botonF3.setText(bundle.getString("F3")); // NOI18N
        botonF3.setToolTipText(bundle.getString("Guardar")); // NOI18N
        botonF3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        botonF3.setFocusable(false);
        botonF3.setPreferredSize(new java.awt.Dimension(40, 25));
        botonF3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonF3ActionPerformed(evt);
            }
        });
        teclasPanel.add(botonF3);

        botonF4.setFont(botonF4.getFont().deriveFont((botonF4.getFont().getStyle() & ~java.awt.Font.ITALIC) & ~java.awt.Font.BOLD, botonF4.getFont().getSize()-2));
        botonF4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/es/alfamicroges/resources/Actualiza16.png"))); // NOI18N
        botonF4.setText(bundle.getString("F4")); // NOI18N
        botonF4.setToolTipText(bundle.getString("Actualizar")); // NOI18N
        botonF4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        botonF4.setFocusable(false);
        botonF4.setPreferredSize(new java.awt.Dimension(40, 25));
        botonF4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonF4ActionPerformed(evt);
            }
        });
        teclasPanel.add(botonF4);

        botonF5.setFont(botonF5.getFont().deriveFont((botonF5.getFont().getStyle() & ~java.awt.Font.ITALIC) & ~java.awt.Font.BOLD, botonF5.getFont().getSize()-2));
        botonF5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/es/alfamicroges/resources/Nuevo16.gif"))); // NOI18N
        botonF5.setText(bundle.getString("F5")); // NOI18N
        botonF5.setToolTipText(bundle.getString("Nuevo")); // NOI18N
        botonF5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        botonF5.setFocusable(false);
        botonF5.setPreferredSize(new java.awt.Dimension(40, 25));
        botonF5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonF5ActionPerformed(evt);
            }
        });
        teclasPanel.add(botonF5);

        botonF6.setFont(botonF6.getFont().deriveFont((botonF6.getFont().getStyle() & ~java.awt.Font.ITALIC) & ~java.awt.Font.BOLD, botonF6.getFont().getSize()-2));
        botonF6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/es/alfamicroges/resources/Borra16.gif"))); // NOI18N
        botonF6.setText(bundle.getString("F6")); // NOI18N
        botonF6.setToolTipText(bundle.getString("Borrar")); // NOI18N
        botonF6.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        botonF6.setFocusable(false);
        botonF6.setPreferredSize(new java.awt.Dimension(40, 25));
        botonF6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonF6ActionPerformed(evt);
            }
        });
        teclasPanel.add(botonF6);

        botonF7.setFont(botonF7.getFont().deriveFont((botonF7.getFont().getStyle() & ~java.awt.Font.ITALIC) & ~java.awt.Font.BOLD, botonF7.getFont().getSize()-2));
        botonF7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/es/alfamicroges/resources/Listado16.gif"))); // NOI18N
        botonF7.setText(bundle.getString("F7")); // NOI18N
        botonF7.setToolTipText(bundle.getString("Imprimir")); // NOI18N
        botonF7.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        botonF7.setFocusable(false);
        botonF7.setPreferredSize(new java.awt.Dimension(40, 25));
        botonF7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonF7ActionPerformed(evt);
            }
        });
        teclasPanel.add(botonF7);

        botonF8.setFont(botonF8.getFont().deriveFont((botonF8.getFont().getStyle() & ~java.awt.Font.ITALIC) & ~java.awt.Font.BOLD, botonF8.getFont().getSize()-2));
        botonF8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/es/alfamicroges/resources/Internet16.png"))); // NOI18N
        botonF8.setText(bundle.getString("F8")); // NOI18N
        botonF8.setToolTipText(bundle.getString("Importar")); // NOI18N
        botonF8.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        botonF8.setFocusable(false);
        botonF8.setPreferredSize(new java.awt.Dimension(40, 25));
        botonF8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonF8ActionPerformed(evt);
            }
        });
        teclasPanel.add(botonF8);

        add(teclasPanel);

        navegarPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, bundle.getString("Desplazamiento"), javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 0, 10))); // NOI18N
        navegarPanel.setOpaque(false);

        botonprimero.setFont(botonprimero.getFont().deriveFont((botonprimero.getFont().getStyle() & ~java.awt.Font.ITALIC) & ~java.awt.Font.BOLD, botonprimero.getFont().getSize()-2));
        botonprimero.setIcon(new javax.swing.ImageIcon(getClass().getResource("/es/alfamicroges/resources/Primero.gif"))); // NOI18N
        botonprimero.setText(bundle.getString("Primero")); // NOI18N
        botonprimero.setToolTipText(bundle.getString("Pulse_Ctrl_Inicio")); // NOI18N
        botonprimero.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        botonprimero.setFocusable(false);
        botonprimero.setPreferredSize(new java.awt.Dimension(75, 25));
        botonprimero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonprimeroActionPerformed(evt);
            }
        });
        navegarPanel.add(botonprimero);

        botonanterior.setFont(botonanterior.getFont().deriveFont((botonanterior.getFont().getStyle() & ~java.awt.Font.ITALIC) & ~java.awt.Font.BOLD, botonanterior.getFont().getSize()-2));
        botonanterior.setIcon(new javax.swing.ImageIcon(getClass().getResource("/es/alfamicroges/resources/Anterior.gif"))); // NOI18N
        botonanterior.setText(bundle.getString("Anterior")); // NOI18N
        botonanterior.setToolTipText(bundle.getString("Pulse_Ctrl_RePag")); // NOI18N
        botonanterior.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        botonanterior.setFocusable(false);
        botonanterior.setPreferredSize(new java.awt.Dimension(75, 25));
        botonanterior.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        botonanterior.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonanteriorActionPerformed(evt);
            }
        });
        navegarPanel.add(botonanterior);

        botonsiguiente.setFont(botonsiguiente.getFont().deriveFont((botonsiguiente.getFont().getStyle() & ~java.awt.Font.ITALIC) & ~java.awt.Font.BOLD, botonsiguiente.getFont().getSize()-2));
        botonsiguiente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/es/alfamicroges/resources/Siguiente.gif"))); // NOI18N
        botonsiguiente.setText(bundle.getString("Siguiente")); // NOI18N
        botonsiguiente.setToolTipText(bundle.getString("Pulse_Ctrl_AvPag")); // NOI18N
        botonsiguiente.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        botonsiguiente.setFocusable(false);
        botonsiguiente.setPreferredSize(new java.awt.Dimension(75, 25));
        botonsiguiente.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        botonsiguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonsiguienteActionPerformed(evt);
            }
        });
        navegarPanel.add(botonsiguiente);

        botonultimo.setFont(botonultimo.getFont().deriveFont((botonultimo.getFont().getStyle() & ~java.awt.Font.ITALIC) & ~java.awt.Font.BOLD, botonultimo.getFont().getSize()-2));
        botonultimo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/es/alfamicroges/resources/Ultimo.gif"))); // NOI18N
        botonultimo.setText(bundle.getString("Ultimo")); // NOI18N
        botonultimo.setToolTipText(bundle.getString("Pulse_Ctrl_Fin")); // NOI18N
        botonultimo.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        botonultimo.setFocusable(false);
        botonultimo.setPreferredSize(new java.awt.Dimension(75, 25));
        botonultimo.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        botonultimo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonultimoActionPerformed(evt);
            }
        });
        navegarPanel.add(botonultimo);

        add(navegarPanel);

        imagenPanel.setOpaque(false);

        botonimagen.setFont(botonimagen.getFont().deriveFont((botonimagen.getFont().getStyle() & ~java.awt.Font.ITALIC) & ~java.awt.Font.BOLD, botonimagen.getFont().getSize()-2));
        botonimagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/es/alfamicroges/resources/AlfaLogo16.jpg"))); // NOI18N
        botonimagen.setText(bundle.getString("Imagen")); // NOI18N
        botonimagen.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        botonimagen.setFocusable(false);
        botonimagen.setPreferredSize(new java.awt.Dimension(70, 25));
        botonimagen.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        botonimagen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonimagenActionPerformed(evt);
            }
        });
        imagenPanel.add(botonimagen);

        add(imagenPanel);
    }// </editor-fold>//GEN-END:initComponents

    private void botonescActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonescActionPerformed
        botonsalir();
}//GEN-LAST:event_botonescActionPerformed

    private void botonF1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonF1ActionPerformed
        botonayuda();
}//GEN-LAST:event_botonF1ActionPerformed

    private void botonF2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonF2ActionPerformed
        botonbuscar();
}//GEN-LAST:event_botonF2ActionPerformed

    private void botonF3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonF3ActionPerformed
        botonguardar();
}//GEN-LAST:event_botonF3ActionPerformed

    private void botonF4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonF4ActionPerformed
        botonactualizar();
}//GEN-LAST:event_botonF4ActionPerformed

    private void botonF5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonF5ActionPerformed
        botonnuevo();
}//GEN-LAST:event_botonF5ActionPerformed

    private void botonF6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonF6ActionPerformed
        botonborrar();
}//GEN-LAST:event_botonF6ActionPerformed

    private void botonF7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonF7ActionPerformed
        botonimprimir();
}//GEN-LAST:event_botonF7ActionPerformed

    private void botonF8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonF8ActionPerformed
        botoninternet();
}//GEN-LAST:event_botonF8ActionPerformed

    private void botonprimeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonprimeroActionPerformed
        botonprimero();
}//GEN-LAST:event_botonprimeroActionPerformed

    private void botonanteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonanteriorActionPerformed
        botonanterior();
}//GEN-LAST:event_botonanteriorActionPerformed

    private void botonsiguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonsiguienteActionPerformed
        botonsiguiente();
}//GEN-LAST:event_botonsiguienteActionPerformed

    private void botonultimoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonultimoActionPerformed
        botonultimo();
}//GEN-LAST:event_botonultimoActionPerformed

    private void botonimagenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonimagenActionPerformed
        botonimagen();
}//GEN-LAST:event_botonimagenActionPerformed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    protected javax.swing.JButton botonF1;
    protected javax.swing.JButton botonF2;
    protected javax.swing.JButton botonF3;
    protected javax.swing.JButton botonF4;
    protected javax.swing.JButton botonF5;
    protected javax.swing.JButton botonF6;
    protected javax.swing.JButton botonF7;
    protected javax.swing.JButton botonF8;
    protected javax.swing.JButton botonanterior;
    protected javax.swing.JButton botonesc;
    protected javax.swing.JButton botonimagen;
    protected javax.swing.JButton botonprimero;
    protected javax.swing.JButton botonsiguiente;
    protected javax.swing.JButton botonultimo;
    private javax.swing.JPanel imagenPanel;
    private javax.swing.JPanel navegarPanel;
    private javax.swing.JPanel teclasPanel;
    // End of variables declaration//GEN-END:variables
    private MngrCliPro datos;
    public static final String PROP_DATOS = "datos";

    public MngrCliPro getDatos() {
        return datos;
    }

    public void setDatos(MngrCliPro datos) {
        MngrCliPro oldDatos = this.datos;
        this.datos = datos;
        firePropertyChange(PROP_DATOS, oldDatos, datos);
    }
    private List<ActionListener> escuchas;

    private List<ActionListener> getEscuchas() {
        if (escuchas == null) {
            escuchas = new ArrayList();
        }
        return escuchas;
    }

    public void addActionListener(ActionListener al) {
        this.getEscuchas().add(al);
    }

    public void removeActionListener(ActionListener al) {
        this.getEscuchas().remove(al);
    }

    public void removeActionListenerAll() {
        this.escuchas = null;
    }

    private void fireActionPerformed(JButton boton) {
        ActionEvent ae = new ActionEvent(boton, boton.hashCode(), boton.getActionCommand());
        for (ActionListener uno : getEscuchas()) {
            uno.actionPerformed(ae);
        }
    }

    private void botonsalir() {
        this.fireActionPerformed(botonesc);
    }

    private void botonayuda() {
        this.fireActionPerformed(botonF1);
    }
    private JDialog bqda;

    public JDialog getBqda() {
        return bqda;
    }

    public void setBqda(JDialog bqda) {
        this.bqda = bqda;
    }

    private void botonbuscar() {
        if (getBqda() != null) {
            getDatos().relista();
            getDatos().paginaPrimera();
        }
        this.fireActionPerformed(botonF2);
        if (getBqda() != null) {
            getBqda().setVisible(true);
        }
    }

    private void botonguardar() {
        try {
            Cursor antcursor = getCursor();
            setCursor(new Cursor(Cursor.WAIT_CURSOR));
            getDatos().guardar();
            fireActionPerformed(botonF3);
            setCursor(antcursor);
        } catch (Exception ex) {
            Logger.getLogger(MngrBarra.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void botonactualizar() {
        this.fireActionPerformed(botonF4);
    }

    private void botonnuevo() {
        Cursor antcursor = getCursor();
        setCursor(new Cursor(Cursor.WAIT_CURSOR));
        getDatos().nuevo();
        fireActionPerformed(botonF5);
        setCursor(antcursor);
    }

    private void botonborrar() {
        Cursor antcursor = getCursor();
        setCursor(new Cursor(Cursor.WAIT_CURSOR));
        int sino = JOptionPane.showConfirmDialog(this, getTextoSeguro());
        if (sino == 0) {
            try {
                getDatos().borrar();
                fireActionPerformed(botonF6);
            } catch (Exception ex) {
                Logger.getLogger(MngrBarra.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        setCursor(antcursor);
    }

    private void botonimprimir() {
        fireActionPerformed(botonF7);
    }

    private void botoninternet() {
        fireActionPerformed(botonF8);
    }

    private void botonprimero() {
        Cursor antcursor = getCursor();
        setCursor(new Cursor(Cursor.WAIT_CURSOR));
        getDatos().primero();
        fireActionPerformed(botonprimero);
        setCursor(antcursor);
    }

    private void botonanterior() {
        Cursor antcursor = getCursor();
        setCursor(new Cursor(Cursor.WAIT_CURSOR));
        getDatos().anterior();
        fireActionPerformed(botonanterior);
        setCursor(antcursor);
    }

    private void botonsiguiente() {
        Cursor antcursor = getCursor();
        setCursor(new Cursor(Cursor.WAIT_CURSOR));
        getDatos().siguiente();
        fireActionPerformed(botonsiguiente);
        setCursor(antcursor);
    }

    private void botonultimo() {
        Cursor antcursor = getCursor();
        setCursor(new Cursor(Cursor.WAIT_CURSOR));
        getDatos().ultimo();
        fireActionPerformed(botonultimo);
        setCursor(antcursor);
    }

    private void botonimagen() {
        fireActionPerformed(botonimagen);
    }

    public boolean isEscape() {
        return botonesc.isVisible();
    }

    public void setEscape(boolean flag) {
        botonesc.setVisible(flag);
    }

    public boolean isF1() {
        return botonF1.isVisible();
    }

    public void setF1(boolean flag) {
        botonF1.setVisible(flag);
    }

    public boolean isF2() {
        return botonF2.isVisible();
    }

    public void setF2(boolean flag) {
        botonF2.setVisible(flag);
    }

    public boolean isF3() {
        return botonF3.isVisible();
    }

    public void setF3(boolean flag) {
        botonF3.setVisible(flag);
    }

    public boolean isF4() {
        return botonF4.isVisible();
    }

    public void setF4(boolean flag) {
        botonF4.setVisible(flag);
    }

    public boolean isF5() {
        return botonF5.isVisible();
    }

    public void setF5(boolean flag) {
        botonF5.setVisible(flag);
    }

    public boolean isF6() {
        return botonF6.isVisible();
    }

    public void setF6(boolean flag) {
        botonF6.setVisible(flag);
    }

    public boolean isF7() {
        return botonF7.isVisible();
    }

    public void setF7(boolean flag) {
        botonF7.setVisible(flag);
    }

    public boolean isF8() {
        return botonF8.isVisible();
    }

    public void setF8(boolean flag) {
        botonF8.setVisible(flag);
    }

    public boolean isNavegable() {
        return navegarPanel.isVisible();
    }

    public void setNavegable(boolean flag) {
        navegarPanel.setVisible(flag);
    }

    public boolean isPrimerable() {
        return botonprimero.isVisible();
    }

    public void setPrimerable(boolean flag) {
        botonprimero.setVisible(flag);
    }

    public boolean isUltimable() {
        return botonultimo.isVisible();
    }

    public void setUltimable(boolean flag) {
        botonultimo.setVisible(flag);
    }

    public boolean isImaginable() {
        return imagenPanel.isVisible();
    }

    public void setImaginable(boolean flag) {
        imagenPanel.setVisible(flag);
    }

    public String getTextF2() {
        return botonF2.getToolTipText();
    }

    public void setTextF2(String text) {
        botonF2.setToolTipText(text);
    }

    public String getTextF3() {
        return botonF3.getToolTipText();
    }

    public void setTextF3(String text) {
        botonF3.setToolTipText(text);
    }

    public String getTextF4() {
        return botonF4.getToolTipText();
    }

    public void setTextF4(String text) {
        botonF4.setToolTipText(text);
    }

    public String getTextF5() {
        return botonF5.getToolTipText();
    }

    public void setTextF5(String text) {
        botonF5.setToolTipText(text);
    }

    public String getTextF6() {
        return botonF6.getToolTipText();
    }

    public void setTextF6(String text) {
        botonF6.setToolTipText(text);
    }

    public String getTextF7() {
        return botonF7.getToolTipText();
    }

    public void setTextF7(String text) {
        botonF7.setToolTipText(text);
    }

    public String getTextF8() {
        return botonF8.getToolTipText();
    }

    public void setTextF8(String text) {
        botonF8.setToolTipText(text);
    }

    public boolean isEnabledF3() {
        return botonF3.isEnabled();
    }

    public void setEnabledF3(boolean siono) {
        botonF3.setEnabled(siono);
    }
    private String textoSeguro = ResourceBundle.getBundle("alfalit").getString("Seguro_que_lo_quiere_borrar");

    public String getTextoSeguro() {
        return textoSeguro;
    }

    public void setTextoSeguro(String textoSeguro) {
        this.textoSeguro = textoSeguro;
    }
}
