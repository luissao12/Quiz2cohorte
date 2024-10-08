
package altura;

import java.util.Scanner;


public class Altura {

   
    public static void main(String[] args) {
     Scanner sc = new Scanner (System.in);
       double [] estatura = new double [5];
       int promedioMenor=0;
       int promedioMayor=0;
       double suma = 0;
       
       for (int i = 0; i<estatura.length;i++)
       {
           System.out.println("Escriba la estatura" );
           estatura[i]=sc.nextDouble();
           suma+=estatura[i];
           
       }
       
       double promedio = suma/5;
        System.out.println("promedio de las alturas es:"+promedio );
       for(int i =0;i<estatura.length;i++)
       {    
           if (estatura[i]>suma)
           {
               promedioMayor++;
           }
           else
           {
               promedioMenor++;
           }
       }
        System.out.println("si hay"+promedioMayor+"personas arriba del promedio");
        System.out.println("si hay"+promedioMenor+"personas debajo del promedio");
    }
    }