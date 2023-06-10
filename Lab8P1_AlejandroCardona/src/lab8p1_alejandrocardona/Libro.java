/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab8p1_alejandrocardona;

/**
 *
 * @author jets
 */
public class Libro {
    private String libro, escritor;
    private int año;
    private Libro [][] matriz;
    public Libro(){
        
    }
    public Libro(Libro [][] matriz){
        this.matriz = matriz;
    }
    public Libro(String libroN, String escritorN, int añoN){
        this.libro = libroN;
        this.escritor = escritorN;
        this.año = añoN;
    }
    
    public String getLibro (){
        return this.libro;
    }
    public String getName () {
        return this.escritor;
    }
    public int getYear() {
        return this.año;
    }
    public void setYear(int añoN){
        this.año = añoN;
    }
    public void setName ( String nameN){
        this.escritor = nameN;
    }
    public void setLibro ( String LibroN ){
        this.libro = LibroN;
    }
    public Libro[][] getMatriz(){
        return this.matriz;
    }
    public void setMatriz(Libro [][] matrix){
        this.matriz = matrix;
    }
    
}
