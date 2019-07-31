package calculador_grados;
import java.util.Scanner;

public class Calculador_Grados {

    
    public static void main(String[] args) {
        
        
        System.out.println("eliga el tipo de grados que quiere convertir");
        System.out.println("1. Grados Centigrados a fahrenhei - 2 Grados fahrenhei a celsius - 3 Grados Celsius a Kelvin - 4 Grados Kelvin a centigrados");
        Scanner entrada = new Scanner(System.in);
        int opcion = entrada.nextInt();
        System.out.println("digite el valor de los grados a convertir");
        double grados=entrada.nextInt();
        switch (opcion) {
            case 1:
            grados=(double) (grados* 9/5) + 32;
             System.out.println(grados);
            break;
            case 2:
            grados=(double) ((grados -32)*5) / 9;
             System.out.println(grados);
            break;
            case 3:
            grados=(double) (grados +  273.15);
             System.out.println(grados);
            break;
            case 4:
            grados=(double) (grados -  273.15);
             System.out.println(grados);
            break;
            }
        }
        
        
  
    
}
