/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package excepciones;


public class NumeroNegativoException extends Exception{
    
    public NumeroNegativoException(){
        //Como primer renglon invocamos al constructor del papa
        super("Lo siento no acepto numero negativo");
    }
}
