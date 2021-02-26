package uri;

import java.util.Scanner;

public class Uri1051 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in); 
        double salario, impostos=0, grupos;
        impostos = 0; 
        grupos = 0;
 
         salario = entrada.nextDouble(); 
 
         if(salario <= 2000){ 
             System.out.println("Isento"); 
         }else{ 
             if(salario > 4500){ 
                 grupos = salario - 4500; 
                 impostos = grupos * 0.28; 
                 salario = salario - grupos; 
             } 
             if(salario > 3000){ 
                 grupos = salario - 3000; 
                 impostos = impostos + grupos * 0.18; 
                 salario = salario - grupos; 
             } 
             if(salario > 2000){ 
                 grupos = salario - 2000; 
                 impostos = impostos + grupos * 0.08; 
                 salario = salario - grupos; 
             } 
 

             System.out.printf("R$ %.2f\n", impostos); 
         } 
 
 
         entrada.close(); 

    }
}
