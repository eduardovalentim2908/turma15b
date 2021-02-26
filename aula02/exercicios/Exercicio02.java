
package exercicios;

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double nota1, nota2, media;
        System.out.println("Digite a primeira nota do aluno!");
        nota1 = teclado.nextDouble();
        System.out.println("Digite a segunda nota do aluno!");
        nota2 = teclado.nextDouble();

        media = ((nota1 * 0.40) + (nota2 * 0.60));

        if (media >= 6){
            System.out.println("Aluno Aprovado!");
        }else {
            System.out.println("Aluno Reprovado!");
        }
        System.out.println("A média do aluno é: " + media);

        teclado.close();
    }

}

