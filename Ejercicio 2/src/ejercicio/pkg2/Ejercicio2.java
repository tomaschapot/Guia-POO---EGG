/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg2;

import entidades.Circunferencia;
import services.CircunferenciaService;

/**
 *
 * @author tomic
 */
public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        CircunferenciaService cs = new CircunferenciaService();

        Circunferencia c1 = cs.crearCircunferencia();
        Circunferencia c2 = cs.crearCircunferencia(2);

        System.out.println("Area:" + cs.calcularArea(c1));
        System.out.println("Perimeter: " + cs.calcularPermitero(c1));
        System.out.println("Area:" + cs.calcularArea(c2));
        System.out.println("Perimeter: " + cs.calcularPermitero(c2));

        // TODO code application logic here
    }

}
