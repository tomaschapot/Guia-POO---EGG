/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg5;

import entidades.Cuenta;
import services.CuentaService;

/**
 *
 * @author tomic
 */
public class Ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        CuentaService cServ = new CuentaService();
        
        Cuenta c1 = cServ.crearCuenta();
        
        cServ.extraccionRapida(c1);
        cServ.consultarSaldo(c1);
        cServ.ingresar(c1, 2000);
        cServ.consultarSaldo(c1);
        cServ.retirar(c1, 5000);
        cServ.consultarSaldo(c1);
        
        cServ.consultarDatos(c1);
        
    }
    
}
