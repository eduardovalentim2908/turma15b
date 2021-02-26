package uri;

import java.util.Scanner;

public class Uri1114 {
    public static void main(String[] args) {
        int senha;
        senha = 0000;
        Scanner teclado = new Scanner(System.in);

        while(senha != 2002){
            senha = teclado.nextInt();
                if(senha != 2002){
                    System.out.println("Senha Invalida");
                }else{
                    System.out.println("Acesso Permitido");
                    teclado.close();
                }
        
        }
    }
}
