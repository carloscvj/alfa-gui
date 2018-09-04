/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package es.cvjpy.util;

import es.cvjpy.GuiPro;
import es.cvjpy.PrincipalUIPro;
import java.awt.Component;
import java.io.Serializable;

/**
 *
 * @author CarlosVJ
 */
public class ModeloGuiPro implements GuiPro, Serializable {

    private final Component este;
    private PrincipalUIPro padre;
    private boolean iniciado;

    public ModeloGuiPro(Component este) {
        this.este = este;
    }

    @Override
    public void inicio(PrincipalUIPro padre) {
        this.padre = padre;
        this.iniciado = true;
    }

    @Override
    public boolean puedosalir() {
        return true;
    }

    @Override
    public void fin() {
        if (puedosalir()) {
            este.setVisible(false);
            getPadre().remover((GuiPro) este);
        }
    }

    public PrincipalUIPro getPadre() {
        return padre;
    }

    @Override
    public boolean isIniciado() {
        return iniciado;
    }

    @Override
    public void rellama() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
