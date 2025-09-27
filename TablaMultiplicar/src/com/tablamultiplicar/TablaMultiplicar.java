package com.tablamultiplicar;

/**
 *
 * @author queza
 */
public class TablaMultiplicar {
    
    //6. Realizar un programa que mediante la utilización de bucles, debe permitir imprimir cualquier tabla de multiplicar.
    
    public static void main(String[] args) {
        
        int numero = 9; 
        System.out.println("Tabla de multiplicar del " + numero + ":");

        for (int i = 1; i <= 10; i++) {
            int resultado = numero * i;
            System.out.println(numero + " x " + i + " = " + resultado);
        }
    }
    
}
