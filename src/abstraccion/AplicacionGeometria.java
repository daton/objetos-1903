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
       c.setLado(-7);
       c.calcularArea();
        System.out.println("El area es "+c.getValorArea());
        
        //Triangulo
        Triangulo t=new Triangulo();
        t.setAltura(5);
        t.setBase(6);
        t.calcularArea();
        t.calcularPerimetro();
        System.out.println("El area del triangulo es "+t.getValorArea());
         System.out.println("El perimetro del triangulo es "+t.getValorPerimetro());
        
        
        Cuadrado c2=new Cuadrado();
        c2.setLado(8);
        c2.calcularPerimetro();
   System.out.println("El perimetros del cuadrado es "+c2.getValorPerimetro());
   
   

        
        
    }
}
