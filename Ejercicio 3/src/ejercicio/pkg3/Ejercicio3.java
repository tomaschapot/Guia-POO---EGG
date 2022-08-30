/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg3;

import entidades.Operacion;
import services.OperacionService;

/**
 *
 * @author tomic
 */
public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
       OperacionService operacionService = new OperacionService();
       
       Operacion operacion1 = operacionService.crearOperacion();
       Operacion operacion2 = operacionService.crearOperacion();
       
        System.out.println(operacionService.sumar(operacion1));
        System.out.println(operacionService.restar(operacion1));
        System.out.println(operacionService.multiplicar(operacion1));
        System.out.println(operacionService.dividir(operacion1));
        System.out.println(operacionService.sumar(operacion2));
        System.out.println(operacionService.restar(operacion2));
        System.out.println(operacionService.multiplicar(operacion2));
        System.out.println(operacionService.dividir(operacion2));
    }
    
}
