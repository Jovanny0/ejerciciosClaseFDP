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
public class ejercicio16 {
     public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int dias, horas, minutos, segundosD, segundosH, segundosM, segundos;
        
        System.out.println("Ingrese la cantidad de días: ");
        dias = leer.nextInt();
        
        System.out.println("\nIngrese la cantidad de horas: ");
        horas = leer.nextInt();

        System.out.println("\nIngrse la cantidad de minutos: ");
        minutos = leer.nextInt();
        
        segundosD = dias*24*60*60;
        segundosH = horas*60*60;
        segundosM = minutos*60;
        segundos = segundosD + segundosH + segundosM;
        
        System.out.println("\nLa cantidad de segundos es: " + segundos + " segundos");
        
    }
}
