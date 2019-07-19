/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serializacion;

import java.io.*;
import java.util.*;
public class Serializadora {
   
    List<Alumno> alumnos;
    
    public Serializadora(){
        alumnos=new ArrayList<>();
    }
    
    public void serializar(Alumno a)throws Exception{
        
        //Primer paso es generar el archivo fisico
        
        File file=new File("jajaja");
        if(file.exists())alumnos=leer();
        
        //Indicamos si entrara o saldra ese archivo de la app
        //En este este caso saldra (output)
        FileOutputStream fos=new FileOutputStream(file); 
        
        //Generar el contenedor del objeto y guardar el objeto
        ObjectOutputStream oos=new  ObjectOutputStream(fos);
        //Antes de guardar agrego al List de alumnos el alumno
        alumnos.add(a);
        //Ahora si, guardo el List de alumnos y con el, al nuevo y todos
        //los que ya estaban
        oos.writeObject(alumnos);  
        
    }
   /**
    * Ese es un comentario de tipo documentacion
    * ESte método sirve para leer o recuperar el alumno que hayamos
    * guardado con el método de arriba
    */ 
    public List<Alumno> leer()throws Exception{
        //Paso 1 abrimos el archivo
        File file=new File("jajaja");
        //Paso 2. Establecemos el flujo de la informacion
      FileInputStream fis=new FileInputStream(file);
      //Leemos el objeto
      ObjectInputStream ois=new ObjectInputStream(fis);
      //Se hace la lectura
     alumnos=(List<Alumno>)ois.readObject();
     return alumnos;
    }
    
}
