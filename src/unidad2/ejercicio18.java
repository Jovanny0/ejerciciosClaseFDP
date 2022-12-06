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
public class ejercicio18 {
     public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        double a, b, c, d, r, resultado;
        System.out.println("Ingresa el valor de a: ");
        a = leer.nextDouble();
        System.out.println("Ingresa el valor de b: ");
        b = leer.nextDouble();
        System.out.println("Ingresa el valor de c: ");
        c = leer.nextDouble();
        System.out.println("Ingresa el valor de d: ");
        d = leer.nextDouble();
        System.out.println("Ingresa el valor de r: ");
        r = leer.nextDouble();
        
        resultado = 4/(3*(r+34))-9*(a+(b*c))+(3+d*(2+a))/(a+(b*d));
        System.out.println("El resultado es: " + resultado);
    }
}
