package exemplos.exemplo01;

public class Funcionario {
    private String nome;
    private double salario;  
    
    public Funcionario(){

    }
    
    public Funcionario (String nome, double salario){
      this.nome = nome;
      this.salario = salario;
    }

    public void setNome(String nome){
        this.nome = nome;

    }

    public String getNome(){
        return nome;

    }

    public String exibir(){
      return nome + " : " + salario;  
    }

    public String toString(){
        return nome + " : " + salario;
    }

    public void aumentaSalario(double percentual){
        this.salario = salario + salario * percentual / 100;

    }

}
