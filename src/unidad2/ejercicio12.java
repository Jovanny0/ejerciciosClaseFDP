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
public class ejercicio12 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        double c1, c2, hipotenusa, area, perimetro;
        System.out.println("Inserte el valor del cateto 1: ");
        c1 = leer.nextDouble();
        System.out.println("Inserte el valor del cateto 2: ");
        c2 = leer.nextDouble();
        
        area = (c1+c2)/2;
        hipotenusa = Math.sqrt(Math.pow(c1,2)+Math.pow(c2,2));
        perimetro = c1+c2+hipotenusa;

        System.out.println("\n\t***RESULTADOS OBTENIDOS***");
        System.out.println("Hipotenusa: " + hipotenusa);
        System.out.println("Area: " + area);
        System.out.println("Perimetro: " + perimetro);
    }
}
