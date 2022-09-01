/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg8;

import entidades.Cadena;
import services.CadenaService;

/**
 *
 * @author tomic
 */
public class Ejercicio8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CadenaService c = new CadenaService();
        
        Cadena c1 = c.crearFrase();
        
        c.mostrarVocales(c1);
        c.invertirFrase(c1);
        c.vecesRepetido(c1);
        c.compararLongitud(c1);
        c.unirFrases(c1);
        c.reemplazar(c1);
        System.out.println(c.contiene(c1)); 
    }
    
}
