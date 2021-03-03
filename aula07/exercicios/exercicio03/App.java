package exercicios.exercicio03;

public class App {
    public static void main(String[] args) {
        Animal animal1 = new Animal("Bidu", "Pastor Alemão", 2020);

        Proprietario proprietario = new Proprietario("Ademir", "(11) 93452-9876");
        Animal animal2 = new Animal("Timtim", "Pincher", 2016, proprietario);

        System.out.println(animal1);
        System.out.println(animal2);
    }
}
