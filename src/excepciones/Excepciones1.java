/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package excepciones;


public class Excepciones1 {
    public static void main(String[] args) {
        //Primero veremos las que no nos ayuda
        //el compilador
        try{
        int []x={0,4,-5,8};
       
        System.err.println(x[0]);
        System.out.println(x[1]);
        System.out.println(x[2]);
        int a=0;
        int b=2;
        System.out.println(b/a);
        }catch(Exception e){
        System.out.println("Esto ocurrio "+e.getMessage());     
        }
    }
}
