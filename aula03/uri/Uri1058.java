package uri;

import java.util.Scanner;

public class Uri1058 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double salario, impostos, grupo;
        
        impostos = 0;
        salario = 0;
        grupo = 0; 
        
        salario = teclado.nextDouble();

        if(salario <= 2000){ 
            System.out.println("Isento"); 
            }else{ 
                if(salario > 4500){ 
                   grupo = salario - 4500; 
                   impostos = grupo * 0.28; 
                   salario = salario - grupo; 
                } 
                    if(salario > 3000){ 
                        grupo = salario - 3000; 
                        impostos = impostos + grupo * 0.18; 
                        salario = salario - grupo; 
                    } 
                            if(salario > 2000){ 
                                grupo = salario - 2000; 
                                impostos = impostos + grupo * 0.08; 
                                salario = salario - grupo; 
                            } 
            System.out.printf("R$ %.2f\n", impostos); 
        }    
        teclado.close();
    }
}
