/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import entidades.Circunferencia;
import static java.lang.Math.PI;
import java.util.Scanner;

/**
 *
 * @author tomic
 */
public class CircunferenciaService {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public CircunferenciaService() {

    }

    ;
    
    public Circunferencia crearCircunferencia() {

        Circunferencia c1 = new Circunferencia();

        System.out.println("Indique el radio");
        c1.setRadius(leer.nextInt());

        return c1;

    }
      public Circunferencia crearCircunferencia(double radius) {

        Circunferencia c1 = new Circunferencia(radius);

        return c1;

    }

    public double calcularArea(Circunferencia c1) {
        double area;

        double radius = c1.getRadius();

        area = PI * (Math.pow(radius, 2));
        
        
        return area;

    }

    public double calcularPermitero(Circunferencia c1) {

        double perimeter;

        double radius = c1.getRadius();

        perimeter = 2 * PI * radius;

        return perimeter;

    }

}
