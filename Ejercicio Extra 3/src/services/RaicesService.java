/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import entidades.Raices;

/**
 *
 * @author tomic
 */
public class RaicesService {

    public RaicesService() {

    }

    ;
    
    public double getDiscriminante(Raices r1) {

        double discriminante;

        double a = r1.getA();
        double b = r1.getB();
        double c = r1.getC();

        discriminante = ((Math.pow(b, 2)) - (4 * a * c));

        return discriminante;

    }

    public boolean tieneRaices(Raices r1) {

        double discriminante = getDiscriminante(r1);

        return discriminante >= 0;

    }

    public boolean tieneRaiz(Raices r1) {

        double discriminante = getDiscriminante(r1);

        return discriminante == 0;

    }

    public void obtenerRaices(Raices r1) {

        double a = r1.getA();
        double b = r1.getB();
        double c = r1.getC();

        double raiz = (-b + Math.sqrt((Math.pow(b, 2)) - (4 * a * c))) / (2 * a);

        if (tieneRaices(r1)) {
            System.out.println(raiz);
            System.out.println(-raiz);
        }
    }

    public void obtenerRaiz(Raices r1) {

        double a = r1.getA();
        double b = r1.getB();
        double c = r1.getC();

        double raiz = (-b + Math.sqrt((Math.pow(b, 2)) - (4 * a * c))) / (2 * a);

        if (tieneRaiz(r1)) {
            System.out.println(raiz);
        }
    }

    public void calcular(Raices r1) {

        obtenerRaices(r1);
        obtenerRaiz(r1);

    }

}
