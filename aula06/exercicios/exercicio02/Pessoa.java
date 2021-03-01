package exercicios.exercicio02;

public class Pessoa {
    private String nome, telefone;


    public Pessoa(){


    }

    public Pessoa(String nome, String telefone){
        this.nome = nome;
        this.telefone = telefone;



    }

    public String toString(){
        return nome + " : " + telefone;
    }
    

}
