/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg6;

import entidades.Cafetera;
import services.CafeteraService;

/**
 *
 * @author tomic
 */
public class Ejercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        CafeteraService c = new CafeteraService();
        
        Cafetera c1 = new Cafetera(2000, 400);
        c.agregarCafe(2000, c1);
        c.llenarCafetera(c1);
        c.vaciarCafetera(c1);
        c.agregarCafe(7000, c1);
        c.vaciarCafetera(c1);
        c.agregarCafe(200, c1);
        
    }
    
}
