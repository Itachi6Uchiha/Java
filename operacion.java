# Java
package Prueba1;

public class operaciones {
    double a,b,c;
    
    public void suma(int a1, int b1){
        a = a1;
        b = b1;
        c = a+b;
    }
    
    public void resta(int a1, int b1){
        a = a1;
        b = b1;
        c = a-b;
    }
    
    public void divicion(int a1, int b1){
        a = a1;
        b = b1;
        c = a/b;
    }
    
    public void multiplicacion(int a1, int b1){
        a = a1;
        b = b1;
        c = a*b;
    }
    public void mostrar(){
        System.out.println("el resultado es:  " + c);
    }

}
