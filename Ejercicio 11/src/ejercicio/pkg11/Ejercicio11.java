/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg11;

import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author tomic
 */
public class Ejercicio11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner (System.in).useDelimiter("\n");
    
        int dia, mes, anio;
        
        long aniosEntreFechas;
        
        int diaActual, mesActual, anioActual;
        
       
        
        System.out.println("Ingrese el anio");
        anio = leer.nextInt();
        System.out.println("Ingrese el mes");
        mes = leer.nextInt();
        System.out.println("Ingrese el dia");
        dia = leer.nextInt();
        
        Date fechaActual = new Date();
        Date fechaElegida = new Date((anio - 1900),mes,dia);
        
        System.out.println(fechaElegida);
        System.out.println(fechaActual);
        
        aniosEntreFechas = fechaElegida.getYear() - fechaActual.getYear();
        
       
        
        System.out.println(aniosEntreFechas);

        
    }
    
}
