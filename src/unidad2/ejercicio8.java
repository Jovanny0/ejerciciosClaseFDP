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
public class ejercicio8 {
    public static void main (String[]args){
        Scanner leer = new Scanner (System.in);
        double radio, area;
        System.out.println("Ingrese la medida del radio: ");
        radio = leer.nextDouble();
        area = Math.PI * Math.pow (radio,2);
        System.out.println("El area del circulo es: " + area);
    }   
}
