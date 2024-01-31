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
public class Ejercicio11 {

    /**
     * Realizar un programa que pida dos números enteros positivos por teclado y muestre por
pantalla el siguiente menú:

MENU
1. Sumar
2. Restar
3. Multiplicar
4. Dividir
5. Salir
Elija opción:

El usuario deberá elegir una opción y el programa deberá mostrar el resultado por
pantalla y luego volver al menú. El programa deberá ejecutarse hasta que se elija la
opción 5. Tener en cuenta que, si el usuario selecciona la opción 5, en vez de salir del
programa directamente, se debe mostrar el siguiente mensaje de confirmación: ¿Está
seguro que desea salir del programa (S/N)? Si el usuario selecciona el carácter ‘S’ se sale
del programa, caso contrario se vuelve a mostrar el menú.
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
      
        int opcion;
        char letter;
        boolean active = true;

        System.out.println("Ingrese el primer numero:");
        int num1 = leer.nextInt();
        System.out.println("Ingrese el segundo numero:");
        int num2 = leer.nextInt();

        do {
            System.out.println("---MENU---");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("5. Salir");
            System.out.println("----------");
            System.out.println();
            System.out.println("Ingrese la operacion a realizar:");
            opcion = leer.nextInt();

            switch (opcion) {
                case 1: {
                    System.out.println("La suma de los numeros es: " + (num1 + num2));
                    System.out.println();
                }
                case 2: {
                    System.out.println("La suma de los numeros es: " + (num1 - num2));
                    System.out.println();
                }
                case 3: {
                    System.out.println("La suma de los numeros es: " + (num1 * num2));
                    System.out.println();
                }
                case 4: {
                    System.out.println("La suma de los numeros es: " + (num1 / num2));
                    System.out.println();
                }
                case 5: {
                    System.out.println("¿Está seguro que desea salir del programa (S/N)?");
                    letter = leer.next().charAt(0);
                    if (letter == 'S') {
                        active = false;
                        System.out.println("Hasta luego...!");
                    } else {
                        System.out.println("Volviendo al menu principal...");
                    }
                    System.out.println();
                }
                default: {
                    System.out.println("La opcion ingresada no es valida, intente nuevamente...");
                    System.out.println();
                }
            }
        } while (active);
    }

}
