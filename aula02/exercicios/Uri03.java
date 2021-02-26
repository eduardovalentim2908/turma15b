package exercicios;

import java.util.Scanner;

public class Uri03 {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        double valorPeca1, valorPeca2, valorTotal;
        int codPeca1, codPeca2, qtdePeca1,qtdePeca2;

        codPeca1 = teclado.nextInt(); qtdePeca1 = teclado.nextInt(); valorPeca1 = teclado.nextDouble();

        codPeca2 = teclado.nextInt(); qtdePeca2 = teclado.nextInt(); valorPeca2 = teclado.nextDouble();
        
        valorTotal = ((qtdePeca1 * valorPeca1) + (qtdePeca2 * valorPeca2));

        System.out.printf("VALOR A PAGAR: R$ %.2f", valorTotal);
        System.out.println(codPeca1 + codPeca2);
        teclado.close();
    }    
}
