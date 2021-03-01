package exercicios.exercicio01;

public class App {
    public static void main(String[] args) {
        Placar p1 = new Placar();
        Placar p2 = new Placar("Milan", "São Paulo");
        Placar p3 = new Placar("Milan", "São Paulo", 2, 3);

        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
        

    }
}
