/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package unidad3;

import java.util.Scanner;

/**
 *
 * @author yovanny
 */
public class ejercicio6 {
    public static void main(String[] args) {
       Scanner n = new Scanner (System.in);
     int num;
     
        System.out.println("ingrese un numero: ");
        num= n.nextInt ();
        if ( num<0) {
            System.out.println("el numero es negativo");
        }
        else {
            System.out.println("el numero es positivo");
             }
               
        
    }
}


