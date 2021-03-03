package exercicios.exercicio03;

public class Proprietario {
    private String nome, telefone;

    
    public Proprietario(){
        nome = "Sem cadastro";
        telefone = "(XX) XXXXX-XXXX";
   }
    
    public Proprietario(String nome, String telefone){
        this.nome = nome;
        this.telefone = telefone;
        }

    public String toString(){
        return nome + telefone;
    }
}
