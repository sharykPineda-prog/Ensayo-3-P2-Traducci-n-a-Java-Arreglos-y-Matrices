
package mayormenor;

//@author Sharyk Esthefanía Pineda Maza

import java.util.Scanner;

public class MayorMenor {

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int[] matriz=new int[15];
        int mayor= matriz[0];
        int menor= matriz[0];
        int posMayor=0;
        int posMenor=0;
        
        for(int i=0; i<15; i++) {
                System.out.println("Ingrese un numero: ");
                matriz[i]=s.nextInt();
        }
        
        for (int i=1; i<15; i++) {
            if (matriz[i]>mayor) {
                mayor=matriz[i];
                posMayor=i;
            }
            if (matriz[i]<menor){
                menor=matriz[i];
                posMenor=i;
            }
        }
        System.out.println("-----RESULTADOS-----");
        System.out.println("Mayor valor: " +mayor);
        System.out.println("Menor valor: " +menor);
        System.out.println("Posición del mayor: [" +posMayor+ "]");
        System.out.println("Posición del menor: [" +posMenor+ "]");
    }
}
