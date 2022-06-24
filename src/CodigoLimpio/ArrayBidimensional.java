package CodigoLimpio;

import java.util.Scanner;

public class ArrayBidimensional {
    public static void main(String[] args) {
        arrayList();
    }

    public static void arrayList(){

        Scanner scanner = new Scanner(System.in);
        System.out.println("       ARRAY       " + "\n" + "Ingrese numero de filas: ");
        int filas = scanner.nextInt();
        System.out.println("Ingrese numero de columnas: ");
        int columnas = scanner.nextInt();

        int[][] ArrayList1 = new int[filas][columnas];

        for (int i=0;i<filas; i++){

            for (int j=0; j<columnas; j++){
                System.out.print("Array" + "[" + i + "][" + j + "] : "   );
                ArrayList1[i][j]=scanner.nextInt();
                System.out.println();
            }
        }
        for (int[] ints : ArrayList1) {

            for (int anInt : ints) {

                System.out.print(anInt);
            }
            System.out.println();
        }
    }
}


