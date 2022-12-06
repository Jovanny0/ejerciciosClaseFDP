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
public class ejercicio7 {
    public static void main(String[] args) {
    //DECLARACION DE LA MAMTRIZ
    //LOS DOS PARES DE CORCHETES QUE INDICAN QUE LA VARIABLE "ALUMNOS" ES UNA MATRIZ
    //EN ESTE CASO SE INDICAN QUE SE ESTA DECLARANDO UNA MATRIZ LLAMADA "alumnos"
    //cuyo tamaño es de 9 filas *5 colummnas (por lo tanto puede contener 20 elementos)
    //y los elementos (o informacióin) que se puede guardar en la matriz
    //son de tipo String (cadena o texto)
    String[][] alumnos = new String [4][5];
    //Declaración de la matriz con elementos
    String[][] profesores = {{"Jose Juan","Cesar","Ivan"},
                                         {"Briseida","Miguel","Kenia"},
                                         {"Marcos","Nancy","Maria"}};
    //Declaracion de matriz con tamaño personalizado
    int[][] respuestas_eval_docente;
    int filas,columnas;
        Scanner lector = new Scanner(System.in);
        System.out.println("Ingrese el numero de filas de la matriz");
        filas=lector.nextInt();
        System.out.println("Ingrese el numero de columnas de la matriz");
        columnas=lector.nextInt();
        respuestas_eval_docente = new int[filas][columnas];
        
        //IMPRIMIR CONTENIDO EN UNA MATRIZ CUADRADA
        System.out.println("\nImpresion de matriz con nombre de profesores");
      for (int i = 0; i < profesores.length; i++){
           for(int j = 0; j < profesores.length; j++){
               System.out.print(profesores[i][j]+"   ");
           }
           System.out.println("");
      }
               //IMPRIMIR CONTENIDO EN UNA MATRIZ RECTANGULAR
               System.out.println("\nImpresion de matriz de nombre de alumnos");
                 for (int i = 0; i < alumnos.length; i++){
           for(int j = 0; j < alumnos.length; j++){
               System.out.print(alumnos[i][j]+"   ");
           }
           System.out.println("");
      }
               //IMPRIMIR CONTENIDO DE UNA MATRIZ DE TAMAÑO PERSONALIZADO
                 System.out.println("\nImpresion de matrIz de Respuestas de Evaluacion de Docente");
                 for (int i = 0; i < filas; i++){
           for(int j = 0; j < columnas; j++){
               System.out.print(respuestas_eval_docente[i][j]+"   ");
           }
           System.out.println("");
      }
               
        }
    } 
    
            
