/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import entidades.Persona;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author tomic
 */
public class PersonaService {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public PersonaService() {

    }

    ;
    
    public Persona crearPersona() {

        int dia, mes, anio;
        String nombre;

        System.out.println("Ingrese el nombre de la persona");

        nombre = leer.next();

        System.out.println("En que anio nacio");

        anio = leer.nextInt();

        System.out.println("En que mes");

        mes = leer.nextInt();

        System.out.println("En que dia");

        dia = leer.nextInt();

        Date fechaNacimiento = new Date((anio - 1900), mes, dia);

        return new Persona(nombre, fechaNacimiento);

    }
    
    public void calcularEdad(Persona p1){
        
        long nacimiento = p1.getDate().getTime();
        long fechaActual = new Date().getTime();
        
        long edad;
        
        edad = (long) ((fechaActual - nacimiento)/ 1000 / 60 / 60 / 24/ 365.25);
        
        System.out.println(edad);
        
    }
    
    public boolean menorQue(int edad, Persona p1){
        
        Date fechaActual = new Date();
        
        int aniosPersona1 = fechaActual.getYear() - p1.getDate().getYear();
        
        if(aniosPersona1 < edad){
            return true;
        }
 
        return false;
    }
    
    public void mostrarPersona(Persona p1){
        
        System.out.println("Nombre: " + p1.getName() + " Fecha de nacimiento: " + p1.getDate());
    
    
    }
    
    
}
