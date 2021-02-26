package exercicios;

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numero, resultado;
        resultado = 1;
        System.out.println("Informe o numero limite.");
        numero = teclado.nextInt();
            while (resultado <= numero){
                if(resultado <= (numero / 2)){
                    System.out.print(resultado + ", ");
                }else{
                    System.out.print(resultado);
                }
            resultado *= 2;
                }
        teclado.close();
    }
}
