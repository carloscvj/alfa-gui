/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * ProcesoBarra.java
 *
 * Created on 28-may-2010, 11:31:50
 */
package es.cvjpy.componentes;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;
import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.ActionMap;
import javax.swing.ComponentInputMap;
import javax.swing.InputMap;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.KeyStroke;
import javax.swing.SwingUtilities;
import javax.swing.plaf.ActionMapUIResource;

/**
 *
 * @author CarlosVJ
 */
public class ProcesoBarra extends javax.swing.JPanel {

    /**
     * Creates new form ProcesoBarra
     */
    public ProcesoBarra() {
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

        setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 0, 0));

        teclasPanel.setOpaque(false);

        botonesc.setFont(botonesc.getFont().deriveFont((botonesc.getFont().getStyle() & ~java.awt.Font.ITALIC) & ~java.awt.Font.BOLD, botonesc.getFont().getSize()-2));
        botonesc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/es/cvjpy/resources/Salir16.gif"))); // NOI18N
        java.util.ResourceBundle bundle = java.util.ResourceBundle.getBundle("alfalit"); // NOI18N
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
        botonF1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/es/cvjpy/resources/Ayuda16.gif"))); // NOI18N
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
        botonF2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/es/cvjpy/resources/Buscar16.gif"))); // NOI18N
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
        botonF3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/es/cvjpy/resources/Salva16.gif"))); // NOI18N
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
        botonF4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/es/cvjpy/resources/Actualiza16.png"))); // NOI18N
        botonF4.setText(bundle.getString("F4")); // NOI18N
        botonF4.setToolTipText(bundle.getString("Iniciar")); // NOI18N
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
        botonF5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/es/cvjpy/resources/Nuevo16.gif"))); // NOI18N
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
        botonF6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/es/cvjpy/resources/Borra16.gif"))); // NOI18N
        botonF6.setText(bundle.getString("F6")); // NOI18N
        botonF6.setToolTipText(bundle.getString("Limpiar")); // NOI18N
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
        botonF7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/es/cvjpy/resources/Listado16.gif"))); // NOI18N
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
        botonF8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/es/cvjpy/resources/Internet16.png"))); // NOI18N
        botonF8.setText(bundle.getString("F8")); // NOI18N
        botonF8.setToolTipText(bundle.getString("Internet")); // NOI18N
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
    // Variables declaration - do not modify//GEN-BEGIN:variables
    protected javax.swing.JButton botonF1;
    protected javax.swing.JButton botonF2;
    protected javax.swing.JButton botonF3;
    protected javax.swing.JButton botonF4;
    protected javax.swing.JButton botonF5;
    protected javax.swing.JButton botonF6;
    protected javax.swing.JButton botonF7;
    protected javax.swing.JButton botonF8;
    protected javax.swing.JButton botonesc;
    private javax.swing.JPanel teclasPanel;
    // End of variables declaration//GEN-END:variables
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
        for (ActionListener uno : this.getEscuchas()) {
            uno.actionPerformed(ae);
        }
    }

    private void botonsalir() {
        this.fireActionPerformed(botonesc);
    }

    private void botonayuda() {
        this.fireActionPerformed(botonF1);
    }

    private void botonbuscar() {
        this.fireActionPerformed(botonF2);
    }

    private void botonguardar() {
        this.fireActionPerformed(botonF3);
    }

    private void botonactualizar() {
        this.fireActionPerformed(botonF4);
    }

    private void botonnuevo() {
        this.fireActionPerformed(botonF5);
    }

    private void botonborrar() {
        this.fireActionPerformed(botonF6);
    }

    private void botonimprimir() {
        this.fireActionPerformed(botonF7);
    }

    private void botoninternet() {
        this.fireActionPerformed(botonF8);
    }

    public boolean isEscape() {
        return this.botonesc.isVisible();
    }

    public void setEscape(boolean flag) {
        this.botonesc.setVisible(flag);
    }

    public boolean isF1() {
        return this.botonF1.isVisible();
    }

    public void setF1(boolean flag) {
        this.botonF1.setVisible(flag);
    }

    public boolean isF2() {
        return this.botonF2.isVisible();
    }

    public void setF2(boolean flag) {
        this.botonF2.setVisible(flag);
    }

    public boolean isF3() {
        return this.botonF3.isVisible();
    }

    public void setF3(boolean flag) {
        this.botonF3.setVisible(flag);
    }

    public boolean isF4() {
        return this.botonF4.isVisible();
    }

    public void setF4(boolean flag) {
        this.botonF4.setVisible(flag);
    }

    public boolean isF5() {
        return this.botonF5.isVisible();
    }

    public void setF5(boolean flag) {
        this.botonF5.setVisible(flag);
    }

    public boolean isF6() {
        return this.botonF6.isVisible();
    }

    public void setF6(boolean flag) {
        this.botonF6.setVisible(flag);
    }

    public boolean isF7() {
        return this.botonF7.isVisible();
    }

    public void setF7(boolean flag) {
        this.botonF7.setVisible(flag);
    }

    public boolean isF8() {
        return this.botonF8.isVisible();
    }

    public void setF8(boolean flag) {
        this.botonF8.setVisible(flag);
    }

    public String getTextF2() {
        return this.botonF2.getToolTipText();
    }

    public void setTextF2(String text) {
        this.botonF2.setToolTipText(text);
    }

    public String getTextF3() {
        return this.botonF3.getToolTipText();
    }

    public void setTextF3(String text) {
        this.botonF3.setToolTipText(text);
    }

    public String getTextF4() {
        return this.botonF4.getToolTipText();
    }

    public void setTextF4(String text) {
        this.botonF4.setToolTipText(text);
    }

    public String getTextF5() {
        return this.botonF5.getToolTipText();
    }

    public void setTextF5(String text) {
        this.botonF5.setToolTipText(text);
    }
}
