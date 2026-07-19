
package pkg5.modifiarreglo;

//@author Sharyk Esthefanía Pineda Maza

import java.util.Scanner;

public class ModifiArreglo {

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int[] numeros=new int[12];
        
        for (int i=0; i<12; i++) {
            int num;
            do {
                System.out.println("Ingrese un número positivo para la posición " +i+ ":");
                num=s.nextInt();
                if (num<0) {
                    System.out.println("Invalido: el número debe ser positivo");
                }
            }while (num<0);
            numeros[i]= num+i;
        }
        System.out.println("-----ARREGLO FINAL-----");
        for (int i=0; i<12; i++) {
            System.out.println("Posición " +i+ ":" +numeros[i]);
        }
    }
    
}
