package exercicios;

import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int i, numero, ordem, pares, somapares, impares;

        numero = 0;
        ordem = 1;
        pares = 0;
        impares = 0;
        somapares = 0;

        for(i=0;i < 10;i++){
            System.out.println("Digite o " + ordem + "° numero.");
            numero = teclado.nextInt();
                if (numero % 2 == 0){
                    pares++;
                    somapares += numero;
                }else{
                    impares++;
                }
                ordem++;
        }
        System.out.println("A média dos valores pares é: " + (somapares / pares));
        System.out.println("O percentual de numero impares dentre os digitados é: " + (impares * 10.0) + "%");
        teclado.close();
    }
}
