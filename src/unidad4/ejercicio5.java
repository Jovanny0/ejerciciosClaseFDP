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
public class ejercicio5 {
     public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String[] pokemones = {"treecko", "totodile", "torchic", "psyduck", "wobbufet", "cyndaquil"};
        for (int i = 0; i < pokemones.length; i++) {
            System.out.println((i+1) + "." + pokemones[i]);
        }
        System.out.println("");
        int i=1;
        for (String pokemone : pokemones) {
            System.out.println(i + ". " + pokemone);
            i++;
 }
}
}

