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
public class Probar {
    public static void main(String[] args) {
        PrimerThread t1=new PrimerThread();
        PrimerThread t2=new PrimerThread();
        PrimerThread t3=new PrimerThread();
        t1.start();
        t2.start();
        t3.start();
    }
}
