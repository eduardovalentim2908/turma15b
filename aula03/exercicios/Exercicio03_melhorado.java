package exercicios;

import java.util.Scanner;

public class Exercicio03_melhorado {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numero, resultado;
        resultado = 1;
        System.out.println("Informe o numero limite.");
        numero = teclado.nextInt();
        while(resultado <= (numero / 2)){
            System.out.print(resultado + ", ");
            resultado *= 2;
        }    
            System.out.print(resultado + ".");
                teclado.close();   
    }
}
