/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.extra.pkg4;

import entidades.NIF;
import services.NIFService;

/**
 *
 * @author tomic
 */
public class EjercicioExtra4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        NIFService nS = new NIFService();
        
        NIF n1 = new NIF ();

        nS.mostrar(n1);
        
    }
    
}