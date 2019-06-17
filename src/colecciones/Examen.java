/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colecciones;

import java.util.*;
public class Examen {
    public static void main(String[] args) {
      //Primero generamos las opciones de cada pregunta
      //Pregunta 1
      Opcion op11=new Opcion();
      op11.setTitulo("México"); 
      op11.setCorrecta(false);
      
       Opcion op21=new Opcion("Moscu",false);
  
      
       Opcion op31=new Opcion();
      op31.setTitulo("El Cairo"); 
      op31.setCorrecta(true);
      
       Opcion op41=new Opcion();
      op41.setTitulo("Mizcalco"); 
      op41.setCorrecta(false);
      
      //Opciones de la segunda pregunta
      
      Opcion op12=new Opcion("Atlantico", true);
      Opcion op22=new Opcion("Artico", false);
      Opcion op32=new Opcion("Pacifico", true);
      Opcion op42=new Opcion("Indico",false);
      Opcion op52=new Opcion("Antartico", false);
      
      //Ahora generamos las opciones para la primer pregunta
      Pregunta p1=new Pregunta();
      p1.setTitulo("Capital de Egipto");
      //ESto es lo interesante
     
      p1.setOpciones(Arrays.asList(op11,op21,op31,op41)); 
      //Para la pregunta 2
      Pregunta  p2=new Pregunta();
      p2.setTitulo("Oceanos que rodean a México");
      p2.setOpciones(Arrays.asList(op12, op22,op32,op42,op52));
           
      
      //Agregar las preguntas al cuetionario
      Cuestionario c=new Cuestionario();
      c.setPreguntas(Arrays.asList(p1,p2)); 
      
      //Para comprobar mostramos el cuestionario
      for(Pregunta p:c.getPreguntas()){
          System.out.println(p.getTitulo());
          for(Opcion o:p.getOpciones()){
              System.out.println(o.getTitulo());
          }
      }
      
        
        
        
    }
}
