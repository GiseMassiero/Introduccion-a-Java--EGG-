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
public class Ejercicio6 {

    /**
     * Crear un programa que dado un numero determine si es par o impar.
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
       
        System.out.println("Ingrese el numero entero");
        double numero = leer.nextDouble();

        if (numero % 2 == 0) {
            System.out.println("El número ingresado es par");

        } else if (numero % 2 != 0) {
            System.out.println("El número ingresado es impar");
        }
    }

}
