
package pkg8.matrizdiagonal;
//@author Sharyk Esthefanía Pineda Maza
import java.util.Scanner;


public class MatrizDiagonal {

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int[][]matriz= new int[4][4];
        int sumDiagonal=0;
        for (int i = 0; i < 4; i++){
            for(int j =0; j < 4; j++){
                System.out.println("Ingrese un numero: ");
                matriz[i][j]=s.nextInt();
            }
        }
        System.out.println("Numeros de la diagonal principal: ");
        for(int i=0; i < 4; i++) {
            System.out.print(matriz[i][i] + " ");
            sumDiagonal += matriz[i][i];
        }
        System.out.println("Suma de la diagonal principal: " + sumDiagonal);
    }
}
