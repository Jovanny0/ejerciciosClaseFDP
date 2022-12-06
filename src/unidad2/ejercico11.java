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
public class ejercico11 {
     public static void main(String[]args){
        double precio, cantidad, total, pago, cambio;
        Scanner leer = new Scanner(System.in);
        System.out.println("¿Qué producto desea comprar?");
        String producto = leer.nextLine();
        System.out.println("Cuál es el precio de " + producto + "?");
        precio = leer.nextDouble();
        System.out.println("Cuál es la cantidad que desea comprar?");
        cantidad = leer.nextDouble();
        total = cantidad * precio;
        System.out.println("El total a apagar por " + producto + " es de: $" + total);
        System.out.println("Pago recibido: ");
        pago = leer.nextDouble();
        cambio = pago-total;
        System.out.println("Su cambio es de: $" + cambio);
        
    }
}
