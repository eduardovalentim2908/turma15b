package exercicios;

import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numero, resultado, cont;
        
        cont = 1;
        numero = 1;
        resultado = 0;
        
        while(numero != 0){
            System.out.println("Digite o  " + cont + "° número.");
            numero = teclado.nextInt();
            resultado += numero;
            cont ++;
        }
        
        System.out.println("O resultado da soma dos numeros digitados é: " + resultado);
        
        teclado.close();
    }
}
