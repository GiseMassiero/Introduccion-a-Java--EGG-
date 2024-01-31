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
public class Ejercicio13 {

    /**Dibujar un cuadrado de N elementos por lado utilizando el carácter “*”. Por ejemplo, si el
cuadrado tiene 4 elementos por lado se deberá dibujar lo siguiente:
* * * *
*     *
*     *
* * * *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
              Scanner leer = new Scanner(System.in);
                int num1;
                System.out.println("Ingrese un número, por favor:");
                num1 = leer.nextInt();
                
                for (int i = 1; i <= num1; i++) {
                    for (int j = 1; j <= num1; j++) {
                        
                        if (i==1 || i==num1 || j==1 || j==num1) {
                            System.out.print("*");
                            
                        }else{
                            System.out.print(" ");
                        }
                        
                    }
                    System.out.println(" ");
        }
    }
    
}
