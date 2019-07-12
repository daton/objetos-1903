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
}
