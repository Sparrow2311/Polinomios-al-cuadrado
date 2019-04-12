
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author EmilioJesus
 */
public class polinomios
{
    public static int a,b,c,discriminante;
    public void discriminante()
    {
         Scanner x=new Scanner(System.in);
         try
         {
         System.out.println("ingrese el valor a");
         a=x.nextInt();
         
             if (a==0) 
             {
                 System.out.println("el valor no puede ser 0");
                 discriminante();
                 
             }else
             {
            
          
          System.out.println("ingrese el valor b");
          b=x.nextInt();
          System.out.println("ingrese el valor c");
          c=x.nextInt();
             }
         }catch(Exception e)
         {
             System.out.println("el valor no es numerico");
         }
         
         
    }
    
    public void calcular_caso()
    {
        int valor,hola;
        hola=b*b;
        valor=a*c;
        discriminante=hola-4*valor;
        System.out.println("el valor del discrimante es: "+discriminante);
        if (b==0) 
        {
            System.out.println("quinto caso");
            caso5();
            
        }else if (a==1) 
        {
            System.out.println("cuarto caso");
            caso4();
            
        }else if (discriminante>0) 
        {
            System.out.println("primer caso");
            caso1();
            
        }else if (discriminante==0)
        {
              System.out.println("segundo caso");
              caso2();
            
        }else if (discriminante<0)
        {
             System.out.println("tercer caso");
             caso3();
            
        }
    }
    
   
    public void caso1()
    {
        double ecuacion,ecuacion1,operacion,operacion1,operacion2,operacion4,operacion3;
        operacion=2*a;
        operacion1=b/operacion*-1;
        operacion2=2*a;
        operacion3= (double) Math.sqrt(discriminante);
        operacion4=operacion3/operacion2;
        ecuacion=operacion1+operacion4;
        ecuacion1=operacion1-operacion4;
        System.out.println("primera raiz "+ecuacion);
        System.out.println("segunda raiz "+ecuacion1);
        
        
    }
    public void caso2()
    {
        double ecuacion,operacion;
        operacion=2*a;
        ecuacion=b/operacion;
        System.out.println("resultado del segundo caso "+ecuacion);
        
    }
    public void caso3()
    {
        double ecuacion,ecuacion1,operacion,operacion1,operacion2,operacion4,operacion3;
        operacion=2*a;
        operacion1=b/operacion*-1;
        operacion2=2*a;
        operacion3= (double) Math.sqrt(discriminante*-1);
        operacion4=operacion3/operacion2;
        ecuacion=operacion1+operacion4;
        ecuacion1=operacion1-operacion4;
        System.out.println(""+operacion3);
        System.out.println("primera raiz "+ecuacion);
        System.out.println("segunda raiz "+ecuacion1);
        
        
    }
    
    
    public void caso4()
    {
        float resultado,resultado1,resultado2,resultado3,opera,division;
        opera=(float)b/2*-1;
        resultado=b*b;
        division=resultado/4-c;
        resultado1=(float) Math.sqrt(division);
        resultado2=opera+resultado1;
        resultado3=opera-resultado1;
        System.out.println(""+opera);
        System.out.println(""+resultado1);
        System.out.println("primera raiz "+resultado2);
        System.out.println("segunda raiz "+resultado3);
        
        
        
        
    }
    
    public void caso5()
    {
        double operacion,operacion1,operacion2,operacion3;
        operacion=c/a*-1;
        operacion1=(double) Math.sqrt(operacion);
        operacion2=-operacion1;
        operacion3=+operacion1;
        System.out.println("primera raiz "+operacion2);
        System.out.println("segunda raiz "+operacion3);
        
        
    }
    



    public static void main(String []args)
    {
       
       polinomios x=new polinomios();
       x.discriminante();
       x.calcular_caso();
       
    }
    
}
