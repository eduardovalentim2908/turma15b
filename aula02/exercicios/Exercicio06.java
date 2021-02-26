package exercicios;

import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double salario;
        System.out.println("Digite o salario bruto do funcionário.");
        salario = teclado.nextDouble();
        if (salario > 2000){
            System.out.println("Aliquota de INSS de 30%, a ser descontado do salario bruto.");
        }else{
            if (salario > 1200){
                System.out.println("Aliquota de INSS de 25%, a ser descontado do salario bruto.");
            }else{
                if (salario > 600){
                    System.out.println("Aliquota de INSS de 20%, a ser descontado do salario bruto.");
                }else{
                    System.out.println("Isento da aliquota de INSS, não haverá desconto do salario bruto.");
                }
            teclado.close();
            }
        }

    }
}
