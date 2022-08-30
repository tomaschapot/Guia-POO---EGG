/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import entidades.Operacion;
import java.util.Scanner;

/**
 *
 * @author tomic
 */
public class OperacionService {
    
    public OperacionService(){
        
    };

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Operacion crearOperacion() {

        Operacion operacion1 = new Operacion();

        System.out.println("Ingrese el numero 1");

        operacion1.setNumero1(leer.nextInt());

        System.out.println("Ingrese el numero 2");

        operacion1.setNumero2(leer.nextInt());

        return operacion1;

    }

    public double sumar(Operacion op1) {

        double numero1 = op1.getNumero1();
        double numero2 = op1.getNumero2();

        double suma = numero1 + numero2;

        return suma;

    }

    public double restar(Operacion op1) {

        double numero1 = op1.getNumero1();
        double numero2 = op1.getNumero2();

        double resta = numero1 - numero2;

        return resta;

    }

    public double multiplicar(Operacion op1) {

        double numero1 = op1.getNumero1();
        double numero2 = op1.getNumero2();

        if (numero1 != 0 && numero2 != 0) {
            double multiplicacion = numero1 * numero2;
            return multiplicacion;
        } else {
            System.out.println("se multiplico por 0");
            return 0;
        }

    }

    public double dividir(Operacion op1) {

        double numero1 = op1.getNumero1();
        double numero2 = op1.getNumero2();

        if (numero1 != 0 && numero2 != 0) {
            double division = numero1 / numero2;
            return division;
        } else {
            System.out.println("se dividio por 0");
            return 0;
        }

    }

}
