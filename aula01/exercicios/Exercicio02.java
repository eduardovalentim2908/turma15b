package exercicios;

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double NotaMatematica, NotaPortugues, MediaFinal;

        System.out.println("Professor, digite a nota de Matemática do aluno.");
        NotaMatematica = entrada.nextDouble();
        System.out.println("Agora, digite a nota de Português.");
        NotaPortugues = entrada.nextDouble(); 
        MediaFinal = ((NotaMatematica + NotaPortugues) / 2);
        System.out.println("A média final do aluno é: " + MediaFinal);
        entrada.close();
    }    
}