package com.mayormenor;
/**
 *
 * @author queza
 */
public class MayorMenor {
    
    //7. Realizar un programa que dado dos números, me indique cual es el mayor y cual es el menor de ambos.
    
    public static void main(String[] args) {
        
        int num1 = 24; 
        int num2 = 8;  

        System.out.println("Numero 1: " + num1);
        System.out.println("Numero 2: " + num2);

        if (num1 > num2) {
            System.out.println("El mayor es: " + num1);
            System.out.println("El menor es: " + num2);
        } else if (num2 > num1) {
            System.out.println("El mayor es: " + num2);
            System.out.println("El menor es: " + num1);
        } else {
            System.out.println("Ambos numeros son iguales: " + num1);
        }
    }
    
}
