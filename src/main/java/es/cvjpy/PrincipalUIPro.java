/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package es.cvjpy;

import java.awt.Image;
import javax.swing.JMenuBar;

/**
 *
 * @author CarlosVJ
 */
public interface PrincipalUIPro extends PrincipalCliPro {

    void inicio() throws Exception;

    String getTitulo();

    Image getIcono();

    void remover(GuiPro hijo);

    GuiPro getGui(MenuElemento mitem);

    void reiniciar();

    void ensenaInfos(boolean sino);

    void salir();

    JMenuBar getBarraMenu();

    boolean sePermite(Class mitem) throws Exception;

    void llamarA(GuiPro guiPro);

    void cambioDePreferencias() throws Exception;
}
