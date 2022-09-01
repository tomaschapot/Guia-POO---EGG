/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import entidades.Matematica;
import java.util.Scanner;

/**
 *
 * @author tomic
 */
public class MatematicaService {
    
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public Matematica crearMatematicaAzar(){
        
        Matematica m1 = new Matematica();
        
        float numero1,numero2;
        
        numero1 = (float)Math.random()*10;
        numero2 = (float)Math.random()*10;
        
        m1.setNumero1(numero1);
        m1.setNumero2(numero2);
        
        return m1;
    }
    
    public float devolverMayor(Matematica m1){
        
        float numero1 = m1.getNumero1();
        float numero2 = m1.getNumero2();
        
        if (numero1 > numero2){
            return numero1;
        }else{
            return numero2;
        }
        
    }
    
    public void calcularPotencia(Matematica m1){
        
        double mayorNumero =devolverMayor(m1);
        double menorNumero;
        
        
        if (mayorNumero == m1.getNumero1()){
            menorNumero = m1.getNumero2();
        }else{
            menorNumero = m1.getNumero1();
        }
        
        
        
        double potencia = Math.pow(mayorNumero, menorNumero);
        
        System.out.println(potencia);

    } 
    
    public void calcularRaiz(Matematica m1){
        double mayorNumero =devolverMayor(m1);
        double menorNumero;
        
        
        if (mayorNumero == m1.getNumero1()){
            menorNumero = m1.getNumero2();
        }else{
            menorNumero = m1.getNumero1();
        }
        
        menorNumero =Math.abs(menorNumero);
        
        System.out.println(Math.sqrt(menorNumero));
    }
    
}
