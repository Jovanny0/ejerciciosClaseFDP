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
public class ejrcicio4 {
     public static void main (String[]args){
        Scanner sc = new Scanner(System.in);
        int nacimiento, actual, edad;
        System.out.println("Ingresa el año de tu nacimiento:");
        nacimiento = sc.nextInt();
        System.out.println("Ingresa el año actual:");
        actual = sc.nextInt();
        edad = actual-nacimiento;
        System.out.println("La edad es " + edad + " años");
    }
}
