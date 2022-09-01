/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import entidades.Cadena;
import java.util.Scanner;

/**
 *
 * @author tomic
 */
public class CadenaService {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Cadena crearFrase() {

        Cadena c1 = new Cadena();
        System.out.println("Ingrese una frase");

        String frase = leer.next();

        c1.setFrase(frase);

        c1.setLongitud(frase.length());

        return c1;

    }

    public void mostrarVocales(Cadena c1) {

        String frase = c1.getFrase();
        int longitudFrase = c1.getLongitud();

        int cantidadDeA = 0;
        int cantidadDeE = 0;
        int cantidadDeI = 0;
        int cantidadDeO = 0;
        int cantidadDeU = 0;

        for (int i = 0; i < longitudFrase; i++) {

            String letraActual = frase.substring(i, i + 1);

            if (letraActual.equalsIgnoreCase("A")) {
                cantidadDeA++;
            } else if (letraActual.equalsIgnoreCase("E")) {
                cantidadDeE++;
            } else if (letraActual.equalsIgnoreCase("I")) {
                cantidadDeO++;
            } else if (letraActual.equalsIgnoreCase("O")) {
                cantidadDeI++;
            } else if (letraActual.equalsIgnoreCase("U")) {
                cantidadDeU++;
            }
        }

        System.out.println("La cantidad de vocales, en orden (a,e,i,o,u) son: "
                + cantidadDeA + cantidadDeE + cantidadDeI + cantidadDeO
                + cantidadDeU);

    }

    public void invertirFrase(Cadena c1) {

        String frase = c1.getFrase();
        int longitudFrase = c1.getLongitud();

        String nuevaFrase = "";

        for (int i = longitudFrase; i > 0; i--) {

            String letraActual = frase.substring(i - 1, i);

            nuevaFrase = nuevaFrase.concat(letraActual);

        }
        System.out.println(nuevaFrase);

    }
    
    public void vecesRepetido(Cadena c1){
        
        
        
        System.out.println("Ingrese una letra");
        String letra = leer.next();
        
        String frase = c1.getFrase();
        int longitudFrase = c1.getLongitud();
        int vecesRepetido = 0;
        
        for(int i = 0; i < longitudFrase;i++){
            
            if(letra.equalsIgnoreCase(frase.substring(i, i + 1))){
                vecesRepetido++;
            }
        }
        
        System.out.println("La cantidad de veces que se repitio " + letra + ""
                + "en la frase, es de : " + vecesRepetido);
    }
    
    public void compararLongitud(Cadena c1){
        
        int longitudFraseCadena = c1.getLongitud();
        
        System.out.println("Ingrese una frase a comprarar");
        
        String fraseNueva = leer.next();
        
        int longitudFraseNueva = fraseNueva.length();
        
        if(longitudFraseCadena > longitudFraseNueva){
            System.out.println("La longitud de la cadena es mayor");
        }else{
            System.out.println("La longitud de la frase nueva es mayor");
        }
        
        
        
        
    }
    
    public void unirFrases(Cadena c1){
        
        System.out.println("Ingrese una frase");
        
        String fraseIngresada = leer.next();
        String frase1 = c1.getFrase();
        String nuevaFrase = frase1.concat(fraseIngresada);
        
        System.out.println(nuevaFrase);
    }
    
    public void reemplazar(Cadena c1){
        
        System.out.println("Ingrese un caracter para reemplazar las letras A");
        
        String caracter = leer.next();
        
        
        String frase = c1.getFrase();
        int longitudFrase = c1.getLongitud();
        String nuevaFrase ="";
        
        
        for(int i = 0; i < longitudFrase; i++){
            String caracterActual = frase.substring(i, i + 1);
            
            if(caracterActual.equalsIgnoreCase("A")){
                caracterActual = caracter;
            }
            
            nuevaFrase = nuevaFrase.concat(caracterActual);
        }
        
        System.out.println(nuevaFrase);
        
    }
    
    public boolean contiene(Cadena c1){
        System.out.println("Ingrese una letra");
        String letra = leer.next();
        
        String frase = c1.getFrase();
        int longitudFrase = c1.getLongitud();
        int vecesRepetido = 0;
        
        for(int i = 0; i < longitudFrase;i++){
            
            if(letra.equalsIgnoreCase(frase.substring(i, i + 1))){
                vecesRepetido++;
            }
        }
        
        if (vecesRepetido != 0){
            return true;
        }else{
            return false;
        }
    }

}
