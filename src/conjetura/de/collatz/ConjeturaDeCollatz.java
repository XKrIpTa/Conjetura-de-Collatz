/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package conjetura.de.collatz;

import java.util.Scanner;

/**
 *
 * @author Jose
 */
public class ConjeturaDeCollatz {
    
    long startTime = System.currentTimeMillis();
    
    public static void main(String[] args) {
    Scanner num_teclado = new Scanner (System.in);
    int numero=0;
    int ciclos = 0;
    
    /* Programa para resolver la conjetura de Collatz, este problema crea una
       sucesion de numeros, a partir de uno previamente introducido / generado.
       Si el numero es par lo divide por 2, si es impar los multiplica por 3 y
       le suma 1, el programa continua mientras que el resultado sea diferente
       de 1, ya que toda cadena acaba en 4, 2, 1. */
    long startTime = System.currentTimeMillis();
    System.out.println ("Introduce un número: ");
    // Math.random genera un numero 0-100 real así que hacemos un casting para transformarlo en entero
    numero = (int) (Math.random() * (100000000)); // Numero más grande que puede almacenar un int 2147483647
    System.out.println("Numero Generado aleatoriamente: " +numero);
    // numero = num_teclado.nextInt();
    while ( numero != 1 && numero != 0){ // Ademas de comprobar el =! lo hacemos con 0 ya que sino entrariamos en bucle infinito.
        ciclos++;
        if (numero % 2 == 0){ // NUMERO PAR
            numero /=2;
            System.out.println(numero);
        }
            else {
                numero = (numero * 3)+1; // NUMERO IMPAR
                System.out.println(numero);
            }     
        }
    System.out.println("Total Recorridos del bucle: " +ciclos);
    
    long endTime = System.currentTimeMillis() - startTime;
    System.out.println ("Tiempo de ejecución total: " + endTime + " ms.");

    System.out.println ("Linea de conflicto en Main");
    System.out.println ("Linea modificada desde Netbeans y actualizada con push");
    System.out.println ("Modificando desde NetBeans 15:12");
    }
}
