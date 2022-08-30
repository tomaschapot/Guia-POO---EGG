/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import entidades.Libro;
import java.util.Scanner;

/**
 *
 * @author tomic
 */
public class LibroService {
    
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public LibroService(){
    };
    
    public Libro crearLibro(){
        
        Libro l1 = new Libro();
        
        System.out.println("Ingrese el nombre del libro");
        
        l1.setTitulo(leer.next());
        
        System.out.println("Ingrese el ISBN");
        
        l1.setISBN(leer.next());
        
        System.out.println("Ingrese el autor");
        
        l1.setAutor(leer.next());
        
        System.out.println("Ingrese el numero de Paginas");
        
        l1.setNumeroDePagina(leer.nextInt());
    
        return l1;

    }
    
    
    
    
    
}
