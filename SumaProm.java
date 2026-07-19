
package pkg2.sumaprom;
//@author Sharyk Esthefanía Pineda Maza

import java.util.Scanner;

public class SumaProm {

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        double[] num= new double[10];
        double sum=0;
        
        for (int i=0; i<10; i++) {
            System.out.println("Ingrese un numero real: ");
            num[i]=s.nextDouble();
            sum+=num[i];
        }
        double prom=sum/10;
        
        System.out.println("-----RESULTADOS-----");
        System.out.println("Suma total: " +sum);
        System.out.println("Promedio: " +prom);
    }
}
