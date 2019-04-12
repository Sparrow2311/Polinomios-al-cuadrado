package polinomiocuadrado;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Miguel Ponce
 */
public class PolinomioCuadrado {
private double resultado=0.0;

    /** Calcular Determinante
     * @param a 
     * @param b
     
     * @param c
     */
    public void determinante(int a,int b,int c){
        double cuadrado = (b)*(b);
        double mult = (a)*(c);
        double cuatro= (4)*(mult);
        resultado = cuadrado - cuatro;
        if (a==0) {
            System.out.println("A es igual a 0");
            cuandoAEsIgualACero(a, b, c);
        }
        if (a!=1){
            System.out.println("Cuando A es diferente a 1");
            cuandoAEsDiferenteAUno(a, b, c);
        }
        
   
        if(resultado>0){
            System.out.println("Tipo 1: Existen dos raices distintas");
            tipo1(a,b,c);
        }
        if(resultado==0){
            System.out.println("Tipo 2: Existe solo una raiz ");
            tipo2(a,b);
        }
        if(resultado<0){
            System.out.println("Tipo 3: No tiene raices reales");
            tipo3(a,b,c);
        }
        System.out.println("El valor del determinante es: "+resultado);        
    }
    
    /** 2 Raices Reales Conjugadas 
     * @param a coexificiente de la forma ax
     * @param b
     * @param c
     */
    public void cuandoAEsIgualACero(float a, float b, float c){
    	float p1 = -(b/2);
    	float p2 = (b*b/4)-c;
    	float p3 = (float) Math.sqrt(p2);
        float positivo= p1 + p3;
        float negativo= p1 - p3;
    	System.out.println("La raiz es: "+positivo);
    	System.out.println("la "+negativo);
    }
    public void cuandoBXEsIgualCero(float a, float b, float c){
        float p1 = -(b/a);
        float p2 = (float) Math.sqrt(p1);
        
        System.out.println("La raiz es:"+p2);
        
    }
    public void cuandoAEsDiferenteAUno(float a, float b, float c){
        
        
        float p1= (float) Math.sqrt(a);
        
        System.out.println("La raiz es: "+p1);
        
        
    }
    
    public void tipo1(int a,int b,int c){
        double raiz,operacion1,operacion2,operacion3,raiz2;       
        double discriminante=resultado;
            operacion1=(-b)/(2*a);
            operacion2=  Math.sqrt(discriminante);
            operacion3= (operacion2)/(2*a);
            raiz= (operacion1 - operacion3);
            System.out.println("Primer Raiz: "+raiz);
            raiz2= operacion1 + operacion3;
            System.out.println("Segunda Raiz: " +raiz2 );    
    }
    
    /** 1 Raiz Real 
     * @param a the command line arguments
     * @param b
     */
     public void tipo2(int a,int b){
         double raiz;
         raiz= (-b)/(2*a);
         System.out.println("La raiz es: "+raiz);
     }
     
     /** 2 Raices Complejas Conjugadas 
     * @param a the command line arguments
     * @param b
     * @param c
     */
    public void tipo3(int a,int b,int c){
        double operacion1,operacion2,operacion3,raiz,raiz2;       
        double discriminante=resultado;
            operacion1=(-b)/(2*a);
            operacion2=  Math.sqrt(- discriminante);
            operacion3= (operacion2)/(2*a);
            //raiz= (operacion1 - operacion3);
            System.out.println("Primer Raiz: "+operacion1 +" + " +operacion3 +" i");
            //raiz2= operacion1 + operacion3;
            System.out.println("Segunda Raiz: " +operacion1+ " + " +operacion3+ " i" );
    }
    
    //Validacion de entrada estructura try-catch
    //Llamada de metodos y ejecucion del programa
    public static void main(String[] args) {
    int a, b, c;
    Scanner leer = new Scanner(System.in);
        try {
        System.out.println(" --- PROGRAMA PARA CALCULAR LAS RAICES DE UN POLINOMIO AL CUADRADO ---");    
        System.out.println("ingrese el valor de a");
        a = leer.nextInt();
        if(a==0){
        System.out.println("El valor de a debe ser mayor que cero");
        }else{
        System.out.println("ingrese el valor de b");
        b = leer.nextInt();
        System.out.println("ingrese el valor de c");
        c = leer.nextInt();        
        PolinomioCuadrado metodos = new PolinomioCuadrado();        
        metodos.determinante(a, b, c);
        
        }
        } catch (InputMismatchException e) {
            System.out.println(" Debes ingresar solo valores numericos" );
        }        
    }    
}
