/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import entidades.Ahorcado;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author tomic
 */
public class AhorcadoService {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public AhorcadoService() {

    }

    ;
    
    public Ahorcado crearJuego() {

        String palabra;
        int cantidadDeIntentos;

        System.out.println("Que palabra hay que adivinar");
        palabra = leer.next();
        String palabraVector[] = new String[palabra.length()];

        //Paso la palabra a un vector
        for (int i = 0; i < palabra.length(); i++) {

            palabraVector[i] = palabra.substring(i, i + 1);
        }

        System.out.println("Cuantos intentos tenes");
        cantidadDeIntentos = leer.nextInt();

        return new Ahorcado(palabraVector, cantidadDeIntentos, 0);

    }

    public int longitud(Ahorcado a1) {

        return a1.getPalabra().length;
    }

    public void buscar(String letra, Ahorcado a1) {
        boolean encontrada = false;

        for (int i = 0; i < longitud(a1); i++) {

            if (letra.equalsIgnoreCase(a1.getPalabra()[i])) {

                a1.setLetrasEncontradas(a1.getLetrasEncontradas() + 1);
                System.out.println("Letra " + "'" + letra + "'" + " Encontrada" 
                        + " En posicion " + i);
                encontrada = true;
            }

        }

        if (!encontrada) {
            a1.setJugadasRestantes(a1.getJugadasRestantes() - 1);
            System.out.println("La Letra no a sido encontrada: Jugadas Restantes: "
                    + (a1.getJugadasRestantes()));

        }

    }

    public void juego() {

        Ahorcado a1 = crearJuego();

        while (true) {

            System.out.println("Ingrese una letra");
            String letra = leer.next();
            buscar(letra, a1);
            System.out.println("Letras que quedan: " + (longitud(a1) - 
                    a1.getLetrasEncontradas()));

            if (a1.getLetrasEncontradas() == longitud(a1)) {
                System.out.println("Ganaste");
                break;
            } else if (a1.getJugadasRestantes() == 0) {
                System.out.println("Perdiste, se te acabaron las oportunidades " 
                        + "la palabra era: " + Arrays.toString(a1.getPalabra()));
                break;
            }
        }

    }

}
