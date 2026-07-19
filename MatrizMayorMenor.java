
package pkg9.matrizmayormenor;

//@author Sharyk Esthefanía Pineda Maza

import java.util.Scanner;

public class MatrizMayorMenor {

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int[][] matriz=new int[5][5];
        int mayor=matriz[0][0];
        int menor=matriz[0][0];
        
        for (int i=0; i<5; i++) {
            for (int j=0; j<5; j++){
                 System.out.println("Ingrese un numero: ");
                 matriz[i][j]=s.nextInt();
            }
        }
        for (int i=0; i<5; i++){
            for (int j=0; j<5; j++){
                if (matriz[i][j] > mayor) {
                    mayor=matriz[i][j];
                }
                if (matriz[i][j] < menor) {
                    menor=matriz[i][j];
                }
            }
        }
        System.out.println("-----RESULTADOR-----");
        System.out.println("Mayor valor: " +mayor);
        System.out.println("Menor valor: " +menor);
    }
}
