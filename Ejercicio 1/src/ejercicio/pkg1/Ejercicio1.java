/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg1;

import entidades.Libro;
import services.LibroService;

/**
 *
 * @author tomic
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        LibroService ls = new LibroService();
        
        
        Libro l1 = ls.crearLibro();
        
        System.out.println(l1.toString());
        
        // TODO code application logic here
    }
    
}
