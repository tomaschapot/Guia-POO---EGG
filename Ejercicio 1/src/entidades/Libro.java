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
public class Libro {
    
    String ISBN;
    String titulo;
    String autor;
    int numeroDePagina;
    
    public Libro (){
    };

    public Libro(String ISBN, String titulo, String autor, int numeroDePagina) {
        this.ISBN = ISBN;
        this.titulo = titulo;
        this.autor = autor;
        this.numeroDePagina = numeroDePagina;
    }

    public String getISBN(){
        return ISBN;
    }
    
    public void setISBN(String ISBN){
        this.ISBN = ISBN; 
    }
    
    public String getTitulo(){
        return titulo;
    }
    
    public void setTitulo(String titulo){
        this.titulo = titulo;
    }
    
    public String getAutor(){
        return autor;
    }
    
    public void setAutor(String autor){
        this.autor = autor;
    }
    
    public int getNumeroDePagina(){
        return numeroDePagina;
    }
    
    public void setNumeroDePagina(int numeroDePagina){
        this.numeroDePagina = numeroDePagina;
    }

    @Override
    public String toString() {
        return "Libro{" + "ISBN=" + ISBN + ", titulo=" + titulo + ", autor=" + autor + ", numeroDePagina=" + numeroDePagina + '}';
    }
    
    
    
}
