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
public class ejercicio19 {
     public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        double TMB, peso, altura, edad, caloriasdiarias, caloriasadelgazar;
        double proteinas, grasas, carbohidratos, gproteina, gcarbohidratos, ggrasas;
        System.out.println("Inserte su peso en kg: ");
        peso = leer.nextDouble();
        System.out.println("Ingrese su altura en cm: ");
        altura = leer.nextDouble();
        System.out.println("Ingrese su edad en años: ");
        edad = leer.nextDouble();
        
        TMB = (10*peso) + (6.25*altura) - (5*edad) + 5;
        caloriasdiarias = TMB * 1.55;
        caloriasadelgazar = caloriasdiarias - (caloriasdiarias * 0.15);
        proteinas = caloriasadelgazar * 0.35;
        grasas = caloriasadelgazar * 0.25;
        carbohidratos = caloriasadelgazar * 0.4;
        gproteina = proteinas/4;
        gcarbohidratos = carbohidratos/4;
        ggrasas = grasas/9;
        
        System.out.println("\n\tPara adelgazar: ");
        System.out.println("Gramos de proteínas a ingerir: " + gproteina + "g.");
        System.out.println("Gramos de carbohidratos a ingerir: " + gcarbohidratos + "g.");
        System.out.println("Gramos de grasas a ingerir: " + ggrasas + "g.");
        
    }
}
