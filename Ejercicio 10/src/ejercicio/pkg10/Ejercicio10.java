/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg10;

import java.util.Arrays;

/**
 *
 * @author tomic
 */
public class Ejercicio10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        double[] arregloA = new double[50];
        double [] arregloB = new double[20];
        
        llenarVectorAleatoriamente(arregloA);
        llenarVectorAleatoriamente(arregloB);
        
        mostrarVector(arregloA);
        mostrarVector(arregloB);
        
        Arrays.sort(arregloA);

    }
    
    public static void llenarVectorAleatoriamente(double[] vector){
        
       for(int i = 0; i < vector.length; i++){
           
           vector[i] = Math.random()*10;
       }
        
        
    }
    
    public static void mostrarVector(double[] vector){
        
        for(int i = 0; i < vector.length; i++){
            System.out.print(vector[i] + " ");
        }
    }
    
}
