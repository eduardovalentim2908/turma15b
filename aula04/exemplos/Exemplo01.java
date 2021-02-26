package exemplos;

public class Exemplo01 {
    public static void main(String[] args) {
        System.out.println("Programa de cadastro de clientes!");
        linha2(33); // chamado de um metodo fora do main
        System.out.println("Bom dia!");
        linha();

        linha3(35, '*');
        linha3(35, '#');
    }

    static void linha(){
        System.out.println("-----------------");
    }
    
    static void linha2(int tamanho){
                
        for (int i = 0; i < tamanho; i++){
            System.out.print("-");
        }
        System.out.println();
    }


    static void linha3(int tamanho, char tipo){
                
        for (int i = 0; i < tamanho; i++){
            System.out.print(tipo);
        }
        System.out.println();
    }
}

