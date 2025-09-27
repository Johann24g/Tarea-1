package com.sumatoria;
/**
 *
 * @author queza
 */
public class SumatoriaDoWhile {
    
    //5. Realizar un programa que imprima la sumatoria de los números del 1 al 50 utilizando ciclos "do while".
    
    public static void main(String[] args) {
        
        int i = 1;
        int suma = 0;

        do {
            suma += i; 
            i++;
        } while (i <= 50);

        System.out.println("La sumatoria de los numeros del 1 al 50 es: " + suma);
    }
    
}
