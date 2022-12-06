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
public class ejercicio13 {
      public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        double salario;
        System.out.println("Ingrese el salario: ");
        salario = leer.nextDouble();
        salario = salario * 1.25;
        System.out.println("Su salario con 25% incrementado es: " + salario);
    }
}
