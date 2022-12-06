/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package unidad5;

import java.util.Scanner;

/**
 *
 * @author yovanny
 */
public class ejercicio1 {
     static int suma(){
        Scanner leer = new Scanner(System.in); 
        int n1, n2;
        System.out.println("Ingrese el primer numero: ");
        n1 = leer.nextInt();
        System.out.println("Ingrese el segundo numero: ");
        n2 = leer.nextInt();
        return n1+n2;
    }
    static int resta(int n1, int n2){
        return n1-n2;
    }
    static void multiplicacion(){
        Scanner leer = new Scanner(System.in);
        int n1, n2;
        System.out.println("Ingrese el primer numero: ");
        n1 = leer.nextInt();
        System.out.println("Ingrese el segundo numero: ");
        n2 = leer.nextInt();
        System.out.println("El resultado de la multiplicacion es: " + (n1*n2));
    }
    static void division(int n1, int n2){
        System.out.println("El resultado de la division es: " + (n2/n2));
    }
    public static void main(String[] args) {
        int resultado;
        resultado = suma(); //Se invoca a la función "suma"
        System.out.println("El resultado de la suma es: " + resultado);
        resultado = resta(15,8); //Invocación con parámetros
        System.out.println("El resultado de la resta es: " + resultado);
        multiplicacion();
        division(25,5);
    }   
}
