package exercicios;

import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double salario, prestacao;

        System.out.println("Digite o valor do salário bruto.");
        salario = teclado.nextDouble();
        System.out.println("Digite o valor da prestação.");
        prestacao = teclado.nextDouble();

        if (prestacao > (salario * 0.30)){
            System.out.println("O credito não pode ser concedido, pois ultrapassa 30% da renda bruta.");
        } else {
            System.out.println("O credito pode ser concedido.");
        }
        teclado.close();
    }
}
