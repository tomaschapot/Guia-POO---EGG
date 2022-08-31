/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import entidades.Rectangulo;
import java.util.Scanner;

/**
 *
 * @author tomic
 */
public class RectanguloService {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Rectangulo crearRectangulo() {

        Rectangulo nuevoRectangulo = new Rectangulo();

        System.out.println("Defina la base");
        nuevoRectangulo.setBase(leer.nextDouble());

        System.out.println("Defina la altura");
        nuevoRectangulo.setAltura(leer.nextDouble());

        return nuevoRectangulo;

    }

    public double calcularSuperficie(Rectangulo r1) {

        double base = r1.getBase();
        double altura = r1.getAltura();

        double superficie = base * altura;

        return superficie;

    }

    public double calcularPerimetro(Rectangulo r1) {
        double base = r1.getBase();
        double altura = r1.getAltura();

        double perimetro = (base * 2) + (altura * 2);

        return perimetro;

    }

    public void dibujarRectangulo(Rectangulo r1) {

        double base = r1.getBase();
        double altura = r1.getAltura();

        for (int i = 0; i < altura; i++) {

            for (int j = 0; j < base; j++) {

                System.out.print("*");

            }

            System.out.println("");

        }

    }

}
