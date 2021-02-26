package uri;

import java.util.Scanner;

public class Uri1048 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double valor;
        
        valor = teclado.nextDouble();
            if (valor >= 0 && valor <= 400){
                System.out.printf("Novo salario: %.2f\n" , valor * 1.15);
                System.out.printf("Reajuste ganho: %.2f\n" , ((valor * 1.15) - valor));
                System.out.println("Em percentual: 15 %");                
            }else{
                if (valor > 400 && valor <= 800){
                    System.out.printf("Novo salario: %.2f\n" , valor * 1.12);
                    System.out.printf("Reajuste ganho: %.2f\n" , ((valor * 1.12) - valor));
                    System.out.println("Em percentual: 12 %");
                }else{
                    if (valor > 800 && valor <= 1200){
                        System.out.printf("Novo salario: %.2f\n" , valor * 1.10);
                        System.out.printf("Reajuste ganho: %.2f\n" , ((valor * 1.10) - valor));
                        System.out.println("Em percentual: 10 %");
                    }else{
                        if (valor > 1200 && valor <=2000){
                            System.out.printf("Novo salario: %.2f\n" , valor * 1.07);  
                            System.out.printf("Reajuste ganho: %.2f\n" , ((valor * 1.07) - valor));  
                            System.out.println("Em percentual: 7 %");  
                        }else{
                            System.out.printf("Novo salario: %.2f\n" , valor * 1.04);
                            System.out.printf("Reajuste ganho: %.2f\n" , ((valor * 1.04) - valor));
                            System.out.println("Em percentual: 4 %");
                        }
                    }
                }               
                teclado.close(); 

    }
}
}