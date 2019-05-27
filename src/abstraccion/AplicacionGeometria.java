/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstraccion;

/**
 *
 * @author campitos
 */
public class AplicacionGeometria {
    public static void main(String[] args) {
        Cuadrado c=new Cuadrado();
       c.setLado(7);
       c.calcular();
        System.out.println("El area es "+c.getValorArea());
    }
}
