/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

/**
 *
 * @author tomic
 */
public class Cuenta {

    private int numeroCuenta;
    private long dni;
    private int saldoActual;
    private double interes;

    public Cuenta() {

    }

    ;
   
   public Cuenta(int numeroCuenta, long dni, int saldoActual, double interes) {

        this.numeroCuenta = numeroCuenta;
        this.dni = dni;
        this.saldoActual = saldoActual;
        this.interes = interes;

    }
   
   public int getNumeroCuenta(){
       return numeroCuenta;
   }
   
   public void setNumeroCuenta(int numeroCuenta){
       this.numeroCuenta = numeroCuenta;
   }
   
   public long getDni (){
       return dni;
   }
   
   public void setDni(long dni){
       this.dni = dni;
   }
   
   public int getSaldoActual(){
       return saldoActual;
   }
   
   public void setSaldoActual(int saldoActual){
       this.saldoActual = saldoActual;
   }
   
   public double getInteres(){
       return interes;
   }
   
   public void setInteres(double interes){
       this.interes = interes;
   }
   
   
   

}
