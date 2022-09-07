/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios.extra.pkg2;

import entidades.Puntos;
import services.PuntosService;

/**
 *
 * @author tomic
 */
public class EjerciciosExtra2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        PuntosService pS = new PuntosService();
        
        Puntos c1 = pS.crearPuntos();
        
        pS.calcularDistancia(c1);
        
    }
    
}
