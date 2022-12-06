/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package unidad4;

import static java.lang.Math.PI;
import java.util.Scanner;

/**
 *
 * @author yovanny
 */
public class examen {
    public static void main(String[] args) {
        Scanner lector = new Scanner (System.in);
        double lado,  altura,  apotema, volumenPrisma;
        System.out.println("ingrese el valor del lado del hexagono: ");
        lado=lector.nextDouble();
        System.out.println("ingrese la altura del prisma hexagonal: ");
        altura=lector.nextDouble();
        System.out.println("ingrese la apotema del prisma hexagonal: ");
        apotema=lector.nextDouble();
        volumenPrisma=lado*6*apotema/2*altura;
        double radio = lector.nextDouble();
      volumenPrisma=PI*Math.pow(radio,2)*altura/3;
      
       
    }
}
