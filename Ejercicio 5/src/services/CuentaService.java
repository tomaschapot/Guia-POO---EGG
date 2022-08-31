/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import entidades.Cuenta;
import java.util.Scanner;

/**
 *
 * @author tomic
 */
public class CuentaService {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public CuentaService() {

    }

    ;
    
    
    public Cuenta crearCuenta() {

        Cuenta c1 = new Cuenta();

        System.out.println("Defina el numero de cuenta");
        c1.setNumeroCuenta(leer.nextInt());

        System.out.println("Defina el DNI");
        c1.setDni(leer.nextLong());

        System.out.println("Defina el saldo Actual");
        c1.setSaldoActual(leer.nextInt());

        return c1;

    }

    public void ingresar(Cuenta c1, int dineroAIngresar) {

        int saldoActual = c1.getSaldoActual();

        if (dineroAIngresar > 0) {
            int nuevoSaldo = saldoActual + dineroAIngresar;

            c1.setSaldoActual(nuevoSaldo);
        } else {
            System.out.println("El numero a retirar es invalido");
        }

    }

    public void retirar(Cuenta c1, int dineroARetirar) {
        
        int saldoActual = c1.getSaldoActual();
        int nuevoSaldo;
        
        if (dineroARetirar > saldoActual){
            System.out.println("No posee esa cantidad de dinero, se retiro"
                    + "el maximo de la cuenta");
            c1.setSaldoActual(0);
        }else{
            nuevoSaldo = saldoActual - dineroARetirar;
            c1.setSaldoActual(nuevoSaldo);
            
        }
        
        
    }
    
    public void extraccionRapida(Cuenta c1){
        int saldoActual = c1.getSaldoActual();
        
        int nuevoSaldo = (int) (saldoActual - (saldoActual * 0.2));
        
        c1.setSaldoActual(nuevoSaldo);

    }
    
    public void consultarSaldo(Cuenta c1){
        
        System.out.println("Tu saldo es de :" + c1.getSaldoActual());
    }
    
    public void consultarDatos(Cuenta c1){
        
        System.out.println("DNI:" + c1.getDni());
        System.out.println("Numero de Cuenta: " + c1.getNumeroCuenta());

    }

}
