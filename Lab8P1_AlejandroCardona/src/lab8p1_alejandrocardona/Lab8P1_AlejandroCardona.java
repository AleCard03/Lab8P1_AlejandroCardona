/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab8p1_alejandrocardona;
import java.util.Scanner;
/**
 *
 * @author jets
 */
public class Lab8P1_AlejandroCardona {
    static Scanner read = new Scanner(System.in);
    static Libro lib = new Libro();
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        boolean case1 = false;
        boolean continuar = true;
        while (continuar){
            boolean entro = false;
            System.out.println("---Menu---");
            System.out.println("1. Ejercicio Práctico 1 - Crear Biblioteca ");
            System.out.println("2. Ejercicio Práctico 2 - Modificar Librero ");
            System.out.println("3. Salir");
            int opcion = read.nextInt();
            switch (opcion){
                case 1 : {
                    llenarLibrero();
                    case1 = true;
                }//fin case 1
                entro = true;
                break;
                case 2 : {
                    if(case1){
                        read.nextLine();
                        System.out.println("Ingrese el título del libro: ");
                        String title = read.nextLine();
                        System.out.println("Ingrese el escritor");
                        String autor = read.nextLine();
                        System.out.println("Ingrese el año de publicación");
                        int año = read.nextInt();
                        ModificarLibro(title, autor, año, lib.getMatriz());
                    }
                    else{
                        System.out.println("Debe entrar a case 1 primero");
                    }
                }//fin case 2
                break;
                case 3 : {
                    continuar = false;
                }//fin case 3
                break;
                default : {
                    System.out.println("Se ha ingresado un valor erroneo");
                }//fin default
                
            }//fin switch
        }//fin while opcion
    }//fin main
    static Libro [][] llenarLibrero(){
        
        int filas, col;
        do{
            System.out.print("Ingrese la cantidad de filas para el librero: ");
            filas = read.nextInt();
            System.out.print("Ingrese la cantidad de columnas para el librero: ");
            col = read.nextInt();
        }while (filas <= 0 || col <= 0);
        Libro [][] librero = new Libro [filas][col];
        for (int i = 0; i<librero.length; i++){
            for (int j = 0 ; j<librero[0].length; j++){
                read.nextLine();
                System.out.println("Ingrese el título del libro: ");
                String title = read.nextLine();
                System.out.println("Ingrese el escritor");
                String autor = read.nextLine();
                System.out.println("Ingrese el año de publicación");
                int año = read.nextInt();
                Libro librote = new Libro(title, autor, año);
                librero[i][j] = librote;
                System.out.println("El libro ha sido agregado exitosamente");
            }//fin for j
        }//fin for i
        System.out.println("El librero completo es: ");
        printLibreria(librero);
        lib.setMatriz(librero);
        return librero;
    }//fin method llenarLibrero
    static void printLibreria(Libro[][]matriz){
        for (int i = 0; i<matriz.length;i++){
            for (int j = 0; j<matriz[0].length;j++){
                if(j<matriz[0].length-1){
                    System.out.print("["+matriz[i][j].getLibro()+"] ");
                }
                else{
                    System.out.println("["+matriz[i][j].getLibro()+"]");
                }
            }//fin for j
        }//fin for i
    }//fin printLibreria
    static Libro [][] ModificarLibro (String librox, String autorx, int añox, Libro [][] matriz){
        int x , y;
        boolean encontrado = false;
        for (int i = 0; i<matriz.length;i++){
            for (int j = 0; j<matriz[0].length;j++){
                if (matriz[i][j].getLibro().equals(librox) && matriz[i][j].getName().equals(autorx) && matriz[i][j].getYear() == añox){
                    System.out.println("El libro fue encontrado en la fila "+(i+1)+" columna "+(j+1));
                    read.nextLine();
                    System.out.println("Ingrese el título del libro: ");
                    String title = read.nextLine();
                    System.out.println("Ingrese el escritor");
                    String autor = read.nextLine();
                    System.out.println("Ingrese el año de publicación");
                    int año = read.nextInt();
                    encontrado = true;
                    Libro booky = new Libro(title, autor, año);
                    matriz[i][j] = booky;
                    break;
                }
            }
        }
        if (encontrado){
            System.out.println("El libro fue modificado exitosamente");
        }
        else{
            System.out.println("El libro no ha sido encontrado");
        }
        return matriz;
    }//fin method ModificarLibro
}//fin class
