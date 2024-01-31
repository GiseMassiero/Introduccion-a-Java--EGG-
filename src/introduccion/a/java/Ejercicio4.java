/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package introduccion.a.java;

import java.util.Scanner;

/**
 *
 * @author Gisella
 */
public class Ejercicio4 {

    /**
     * Dada una cantidad de grados centígrados se debe mostrar su equivalente en grados
Fahrenheit. La fórmula correspondiente es: F = 32 + (9 * C / 5).
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double F;
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese los C° que desea convertir");
        int grados = leer.nextInt();

        F = 32 + (9 * grados / 5);
        System.out.println(+grados + "C° son " + F + " grados Farenheit");
    }

}
