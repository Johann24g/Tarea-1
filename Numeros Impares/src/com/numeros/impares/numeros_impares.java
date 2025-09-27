
package com.numeros.impares;

/**
 *
 * @author queza
 */
public class numeros_impares {
    
//3. Realizar un programa que imprima los números impares del 1 al 100 utilizando ciclos "for".
    
    public static void main(String[] args) {
        System.out.println("Numeros impares del 1 al 100:");

        for (int i = 1; i <= 100; i++) {
            if (i % 2 != 0) { 
                System.out.println(i);
            }
        }
    }
}

