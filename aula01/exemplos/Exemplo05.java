package exemplos;

import java.util.Scanner;

public class Exemplo05 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero;

        System.out.println("Digite um numero inteiro");
        
        numero = entrada.nextInt();
        System.out.println("Voce digitou o numero " + numero);


        entrada.close();
    }
}
