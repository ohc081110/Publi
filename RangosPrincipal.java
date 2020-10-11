//Unidad 3 

package rangos;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Hernandez
 */
public class RangosPrincipal {

    
    public static void main(String[] args) 
    {
        boolean salir = false;
        Scanner entrada = new Scanner (System.in);
        int opc = 0,  numero1=0, numero2=0;
        Datos d;
        while(!salir)
       {
         System.out.println("---------Menu Principal +Conteo Numerico+-------");
         System.out.println("1.- Autogenerar Rangos");
         System.out.println("2.- Ingresar Rango Final");
         System.out.println("3.- Ingresar Rango Inicial y Final "); 
         System.out.println("4.- Salir"); 
        System.out.println("---------+------------------------+-------------");
          try {
                System.out.print("Selecciona una opcion: ");        
                opc=entrada.nextInt();
                entrada.nextLine();
                
                 if (opc==1)
                 {                   
                   System.out.println("Datos generados por el Sistema");
                   d = new Datos();                   
                 }
                 
                  if (opc==2)
                 {   
                   do{
                      System.out.print("Ingresa un numero mayor que cero: ");
                      numero1=entrada.nextInt();
                   } while (numero1<=0);  
                      d = new Datos(numero1);                   
                 }
                  
                  if (opc==3)
                 { 
                   do{  
                        System.out.print("Ingresa un numero para rango inicial (menor que cero): ");
                        numero1=entrada.nextInt();
                      } while (numero1>=0);  
                   do{
                      System.out.print("Ingresa un numero para rango final mayor que cero"
                              + ": ");
                      numero2=entrada.nextInt();  
                   } while (numero2<=0);  
                   d = new Datos(numero1,numero2);                   
                 }
        
                 if (opc==4)
                 {
                   System.out.println("Salir del Sistema...Gracias por participar!!");
                   salir=true;
                   System.exit(0);
                 }
        
        
        } catch (InputMismatchException e) {
                System.out.println("Debes ingresar un número");
                entrada.next();
            }
        
       }
    }
    
}
