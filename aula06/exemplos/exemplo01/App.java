package exemplos.exemplo01;

public class App {
    public static void main(String[] args) {
        Funcionario f = new Funcionario("Armando", 5000);
        Gerente g = new Gerente("Ricardo", 5000, 15);
        
        f.aumentaSalario(10);
        g.aumentaSalario(10);  
        System.out.println("Funcionário: " + f);
        System.out.println("Gerente: " + g);
        //System.out.println("O gerente esta responsável por " + g.getNumeroFuncionarios()+ " funcionarios.");

        
    }
}
