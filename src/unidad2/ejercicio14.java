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
public class ejercicio14 {
     public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        final double DESCUENTO = 0.10;
        double subtotal, total;
        System.out.println("Ingrese el total de compra: ");
        subtotal = leer.nextDouble();
        total = subtotal - (subtotal * DESCUENTO);
        System.out.println("El total de comprar con descuento es: " + total);
    }

}
