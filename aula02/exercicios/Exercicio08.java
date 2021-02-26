package exercicios;

import java.util.Scanner;

public interface Exercicio08 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double ladoA, ladoB, ladoC;
        System.out.println("Digite o valor do lado A.");
        ladoA = teclado.nextDouble();
        System.out.println("Digite o valor do lado B.");
        ladoB = teclado.nextDouble();
        System.out.println("Digite o valor do lado C.");
        ladoC = teclado.nextDouble();

        if ((ladoA > (ladoB + ladoC)) || (ladoB > (ladoA + ladoC)) || (ladoC > (ladoA + ladoB))){
            System.out.println("Não podemos formar um triangulo.");
        }else {
            if ((ladoA == ladoB) && (ladoB == ladoC)){
                System.out.println("Esse é um triangulo equilatero.");
            }else{
                if ((ladoA == ladoB) || (ladoA == ladoC) || (ladoB == ladoC)){
                    System.out.println("Esse é um triangulo isoceles.");
            }else{
                System.out.println("Esse é um triangulo escaleno.");
            }
        }
    teclado.close();
    }
    }
}