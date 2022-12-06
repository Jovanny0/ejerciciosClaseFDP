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
public class ejercicio9 {
    public static void main(String[] args) {
        //BUSCADOR DE NOVIO
        //EDAD,estatura y BTS
        Scanner entrada = new Scanner(System.in);
        int edadEL, edadELLA, estatura;
        String artistaFavorito;
        System.out.println("Programa para buscarle novio a una chica toxica ");
        System.out.println("Ingrese la edad de la chica:");
        edadELLA = entrada.nextInt();
        System.out.println("Ingrese la edad del candidato");
        edadEL = entrada.nextInt();
        System.out.println("Ingrese la estatura(en centimetros)del candidato:");
        estatura = entrada.nextInt();
        System.out.println("Ingrese el grupo favorito del candidato:");
       artistaFavorito = entrada.next();
       //equivale a AND(Y)------AMPERSAND
       //Aartista favorito == "Timberinche"
       if(edadEL>edadELLA && estatura>=180 && artistaFavorito.equals("Ramstein")) {
           //verdadero
           System.out.println("El chico es tu candidato ideal");
           System.out.println("el chico es mayor que tu por: "+(edadEL-edadELLA)+"años");
           
       }
       else
            System.out.println("sigue buscando candidatos en Tinder");
       
        
        
    }
           
}
