/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import entidades.Cafetera;
import java.util.Scanner;

/**
 *
 * @author tomic
 */
public class CafeteraService {
    
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public void llenarCafetera(Cafetera c1){
        
        c1.setCantidadActual(c1.getCapacidadMaxima());
    }
    
    public void servirTaza(int capacidadTaza, Cafetera c1){
        
        int liquidoCafetera = c1.getCantidadActual();
        
        if(capacidadTaza > c1.getCantidadActual()){
            c1.setCantidadActual(0);
            System.out.println("No alcanzo para llenarlo, se sirvio" + 
                    liquidoCafetera);
        }else{
            c1.setCantidadActual(c1.getCantidadActual() - capacidadTaza);
            System.out.println("Se lleno la taza y quedo" +
                    c1.getCantidadActual());           
        }
        
    }
    
    public void vaciarCafetera(Cafetera c1){
        c1.setCantidadActual(0);
    }
    
    public void agregarCafe(int cantidadCafe,Cafetera c1){
        
        int capacidadMaxima = c1.getCapacidadMaxima();
        int cantidadActual = c1.getCantidadActual();
        int nuevaCantidad = cantidadActual + cantidadCafe;
        
        if(capacidadMaxima < nuevaCantidad ){
            
            System.out.println("Se lleno la cafetera y sobro " + (nuevaCantidad - capacidadMaxima));
            
        }else{
            System.out.println("Se agrego Cafe, la nueva cantidad es de " + nuevaCantidad);
        }
        
    }
}
