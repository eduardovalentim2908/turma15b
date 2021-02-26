package exercicios;

import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String senha01;

        System.out.println("Digite a sua senha.");
        senha01 = teclado.nextLine();
        if (senha01.equals("R10p5")){
            System.out.println("Senha esta correta.");
        }else {
            System.out.println("Senha invalida.");
        }
    teclado.close();
    }
}
