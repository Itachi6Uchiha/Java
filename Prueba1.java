# Java

package Prueba1;

 
    
import java.util.Scanner;
   
public class Prueba1 {
    public static void main(String[] args){
        Scanner entrada = new Scanner (System.in);
        int x, y;
        operaciones op = new operaciones();
        System.out.println("Ingrese el Valor");
        x = entrada.nextInt();
        System.out.println("Ingrese el Valor");
        y = entrada.nextInt();
        op.suma(x, y);
        op.mostrar();
        op.resta(x, y);
        op.mostrar();
        op.divicion(x, y);
        op.mostrar();
        op.multiplicacion(x, y);
        op.mostrar();
        
    
    }
    
}
