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
public class ejercicio17 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int num, dias, horas, minutos;
        System.out.println("Ingrese los segundos: ");
        num = leer.nextInt();
        
        dias = num/86400;
        System.out.println("Dias= " + dias);
        
        num = num%86400;
        System.out.println(">>>Segundos= " + num);
        
        horas = num/3600;
        System.out.println("Horas= " + horas);
        
        num = num%3600;
        System.out.println(">>>Segundos= " + num);
        
        minutos = num/60;
        System.out.println("Minutos= " + minutos);
        
        num = num%60;
        System.out.println(">>>Segundos= " + num);
        
        System.out.println(dias + " dia(s) " + horas + " hr(s) " + minutos + "min(s)" + num + " seg.");
    }
}
