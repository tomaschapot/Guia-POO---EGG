/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg9;

import entidades.Matematica;
import services.MatematicaService;

/**
 *
 * @author tomic
 */
public class Ejercicio9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        MatematicaService m = new MatematicaService();
        
        Matematica m1 = m.crearMatematicaAzar();
        
        System.out.println(m1.getNumero1());
        System.out.println(m1.getNumero2());
        
        System.out.println(m.devolverMayor(m1));
        
        m.calcularPotencia(m1);
        m.calcularRaiz(m1);
        
        
        
    }
    
}
