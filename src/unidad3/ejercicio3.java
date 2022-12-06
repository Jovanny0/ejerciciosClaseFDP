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
public class ejercicio3 {
    public static void main(String[] args) {
        Scanner lector = new Scanner (System.in);
        int edad;
        System.out.println("\t\tPrograma que determina si nud es mayor de edad ");
        System.out.println("Ingrese su edad:");
        edad=lector.nextInt() ;
         
        System.out.println("\nSOLUCION DE I ");
        if (edad>= 18)
            //SI ES VERDADERO
            System.out.println("ERES MAYOR DE EDAD. TE VOY A LLEVAR A UN VIP");
        else
            //SI ES FALSO
            System.out.println("ERES MENOR DE EDAD");
        
          
    }
}
