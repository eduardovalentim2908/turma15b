package exercicios.exercicio03;

public class AppVeiculo {
    public static void main(String[] args) {
        Veiculo v1 = new Veiculo("Honda", "Civic", 9.9);
        Veiculo v2 = new Veiculo("Toyota", "Corolla", 10.9);


        v1.apresentar();
        System.out.printf("O consumo é: %.2f\n" , v1.obterConsumo() );
        v2.apresentar(); 
        System.out.printf("O consumo é: %.2f\n" , v2.obterConsumo() );
    }
}
