/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package es.cvjpy;

/**
 *
 * @author CarlosVJ
 */
public interface GuiPro extends java.io.Serializable {

    boolean isIniciado();

    void inicio(PrincipalUIPro padre);

    void rellama();

    boolean puedosalir();

    void fin();
}
