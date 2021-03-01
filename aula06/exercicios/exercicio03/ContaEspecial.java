package exercicios.exercicio03;

public class ContaEspecial extends Conta{
    private String tipo;
    private double limite = 1000;
    private final double taxadep = 0.10;
    
    public ContaEspecial(int numAgencia, int numConta, int digitoConta, double saldo, String tipo){

        super(numAgencia, numConta, digitoConta, saldo);
        this.tipo = tipo;
    }


    public String toString(){
        return super.toString() + " Tipo: " + tipo;
    }

    @Override
    public boolean deposito(double valor) {
        // TODO Auto-generated method stub
        return super.deposito(valor - taxadep);
    }

    @Override
    public boolean saque(double valor) {
        // TODO Auto-generated method stub
        if (getSaldo() >= valor - limite){
            return super.saque(valor);        
        }
        return false;


    }


}
