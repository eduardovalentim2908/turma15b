package exemplos.exemplo01;


public class Gerente extends Funcionario{
    private int numeroFuncionarios;

    public Gerente(String nome, double salario, int numeroFuncionarios){
        super(nome, salario);
        this.numeroFuncionarios = numeroFuncionarios;
       
    }

    public String exibir(){
        return getNome();

    }

    public void setNumeroFuncionarios(int numeroFuncionarios){
        this.numeroFuncionarios = numeroFuncionarios;

    }

    public int getNumeroFuncionarios(){
        return numeroFuncionarios;
    }

    public String toString(){
        return super.toString() + " : " + numeroFuncionarios;

    }

    @Override
    public void aumentaSalario(double percentual) {
        // TODO Auto-generated method stub
        super.aumentaSalario(percentual + 10);
    }

    }


