/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package unidad4;

import java.util.Scanner;

/**
 *
 * @author yovanny
 */
public class ejercicio2 {
    public static void main(String[] args) {
        Scanner lector=new Scanner(System.in);
        int[] calificaciones;
        int suma=0, promedio=0, numMaterias;
        System.out.println("Ingrese el numero de materias");
        numMaterias=lector.nextInt();
        calificaciones = new int[numMaterias];
        System.out.println("ingrese las" +numMaterias + "calificasiones,una a la vez y preciones enter");
           
        for(int i=0; i<calificaciones.length;i++){
            calificaciones[i]=lector.nextInt();
            suma=suma+calificaciones[i];
        }
        promedio=suma/numMaterias;
            System.out.println("el promedio de tu calificasion es: "+promedio);
        }
    
}
