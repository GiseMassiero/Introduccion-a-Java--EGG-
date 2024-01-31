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
public class Ejercicio10 {

    /**
     * Escriba un programa en el cual se ingrese un valor límite positivo, y a continuación
solicite números al usuario hasta que la suma de los números introducidos supere el
límite inicial.
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese un valor límite positivo, por favor:");
        int valorLimite = leer.nextInt();
        int suma = 0;

        do {
            System.out.println("Ingrese un número, por favor:");
            int num1 = leer.nextInt();
            suma = suma + num1;

        } while (suma < valorLimite);
    }
}
