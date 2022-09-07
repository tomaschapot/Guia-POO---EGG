/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.extra.pkg3;

import entidades.Raices;
import services.RaicesService;

/**
 *
 * @author tomic
 */
public class EjercicioExtra3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        RaicesService rS = new RaicesService();
        
        Raices r1 = new Raices(1,-8,16);
        
        
        rS.calcular(r1);
        
    }
    
}
