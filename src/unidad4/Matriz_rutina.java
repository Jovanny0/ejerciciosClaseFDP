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
public class Matriz_rutina {

    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        int opcion;
        boolean condicion = true;
        
        String [][] pecho = {{"Pecho","Hombro","Triceps"},
                                  {"Pres banca","press militar","press frances"},
                                  {"press inclinado","laterales","extension polea"}};
        
        String [][] abdomen = {{"Pecho","Hombro","Triceps"},
                                  {"Pres banca","press militar","press frances"},
                                  {"press inclinado","laterales","extension polea"}};
        
        String [][] pierna = {{"Pecho","Hombro","Triceps"},
                                  {"Pres banca","press militar","press frances"},
                                  {"press inclinado","laterales","extension polea"}};
        
        
        while (condicion) {
            System.out.println("--------Menu--------");
            System.out.println("¿Que musculos trabajaras hoy?");
            System.out.println("[1] Pecho,hombro y triceps");
            System.out.println("[2] Pierna completa");
            System.out.println("[3] Espalda y biseps");
            System.out.println("[0] Salir");
            System.out.println("------------------------------------------------");
            System.out.println("opcion:");
            opcion = tec.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("-- opcion 1 -- Ejercicios de Pecho");
                    //System.out.println("Tu rutina de hoy es:  ");
                    //System.out.println("Pres banca, pres inclinado, dips, pres militar, elevaciones laterales, pres frances.");
                    //int ejercicios = tec.nextInt();
                    //tec.nextLine();
                    
                    for (int i = 0; i < 10; i++) {
                        for (int j = 0; j < 10; j++) {
                            System.out.println(pecho[i][j]+" ");
                        }
                        System.out.println("");
                    }
                    
                    
                    break;
                case 2:
                    System.out.println("-- opcion 2 --");
                     System.out.println("Tu rutina de hoy es:  ");
                     System.out.println("Sentadilla hack, sentadilla bulgara, biserie: curl femoral en maquina y aductor en maquina,"
                                                     + "extenciones de pierna en maquina y elevaciones de talones");
                    break;
                case 3:
                    System.out.println("-- opcion 3 --");
                     System.out.println("Tu rutina de hoy es:  ");
                     System.out.println("");
                    break;
                case 0:
                    condicion = false;
                    System.out.println("-- Saliste!! --");
                    break;
                default:
                     condicion = false;
                    System.out.println("-- NO ALUCINES WE, ESTA OPCION NO EXISTE --");
                    
            }
        }
    }
}
