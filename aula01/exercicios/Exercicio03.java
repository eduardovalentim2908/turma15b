package exercicios;

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        //Import Scanner Java Util e criação da entrada do Teclado
        Scanner entrada = new Scanner(System.in); 
        // Definição das variaveis
        double SalarioAtual, SalarioNovo; 
        // Solicitação do Salario Atual ao Gestor
        System.out.println("Gestor, digite o salário atual do funcionário."); 
        //Digitação do Salario Atual do funcionário
        SalarioAtual = entrada.nextDouble(); 
        // Mensagem com informações do aumento proposto
        System.out.println("Com base no sistema de avaliação do funcionário, verificamos na politica que ele esta elegivel a um aumento de 25% a ser aplicado a partir do próximo mês."); 
        // Calculo do novo salario do funcionario
        SalarioNovo = (SalarioAtual* 1.25); 
        // Informação do novo salário ao gestor
        System.out.println("Caro Gestor, favor informar o funcionário que seu novo salário será: " + SalarioNovo); 
        // Fechando o Scanner
        entrada.close(); 
    }
}
