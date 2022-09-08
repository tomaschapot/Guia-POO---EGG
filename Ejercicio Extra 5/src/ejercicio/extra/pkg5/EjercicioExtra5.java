/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.extra.pkg5;

import entidades.Meses;
import java.util.Scanner;

/**
 *
 * @author tomic
 */
public class EjercicioExtra5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        Meses mesesDelAnio = new Meses();
        String mesElegido;
        
    
        do { 
            System.out.println("Eliga un mes");
            mesElegido = leer.next();
            if (!mesElegido.equals(mesesDelAnio.getMesSecreto())){
                System.out.println("el mes es incorrecto");
            }
            
            
        } while (!mesElegido.equals(mesesDelAnio.getMesSecreto()));
        
        System.out.println("el mes es correcto");
        
        
    }
    
}
