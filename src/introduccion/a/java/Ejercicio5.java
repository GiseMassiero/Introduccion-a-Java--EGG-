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
public class Ejercicio5 {

    /**
     * Escribir un programa que lea un número entero por teclado y muestre por pantalla el
doble, el triple y la raíz cuadrada de ese número. Nota: investigar la función
Math.sqrt().
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese un número entero: ");
        double num = leer.nextDouble();

        double raiz = Math.sqrt(num);
        double doble = num * 2;
        double triple = num * 3;

        System.out.println("La raíz del número entero es:" + raiz);
        System.out.println("El doble del número ingresado es:" + doble);
        System.out.println("El triple del número ingresado es:" + triple);
    }

}

