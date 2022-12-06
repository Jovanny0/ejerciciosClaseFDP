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
public class ejercicio5 {
     public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        double libras, kilos;
        System.out.println("Ingrese el valor en libras:");
        libras = lector.nextDouble();
        kilos = libras * 0.454;
        System.out.println("El resultado es: " + kilos + " kg");
    }
}
