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
public class ejercicio10 {
    public static void main (String[]args){
  Scanner leer = new Scanner(System.in);
  int numero;
      System.out.println("Ingrese un numero en sistema binario: ");
      numero = leer.nextInt(2);
      System.out.println("Su equivalente en el sistema decimal es: " + numero);
      
      System.out.println("\nIngrese un numero en sistema octal: ");
      numero = leer.nextInt(8);
      System.out.println("Su equivalente en el sistema decimal es: " + numero);
      
      System.out.println("\nIngrese un numero en sistema hexadecimal: ");
      numero = leer.nextInt(16);
      System.out.println("Su equivalente en el sistema decimal es: " + numero);
    }
}
