package CodigoLimpio;

import java.util.HashMap;
import java.util.Scanner;

public class P9_Prueba {
    public static void main(String[] args) {
        arrayList();




    }

    public static void arrayList(){

        Scanner scanner = new Scanner(System.in);
        System.out.println("       ARRAY       ");
        System.out.println("Ingrese numero de filas: ");
        int filas = scanner.nextInt();
        System.out.println("Ingrese numero de columnas: ");
        int columnas = scanner.nextInt();

      int array[][] = new int[filas][columnas];

      for (int i=0;i<filas; i++){

          for (int j=0; j<columnas; j++){
              System.out.print("Array" + "[" + i + "][" + j + "] : "   );
              array[i][j]=scanner.nextInt();
              System.out.println();

          }

      }

      for (int i=0;i<array.length; i++){

            for (int j=0; j<array[i].length; j++){

                System.out.print(array[i][j]);


            }
             System.out.println();

        }




    }


}
