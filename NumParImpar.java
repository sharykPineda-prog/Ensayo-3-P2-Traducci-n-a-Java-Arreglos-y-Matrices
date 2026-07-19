
package pkg4.numparimpar;

//@author Sharyk Esthefanía Pineda Maza

import java.util.Scanner;


public class NumParImpar {

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int[] num= new int[20];
        
        int cantPares=0, cantImpares=0;
        int sumPares=0, sumImpares=0;
        
        for(int i=0; i<20; i++) {
            System.out.println("Ingrese un numero entero: ");
            num[i]= s.nextInt();
            
            if (num[i] % 2==0) {
                cantPares++;
                sumPares+= num[i];
            }else {
                cantImpares++;
                sumImpares+= num[i];
            }
        }
        System.out.println("-----RESULTADOS-----");
        System.out.println("Cantidad de números pares: " +cantPares);
        System.out.println("Cantidad de números impares: " +cantImpares);
        System.out.println("Suma de los pares: " +sumPares);
        System.out.println("Suma de los impares: " +sumImpares);
    }
}
