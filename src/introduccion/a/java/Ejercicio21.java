/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package introduccion.a.java;

import java.util.Random;
import java.util.Scanner;

/**
 *Dadas dos matrices cuadradas de números enteros, la matriz M de 10x10 y la matriz P de
3x3, se solicita escribir un programa en el cual se compruebe si la matriz P está contenida
dentro de la matriz M. Para ello se debe verificar si entre todas las submatrices de 3x3
que se pueden formar en la matriz M, desplazándose por filas o columnas, existe al
menos una que coincida con la matriz P. En ese caso, el programa debe indicar la fila y la
columna de la matriz M en la cual empieza el primer elemento de la submatriz P.
 * @author Gisella
 */
public class Ejercicio21 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner (System.in);
        int[][] M = new int[10][10];
        int[][] P = new int[3][3];

        // Rellenamos la matriz M con números aleatorios entre 0 y 100
        Random rand = new Random();
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                M[i][j] = rand.nextInt(101);
            }
        }

        // Imprimimos las matrices
        System.out.println("Matriz M:");
        imprimirMatriz(M);
        
           System.out.println();
           
             System.out.println("Ingrese los valores para cada elemento de la matriz P (3x3):");
        for(int i=0; i<3; i++) {
            for(int j=0; j<3; j++) {
                
                             
                System.out.print("Ingrese el valor para [" + i + "][" + j + "]: ");
                P[i][j] = leer.nextInt();
            }
        }
        
        System.out.println("Matriz P:");
        imprimirMatriz (P);

        // Buscamos si la matriz P está contenida en la matriz M
        boolean encontrada = false;
        for (int i = 0; i <= 7; i++) {
            for (int j = 0; j <= 7; j++) {
                if (compararSubmatrices(M, P, i, j)) {
                    encontrada = true;
                    System.out.println("\nLa matriz P está contenida en la matriz M, empezando en la fila " + i + " y la columna " + j);
                    break;
                }
            }
            if (encontrada) {
                break;
            }
        }
        if (!encontrada) {
            System.out.println(" La matriz P no está contenida en la matriz M ");
        }
    }

    // Función para imprimir una matriz
    public static void imprimirMatriz(int[][] matriz) {
        
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }

    // Función para comparar una submatriz de la matriz M con la matriz P
    public static boolean compararSubmatrices(int[][] matrizM, int[][] matrizP, int fila, int columna) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (matrizM[fila + i][columna + j] != matrizP[i][j]) {
                    return false;
                }
            }
        }
        return true;
    }
}

