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
public class Ejercicio14 {

    /**
     * Crea una aplicación que a través de una función nos convierta una cantidad de euros
introducida por teclado a otra moneda, estas pueden ser a dólares, yenes o libras. La
función tendrá como parámetros, la cantidad de euros y la moneda a converir que será
una cadena, este no devolverá ningún valor y mostrará un mensaje indicando el cambio
(void).
El cambio de divisas es:
* 0.86 libras es un 1 €
* 1.28611 $ es un 1 €
* 129.852 yenes es un 1 €
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner leer = new Scanner(System.in);
        double euros;
        
      
        System.out.println(" ingrese el valor de euros a cambiar");
        euros = leer.nextDouble();
        
        System.out.println("Elija una opción del cambio que desea realizar:");
        System.out.println("1.  Libras");
        System.out.println("2.yenes");
        System.out.println("3.libras");
        System.out.println("4.Salir");
       int opcion = leer.nextInt();
     do {
       switch (opcion) {
                case 1: {
                double libras = euros * 0.86;
                    System.out.println("sus euros equivalen a:  " + libras + "libras");
                    System.out.println();
                    break;
                }
                case 2: {
                    double dolares = euros * 1.28611;
                    System.out.println("sus euros equivalen a : " + dolares + "dolares");
                    System.out.println();
                    break;
                }
                case 3: {
                    double yenes = euros * 129.852;
                    System.out.println("Sus euros equivalen a: " + yenes + " Yenes" );
                    System.out.println();
                    break;
                }
             
                case 4: {
                    System.out.println("¿Está seguro que desea salir del programa (S/N)?");
                char salir = leer.next().charAt(0);
                    if (salir == 'S') {
                        boolean active = false;
                        System.out.println("Hasta luego...!");
                    } else {
                        System.out.println("Volviendo al menu principal...");
                    }
                    System.out.println();
                }
                default: {
                    System.out.println("La opcion ingresada no es valida, intente nuevamente...");
                    System.out.println();
                    break; 
                }
            }
        } while (opcion >5 && opcion < 1 );
     
    }

}
