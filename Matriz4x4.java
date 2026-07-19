
package pkg7.matriz4x4;

//@author Sharyk Esthefanía Pineda Maza

import java.util.Scanner;

public class Matriz4x4 {

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int [][] matriz=new int[4][4];
        int sumTotal=0;
        
        for(int i=0; i<4; i++){
            for(int j=0; j<4; j++){
                System.out.println("Ingrese un numero: ");
                matriz[i][j]=s.nextInt();
                sumTotal+= matriz[i][j];
            }
        }
        System.out.println("Suma total de los numeros: "+sumTotal);
    }
}
