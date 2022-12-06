
 //* Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 //* Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 //*/
package unidad4;
import java.util.Scanner;


/**
 *
 * @author yovanny
 */
public class ejercicio1 {
    public static void main(String[] args) {
         int[] numeros = new int [5];
     
        //asignacion directa de los valores
        numeros[0]=120;
        numeros[1]=37;
        numeros[2]=15;
        numeros[3]=28;
        numeros[4]=11;
       
        //otra forma de declarar el vector
        int[] numeros2 = {100,70,65,208,23,11}; 
        
//siguiente forma de declarra el vector
        int[] numeros3;
        Scanner lector = new Scanner (System.in);
        int tamanio = 0;
        System.out.println("ingrese el tamaño del arreglo");
        tamanio = lector.nextInt();
        numeros3 = new int [tamanio];
        
        //imprimir o mostrar el contenido del vector
        System.out.println("Arrays.toString(numeros))");
        System.out.println("Arrays.toString(numeros2))");
        System.out.println("Arrays.toString(numeros3))");
        
        //imprimir o mostrar el contenido del vector  utilizando ciclos
        System.out.println("Imprecion del vector <numero>");
        for (int i = 0; i < numeros.length; i ++){
            System.out.println(numeros [i]+" I ");
        }
             System.out.println("\n\nImpresion del vector <numeros2>");
        for(int i = 0; i<numeros.length; i++){
            System.out.print(numeros2[i]+", ");
        }
        
        System.out.println("\n\nImpresion del vector <numeros3>");
        for(int i = 0; i<numeros.length; i++){
            System.out.print(numeros3[i]+", ");
        }
        System.out.println("");
    }
}
