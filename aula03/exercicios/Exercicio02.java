package exercicios;

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int fator,numero,resultado;
        fator = 0;
        resultado = 0;
        System.out.println("Favor entrar com o numero da tabuada que deseja verificar.");
        numero = teclado.nextInt();

        while (fator <= 10){
            resultado = numero * fator;
            System.out.println(numero + " x " + fator + " = " + resultado);
            fator++;
        }
        System.out.println("Fim da tabuada do numero " + numero);
        teclado.close();
    }
}
