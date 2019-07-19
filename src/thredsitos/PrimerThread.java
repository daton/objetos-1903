/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thredsitos;

/**
 *
 * @author juan_
 */
//1. - Heredando la clase Thread
public class PrimerThread extends Thread{
    public void run(){
        System.out.println("Hola soy un thread y no hago nada, me llamo "
                + Thread.currentThread().getName());
    }
}
