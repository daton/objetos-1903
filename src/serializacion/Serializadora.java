/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serializacion;

import java.io.*;
public class Serializadora {
   
    
    public void serializar(Alumno a)throws Exception{
        
        //Primer paso es generar el archivo fisico
        File file=new File("jajaja");
        
        //Indicamos si entrara o saldra ese archivo de la app
        //En este este caso saldra (output)
        FileOutputStream fos=new FileOutputStream(file); 
        
        //Generar el contenedor del objeto y guardar el objeto
        ObjectOutputStream oos=new  ObjectOutputStream(fos);
        //Lo metemos a la caja
        oos.writeObject(a);  
        
    }
   /**
    * Ese es un comentario de tipo documentacion
    * ESte método sirve para leer o recuperar el alumno que hayamos
    * guardado con el método de arriba
    */ 
    public Alumno leer()throws Exception{
        //Paso 1 abrimos el archivo
        File file=new File("jajaja");
        //Paso 2. Establecemos el flujo de la informacion
      FileInputStream fis=new FileInputStream(file);
      //Leemos el objeto
      ObjectInputStream ois=new ObjectInputStream(fis);
      //Se hace la lectura
     Alumno a=(Alumno)ois.readObject();
     return a;
    }
    
}
