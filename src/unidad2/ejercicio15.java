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
public class ejercicio15 {
     public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int x, y, aux;
        System.out.println("Ingrese el valor de x: ");
        x = leer.nextInt();
        System.out.println("Ingrese el valor de y: ");
        y = leer.nextInt();
        
        aux=x;
        x=y;
        y=aux;
        
        System.out.println("El valor de x es: " + x);
        System.out.println("El valor de y es: " + y);
    }
}
