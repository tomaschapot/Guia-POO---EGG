/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import entidades.Puntos;
import java.util.Scanner;

/**
 *
 * @author tomic
 */
public class PuntosService {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public PuntosService() {

    }

    ;
    
    public Puntos crearPuntos() {

        int x1, x2, y1, y2;

        System.out.println("Ingrese las coordenadas x1, y1, x2, y2");

        x1 = leer.nextInt();
        y1 = leer.nextInt();
        x2 = leer.nextInt();
        y2 = leer.nextInt();

        return new Puntos(x1, y1, x2, y2);

    }

    public void calcularDistancia(Puntos c1) {
        
        long distancia = (long) ((long) Math.sqrt(Math.pow((c1.getX2() - c1.getX1()),2) + 
                Math.pow((c1.getY2() - c1.getY1()),2)));
        
        System.out.println("La distancia es de: " + distancia);

    }

}
