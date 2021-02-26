package exercicios;

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
      int valor;
      String resposta;
      valor = 0;
      Scanner teclado = new Scanner(System.in);

      System.out.println("Digite um valor para saber se é par ou impar.");
      valor = teclado.nextInt();
           
      resposta = valida(valor);

      System.out.println("O numero digitado é par? " + resposta);
      teclado.close();
   }

    static String valida(int numero){
      String resposta;  
    
      if(numero % 2 == 0){
        resposta = "Sim";
        return resposta;

        }else{
            resposta = "Não";
            return resposta;
        }
    
    }

}
