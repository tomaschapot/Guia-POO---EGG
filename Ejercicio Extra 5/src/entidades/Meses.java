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
public class Meses {
    
    private final String meses[];
    

    private final String mesSecreto = "enero";
    
    public Meses(){
        this.meses = new String[]{"enero", "febrero", "marzo", "abril", "mayo", 
            "junio", "julio", "agosto", "septiembre", "octubre", 
            "noviembre", "diciembre"};
    };

    public String[] getMeses() {
        return meses;
    }

    public String getMesSecreto() {
        return mesSecreto;
    }

}
