/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import entidades.NIF;
import java.util.Scanner;

/**
 *
 * @author tomic
 */
public class NIFService {
    
    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public NIFService() {

    }

    ;
    
    public String crearNif(NIF n1) {
        
        System.out.println("Ingrese un DNI");
        
        n1.setDNI(leer.nextLong());

        int posicionDNI = (int) (n1.getDNI() % 23);

        String letras[] = {"T", "R", "W", "A", "G", "M", "Y", "R", "P", "D", "X", "B", "N", "J",
            "Z", "S", "Q", "V", "H", "L", "C", "K", "E"};

        if (posicionDNI > 22 || posicionDNI < 0) {

            System.out.println("DNI Incorrecto");
            return "0";
        }

        return letras[posicionDNI];
    }

    public void mostrar(NIF n1) {

        String NIF = crearNif(n1);

        long DNI = n1.getDNI();

        System.out.println("DNI + NIF : " + DNI + "-" + NIF);

    }

}
