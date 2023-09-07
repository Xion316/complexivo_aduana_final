/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

/**
 *
 * @author hack2
 */
public class excepcion_custom extends Exception{

    public excepcion_custom() {
    }

    public excepcion_custom(String string) {
        super(string);
    }

    public excepcion_custom(String string, Throwable thrwbl) {
        super(string, thrwbl);
    }

    public excepcion_custom(Throwable thrwbl) {
        super(thrwbl);
    }

    public excepcion_custom(String string, Throwable thrwbl, boolean bln, boolean bln1) {
        super(string, thrwbl, bln, bln1);
    }
    
}
