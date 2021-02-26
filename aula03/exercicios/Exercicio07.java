package exercicios;

import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double nota, mediaturma, mediageral;
        int t, a;
        mediaturma = 0;
        mediageral = 0;
        t =1;
        a = 1; 
        while(t <= 2){
            mediaturma = 0;
            while (a < 3){
                System.out.println("Digite a nota do " + a + "°aluno.");
                nota = teclado.nextDouble();
                mediaturma += nota;
                a++;
                mediaturma = mediaturma / a;
                mediageral = mediageral + mediaturma;
                
            }
            System.out.println("A média da turma" + t + "é: " + mediaturma);   
            t++;

        }
        System.out.println("A média geral é: " + mediageral / t);

        teclado.close();

    }
}
