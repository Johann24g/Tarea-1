package com.parimpar;
/**
 *
 * @author queza
 */
public class ParImpar {
    
    //8. Realizar un programa que ingresado un numero, me indique si es par o impar.
    
    public static void main(String[] args) {
        
        int numero = 48; 

        System.out.println("Numero: " + numero);

        if (numero % 2 == 0) {
            System.out.println("El numero es Par");
        } else {
            System.out.println("El numero es Impar");
        }
    }
}