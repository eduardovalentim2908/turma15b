package exemplos;

public class Exemplo02 {
    public static void main(String[] args) {
         double resultado;
                
        resultado = soma(3.50 , 6.00);
        System.out.println("O resultado da soma é: " + resultado);

    }

    static double soma(double num1, double num2){
        double resposta;

        resposta = num1 + num2;

        return resposta;



    }
}
