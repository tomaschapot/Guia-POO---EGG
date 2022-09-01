/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import entidades.Persona;
import java.util.Scanner;

/**
 *
 * @author tomic
 */
public class PersonaService {
    
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public Persona crearPersona(){
        
        Persona p1 = new Persona();
        
        System.out.println("Ingrese el nombre");
        p1.setNombre(leer.next());
        
        System.out.println("Ingrese la edad");
        p1.setEdad(leer.nextInt());
        
        System.out.println("Ingrese el sexo");
        
        String sexo = leer.next();
        
        if (sexo.equalsIgnoreCase("M") || sexo.equalsIgnoreCase("H") || sexo.equalsIgnoreCase("O")){
             p1.setSexo(sexo);
        }else{
           System.out.println("el sexo ingresado no es correcto");
        }
        
        System.out.println("Ingrese el peso");
        p1.setPeso(leer.nextDouble());
        
        System.out.println("Ingrese la altura");
        p1.setAltura(leer.nextDouble());
        
        return p1;
    } 
    
    public int calcularIMC(Persona p1){
       
        double pesoActual = p1.getPeso();
        double alturaActual = p1.getAltura();
        double alturaCalculo = alturaActual * 2;
        
        double imc = pesoActual / alturaCalculo;
        
        if (imc < 20){
            return -1;
        }else if(imc >= 20 && imc <= 25){
            return 0;
        }else{
            return 1;
        }
    }
    
    public boolean esMayorDeEdad(Persona p1){
        
        int edad = p1.getEdad();
        
        return edad >= 18;
    }
}
