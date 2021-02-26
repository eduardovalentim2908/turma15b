package exercicios;

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numero;
        System.out.println("Digite um numero inteiro.");
        numero = teclado.nextInt();

        if (numero > 20) {
            System.out.println("A metade do numero digitado é: " + (numero / 2.0));
        } else {
            System.out.println("O numero digitado é menor ou igual a 20!");
        }
        System.out.println("Fim do Programa!");
        teclado.close();
    }
}
