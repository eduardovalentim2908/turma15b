package exemplos;

public class Exemplo04 {
    public static void main(String[] args) {
        int NumeroInt;
        double NumeroDouble;

        NumeroInt = 12;
        NumeroDouble = 10.5;

        System.out.println(NumeroInt);
        System.out.println(NumeroDouble);

        System.out.println(NumeroDouble);

        NumeroDouble = (double)NumeroInt;
        System.out.println(NumeroDouble);

        NumeroInt = (int)NumeroDouble;
        System.out.println(NumeroInt);
    }
}
