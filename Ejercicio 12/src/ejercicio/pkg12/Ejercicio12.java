/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg12;

import entidades.Persona;
import services.PersonaService;

/**
 *
 * @author tomic
 */
public class Ejercicio12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        PersonaService p = new PersonaService();
        
        Persona p1 = p.crearPersona();
        
        System.out.println(p1);
        
        p.calcularEdad(p1);
        
        System.out.println(p.menorQue(25, p1));
        
        p.mostrarPersona(p1);
        
    }
    
}
