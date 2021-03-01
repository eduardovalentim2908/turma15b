package exercicios.exercicio02;

public class App {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa("Eduardo", "(11) 91234-5678");
        Pessoa p2 = new Pessoa("Valter", "(11)98765-4321");
        
        Estudante e1 = new Estudante("Roberto", "(11) 5432-7891", "Analise de Sistemas");
        Estudante e2 = new Estudante("Marcelo", "(11) 4567-0987", "Medicina");
        
        Professor m1 = new Professor("Emerson", "(11) 3456-9876", 15000.50);
        Professor m2 = new Professor("Adalberto", "(11) 3456-9876", 12737.45);


        System.out.println("Pessoa : " + p1);
        System.out.println("Pessoa : " + p2);
        System.out.println("Estudante : " + e1);
        System.out.println("Estudante : " + e2);
        System.out.println("Professor: " + m1);
        System.out.println("Professor: " + m2);



    }
}
