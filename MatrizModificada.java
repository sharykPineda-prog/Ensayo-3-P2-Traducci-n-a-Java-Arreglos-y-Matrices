
package pkg10.matrizmodificada;

//@author Sharyk Esthefanía Pineda Maza

import java.util.Scanner;

public class MatrizModificada {

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int[][] matriz=new int[3][5];
        
        for (int i=0; i<3; i++){
            for (int j=0; j<5; j++){
                System.out.println("Ingrese un valor para [" + i + "][" + j + "]:  ");
                int numIngresa=s.nextInt();
                matriz[i][j]=numIngresa + (i*j);
            }
        }
        System.out.println("-----MATRIZ-----");
        for (int i=0; i<3; i++){
            for (int j=0; j<5; j++){
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
