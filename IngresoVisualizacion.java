
package pkg1.ingresovisualizacion;
//@author Sharyk Esthefanía Pineda Maza
import java.util.Scanner;
public class IngresoVisualizacion {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int[] num= new int[10];
        
        for(int i=0; i<10; i++) {
            System.out.println("Ingrese el numero para la posición " +i+ ":");
            num[i]=s.nextInt();
        }
        System.out.println("Valores almacenados: ");
        for (int i=0; i<10; i++) {
            System.out.println("Posición " +i+ ":" +num[i]);
        }
    }
}
