/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg7;

import entidades.Persona;
import services.PersonaService;

/**
 *
 * @author tomic
 */
public class Ejercicio7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        PersonaService p = new PersonaService();

        Persona p1 = p.crearPersona();
        Persona p2 = p.crearPersona();
        Persona p3 = p.crearPersona();
        Persona p4 = p.crearPersona();

        int imcP1 = p.calcularIMC(p1);
        int imcP2 = p.calcularIMC(p2);
        int imcP3 = p.calcularIMC(p3);
        int imcP4 = p.calcularIMC(p4);

        boolean edadP1 = p.esMayorDeEdad(p1);
        boolean edadP2 = p.esMayorDeEdad(p2);
        boolean edadP3 = p.esMayorDeEdad(p3);
        boolean edadP4 = p.esMayorDeEdad(p4);

        promedioEdades(edadP1, edadP2, edadP3, edadP4);
        promedioIMC(imcP1, imcP2,imcP3, imcP4);

    }

    static void promedioEdades(boolean... edades) {

        double cantidadMayores = 0;
        double cantidadTotal = 0;
        double promedio;

        for (boolean edad : edades) {
            if (edad == true) {
                cantidadMayores++;
            }
            cantidadTotal++;
        }

        promedio = (cantidadMayores / cantidadTotal) * 100;

        System.out.println("El promedio de la cantidad de mayores es de: " + promedio + "%");
    }
    
    static void promedioIMC(int ... imcs){
        
        double debajoPeso = 0;
        double idealPeso = 0;
        double arribaPeso = 0;
        double cantidadPersonas = 0;
        
        double promedioDebajo;
        double promedioArriba;
        double promedioIdeal;
        
        for(int imc : imcs){
            
            switch (imc) {
                case 0:
                    idealPeso ++;
                    break;
                case -1:
                    debajoPeso ++;
                    break;
                default:
                    arribaPeso ++;
                    break;
            }
            
           cantidadPersonas ++;    
        }
        System.out.println(debajoPeso);
        System.out.println(cantidadPersonas);
        
        promedioDebajo = (debajoPeso / cantidadPersonas) * 100;
        promedioArriba = (arribaPeso / cantidadPersonas) * 100;
        promedioIdeal = (idealPeso / cantidadPersonas ) * 100;
        
        System.out.println("Cantidad con peso ideal:" + promedioIdeal + "%");
        System.out.println("Cantidad con peso debajo:" + promedioDebajo + "%");
        System.out.println("Cantidad con peso arriba:" + promedioArriba + "%");
    }

}
