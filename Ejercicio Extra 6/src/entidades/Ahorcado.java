/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import java.util.Arrays;

/**
 *
 * @author tomic
 */
public class Ahorcado {

    private String palabra[];
    private int letrasEncontradas;
    private int jugadasMaximas;
    private int jugadasRestantes;

    public Ahorcado() {

    }

    ;
    
    public Ahorcado(String palabra[], int jugadasMaximas, int letrasEncontradas) {

        this.palabra = palabra;
        this.jugadasMaximas = jugadasMaximas;
        this.letrasEncontradas = letrasEncontradas;
        jugadasRestantes = jugadasMaximas;
    }

    public String[] getPalabra() {
        return palabra;
    }

    public void setPalabra(String[] palabra) {
        this.palabra = palabra;
    }

    public int getLetrasEncontradas() {
        return letrasEncontradas;
    }

    public void setLetrasEncontradas(int letrasEncontradas) {
        this.letrasEncontradas = letrasEncontradas;
    }

    public int getJugadasMaximas() {
        return jugadasMaximas;
    }

    public void setJugadasMaximas(int jugadasMaximas) {
        this.jugadasMaximas = jugadasMaximas;
    }

    public int getJugadasRestantes() {
        return jugadasRestantes;
    }
    
    public void setJugadasRestantes(int jugadasRestantes){
        this.jugadasRestantes = jugadasRestantes;
    }
    
    
    @Override
    public String toString() {
        return "Ahorcado{" + "palabra=" + Arrays.toString(palabra) + ", letrasEncontradas=" + letrasEncontradas + ", jugadasMaximas=" + jugadasMaximas + '}';
    }

}
