/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg4;

import entidades.Rectangulo;
import services.RectanguloService;

/**
 *
 * @author tomic
 */
public class Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        RectanguloService recService = new RectanguloService();

        Rectangulo r1 = recService.crearRectangulo();

        System.out.println(recService.calcularSuperficie(r1));
        System.out.println(recService.calcularPerimetro(r1));
        recService.dibujarRectangulo(r1);

        Rectangulo r2 = recService.crearRectangulo();

        System.out.println(recService.calcularSuperficie(r2));
        System.out.println(recService.calcularPerimetro(r2));
        recService.dibujarRectangulo(r2);
    }

}
