package exemplos;

import java.util.Scanner;

public class Exemplo03 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int i, valor; 
        
      System.out.println("Digite o valor.");
       valor = teclado.nextInt();

        for(i=1;i<=10;i++){
            
            
            System.out.println(i);
            System.out.println(valor);
            teclado.close();
        }
        

    }

}
