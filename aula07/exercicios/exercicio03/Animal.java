package exercicios.exercicio03;

public class Animal {
    private String nome, raca;
    private int dataNasc;
    private Proprietario proprietario;

    public Animal(String nome, String raca, int dataNasc){
        this.nome = nome;
        this.raca = raca;
        this.dataNasc = dataNasc;
    }

    public Animal(String nome, String raca, int dataNasc, Proprietario proprietario){
        this.nome = nome;
        this.raca = raca;
        this.dataNasc = dataNasc;
        this.proprietario = proprietario;
    }

    public String toString(){
        return "Nome: " + nome + "/nRaca: " + raca + "/nData Nasc: " + dataNasc + "/nProprietário" + proprietario.toString();
    }

}
