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
public class ejercicio9 {
     public static void main (String[]args){
        Scanner leer = new Scanner (System.in);
        double baseM, basem, altura, area;
            System.out.println("Ingrese la medida de la base mayor: ");
            baseM = leer.nextDouble();
            System.out.println("Ingrese la medida de la base menor: ");
            basem = leer.nextDouble();
            System.out.println("Ingrese la medida de la altura: ");
            altura = leer.nextDouble();
            area = ((baseM+basem)*altura)/2;
            System.out.println("El area del trapecio es: " + area);
        }
}
