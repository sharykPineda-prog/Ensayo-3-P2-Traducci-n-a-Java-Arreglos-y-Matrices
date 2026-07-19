
package pkg6.matriz3x4;

//@author Sharyk Esthefanía Pineda Maza

import java.util.Scanner;

public class Matriz3x4 {

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int[][] matriz=new int[3][4];
        for (int i=0; i<3; i++) {
            for (int j=0; j<4; j++) {
                System.out.print("Ingrese un número [" +i+ "][" +j+ "]: ");
                matriz[i][j]=s.nextInt();
            }
        }
        System.out.println("-----MATRIZ RESULTANTE-----");
        for (int i=0; i<3; i++) {
            for (int j=0; j<4; j++) {
                System.out.print(matriz[i][j]);
                if (j<3){
                    System.out.print("   |   ");
                }
            }
            System.out.println(" ");
        }
    }
}
