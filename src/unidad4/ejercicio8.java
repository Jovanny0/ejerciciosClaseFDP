/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package unidad4;

import java.util.Scanner;
import javax.swing.JOptionPane;



/**
 *
 * @author yovanny
 */
public class ejercicio8 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int matriz [][], filas, columnas;
        
        filas = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de filas: "));
        columnas = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de columnas: "));
        matriz = new int[filas][columnas];
        
        System.out.println("Ingrese los datos a la matriz");
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
              System.out.println("Elemento [" + "] " + "[" + j + "]");
              matriz[i][j] = leer.nextInt();
            } 
 }
    }
}
