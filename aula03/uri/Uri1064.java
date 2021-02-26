package uri;

import java.util.Scanner;

public class Uri1064 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int i, contagem;
        double soma, numero;

        i = 1;
        numero = 0;
        contagem = 0;
        soma = 0;

        while(i < 7){
        numero = teclado.nextDouble();
            if (numero >= 0){
                contagem++;
                soma += numero;
            }
            i++;

        }
        System.out.println(contagem + " valores positivos");
        System.out.printf("%.1f\n" , soma / contagem);
        teclado.close();

    }
}
