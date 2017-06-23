/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Componentes;

import java.awt.event.KeyEvent;
import javax.swing.JTextField;

/**
 *
 * @author root
 */
public class ValidarIngresoCelda {
    public static void validar(JTextField j, KeyEvent evt){
       if(Character.isLetter(evt.getKeyChar())) {
            evt.consume();
        }
        if (j.getText().length() == 1) {
            evt.consume();
        }
        if (Character.isSpace(evt.getKeyChar())) {
            evt.consume();
        }
    } 
}
