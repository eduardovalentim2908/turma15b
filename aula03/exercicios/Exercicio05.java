package exercicios;

import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int i, numero, pares, impares, ordem;
        ordem = 1;
        pares = 0;
        impares = 0;

        for(i=0;i < 10;i++){
            System.out.println("Digite o " + ordem + "° numero.");
            numero = teclado.nextInt();
                if (numero % 2 == 0){
                    pares++;
                }else{
                    impares++;
                }

            ordem++;
            }
            System.out.print("Dos numeros digitados " + pares + " são pares e ");
            System.out.print(impares + " são ímpares.");
            teclado.close();
    }
}
