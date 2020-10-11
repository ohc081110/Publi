
package rangos;
import java.util.Random;

/**
 *
 * @author Hernandez
 */
public class Datos 
{
    Random aleatorio = new Random ();
    public Datos() //constructor por defecto
    {
     
     int N1 = aleatorio.nextInt(20);
     int Nn = aleatorio.nextInt(40);
     int N2 = (Nn+1) * -1;
     int contadorp=0, contadorn=0;
     System.out.println("Los numeros son "+N1+" y "+N2);
        for (int i=N2; i<=N1; i++ )
        {
         if (i>=0)
         {
             contadorp+=1;
         }else if(i<0)
         {
         contadorn+=1;
         }
        }
        System.out.println("*************************************************************");
        System.out.println("La cantidad de numeros positivos es "+contadorp);
        System.out.println("La cantidad de numeros negativos es "+contadorn);
        System.out.println("*************************************************************");
        
    }
    
     public Datos(int a) //constructor con un argumento
    {
      
      int Nn = aleatorio.nextInt(20);
      int N2 = (Nn+1) * -1;
      int contadorp=0, contadorn=0;
      System.out.println("Los numeros son "+a+" y "+N2);
      
      for (int i=N2; i<=a; i++ )
        {
         if (i>=0)
         {
             contadorp+=1;
         }else if(i<0)
         {
         contadorn+=1;
         }
        }
      System.out.println("*************************************************************");
        System.out.println("La cantidad de numeros positivos es "+contadorp);
        System.out.println("La cantidad de numeros negativos es "+contadorn);
      System.out.println("*************************************************************");
    }
     
      public Datos(int a, int b) //constructor con dos argumentos
    {
            int contadorp=0, contadorn=0;
          System.out.println("Los numeros son "+a+" y "+b);
          for (int i=a; i<=b; i++ )
        {
         if (i>=0)
         {
             contadorp+=1;
         }else if(i<0)
         {
         contadorn+=1;
         }
        }
           System.out.println("*************************************************************");
        System.out.println("La cantidad de numeros positivos es "+contadorp);
        System.out.println("La cantidad de numeros negativos es "+contadorn);
        System.out.println("*************************************************************");
   
    }
    
}
