/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package unidad2;

import java.util.Scanner;

/**
 *
 * @author yovanny
 */
public class ejercicio3 {
     public static void main(String[]args){
        int valor1, valor2, resultado;
        Scanner leer = new Scanner (System.in);
        System.out.println("Ingrese el primer numero: ");    
        valor1 = leer.nextInt();
        System.out.println("Ingrese el segundo numero: ");
        valor2 = leer.nextInt();
        resultado = valor1-valor2;
        System.out.println("El resultado de la resta es: " + resultado);
    }
}

