/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package es.cvjpy;

import javax.swing.JMenuItem;

/**
 *
 * @author carlos
 */
public class MenuElemento extends JMenuItem {

    private Class gui;

    public MenuElemento() {
    }

    public Class getGui() {
        return gui;
    }

    public void setGui(Class gui) {
        this.gui = gui;
    }

}
