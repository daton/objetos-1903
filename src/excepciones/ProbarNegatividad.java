/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package excepciones;

import java.util.logging.Level;
import java.util.logging.Logger;


public class ProbarNegatividad {
    public static void main(String[] args) {
        
        try { 
            Validaciones.validarNegatividad(-4.5f);
            System.out.println("NO hubo excepción");
        } catch (NumeroNegativoException ex) {
            System.out.println("SI hubo excepcion :'(  "+ex.getMessage()); 
        }
        
    }
}
