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
public class ejercicio2 {
   public static void main(String[]args){
        Scanner leer = new Scanner (System.in);
        int num1, num2, resultado;
        System.out.println("Ingrese numero 1: ");
        num1 = leer.nextInt();
        System.out.println("Ingrese numero 2: ");
        num2 = leer.nextInt();
        resultado = num1 + num2;
        System.out.println("El resultado de la suma es: " + resultado);
    }
}  

