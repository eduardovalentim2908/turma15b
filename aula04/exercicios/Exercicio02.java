package exercicios;

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int valor1, valor2, valor3, resultado;
        
        System.out.println("Digite tres numeros.");
        valor1 = teclado.nextInt();
        valor2 = teclado.nextInt();
        valor3 = teclado.nextInt();

        resultado = menor(valor1, valor2, valor3);
        System.out.println("O menor numero dos três digitados é: " + resultado);
        teclado.close();
    }

    static int menor(int a, int b, int c){
        int resposta;

        if (a <= b && a <= c){
            resposta = a;
            return resposta;
        
        }else{
            if (b <= c){
                resposta = b;
                return resposta;
        
            }else{
                resposta = c;
                return resposta;
            }
        }
    }
}
