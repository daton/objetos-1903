/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package escuela;


public class Escuela {
    
    public static void main(String[] args) {
        
        //Vamos a crear un alumno 
        Alumno a=new Alumno();
        //Asignamos sus atributos apoyandonos del objeto
        a.setNombre("Juan");
        a.setEmail("juan@gmail.com");
           //Sigue la direccion, para ello primero la creo porque Alumno
                //esta COMPUESTO DE direccion
                Direccion d=new Direccion();
                d.setCalle("Av. México");
                d.setColonia("Ejidos tulpetlac");
                d.setCp(55120);
                d.setMunicipio("Ecaterror");
                
                a.setDireccion(d); 
            //Hasta aqui termina este temita
            //Veremos los tipos de datos primitivos
            byte b=127;
            String x="Hola mundo";
            //Este string que se llama x mandalo por http
            byte[] valor=x.getBytes();
            
                
        
    }
    
}
