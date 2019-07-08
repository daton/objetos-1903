/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package solucion;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author juan_
 */
public class Main {
  
    public static void main(String[] args) {
          Carrera carrera=new Carrera();
          Libro l=new Libro();
          
         carrera.setNombre("Informatia");
         carrera.setCuatrimestre("8");
         l.setCarrera(carrera);
         l.setMateria("Prograamcion");
         l.setTitulo("Pogramacion java");
         
         Bibiolteca b=new Bibiolteca();
        List<Libro> libros=new ArrayList<>();
        libros.add(l);
         b.setLibros(libros);
         
         
    }
}
