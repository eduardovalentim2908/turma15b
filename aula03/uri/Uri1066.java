package uri;

import java.util.Scanner;

public class Uri1066 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int a, positivo, negativo, pares, impares, i;

        i = 1;
        pares = 0;
        impares = 0;
        negativo = 0;
        positivo = 0;
        a = 0;

        while (i < 6){
            a = teclado.nextInt();
            if(a > 0){
                positivo ++;        
            }            
            
            if (a < 0){
                negativo ++;
            }

            if (a % 2 == 0){
                pares ++;        
            }else{
                impares++;
            }
            i ++;
        }
        System.out.println(pares + " valor(es) par(es)");
        System.out.println(impares + " valor(es) impar(es)");
        System.out.println(positivo + " valor(es) positivo(s)");
        System.out.println(negativo + " valor(es) negativo(s)");
        teclado.close();
    }
}
