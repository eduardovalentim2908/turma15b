package exemplos;

import java.util.ArrayList;

public class Exemplo02 {
    public static void main(String[] args) {
        ArrayList<Integer> lista = new ArrayList<>();

        lista.add(10);
        lista.add(56);
        lista.add(23);
        lista.add(76);

        System.out.println(lista);
        
        System.out.println(lista.get(1));

        for (int i = 0; i < lista.size(); i++) {
            System.out.println("Procurando no indice: " + i);
            if (lista.get(i) == 56){
                System.out.println("Achei o valor no indice: " + i);
                break;
            }
        }

    }
}
