package exercicios;

import java.util.Scanner;

public class Uri01 {
    public static void main(String[] args) {
                
        Scanner teclado = new Scanner(System.in);
        int valorA, valorB, soma;
   
        valorA = teclado.nextInt();
        valorB = teclado.nextInt();

        soma = valorA + valorB;

        System.out.println("SOMA = " + soma);

        teclado.close(); 
    }    
}
