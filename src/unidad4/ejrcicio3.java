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
public class ejrcicio3 {
 //programa que realiza una busqueda secuencial en un arreglo
   
    public static void main(String[] args) {
          //programa que realiza una busqueda secuencial en el arreglo 
        int[] temperaturas ={35,28,32,27,30};
        Scanner lector= new Scanner(System.in);
        int dato,vecesEncont=0;
        boolean encontrado=false;
        System.out.println("ingresa el valor a buscar");
        dato=lector.nextInt();
       for(int i=0; i<temperaturas.length;i++){
            if(temperaturas[i]==dato){
                //opcion1 marcar con la variable booleana 
                //que de ha encontrado el dato
                encontrado=true; //esta variable actua como una bandera
                //opcion2 mostrar la posicion en la que se encuentra 
                //el dato que se está buscando
                System.out.println ("el dato"+dato+"se encuentra el la posicion"+i+"del arreglo");
                break;
            }
       }
                
//al finalizar el ciclo podemos comprobar el valor con que finaliza la vaariable BANDERA
//si el programa tiene varios valores que coinciden con el valor a buscsr entonces....
        if (encontrado==true)
            System.out.println("El dato fue encontrado");
        else
             System.out.println("No se encontro el dato");
                   
        double[] calificaciones={100,70,85.5,70,100,100};
        String posiciones="";
        System.out.println("ingresa el valor a buscar");
        dato=lector.nextInt();
        for (int i=0; i < calificaciones.length; i++) {
            if (calificaciones [i]==dato){
                //se incrementa la variable vecesEncont cada vez que se encuentre el dato 
                vecesEncont++;
                //se registran las posiciones donde se encuentra el dato
                posiciones+=i+", ";
            }
        }
                
        System.out.println("el dato"+dato+"se encontro"+vecesEncont+" veces en las posiciones"+posiciones+"del arreglo");	
    }
}
                
            
        

    
            
    

