package exercicios.exercicio03;

public class ContaPoupanca extends Conta{
    private String tipo;
    private static double taxasaque;

    
    public ContaPoupanca(int numAgencia, int numConta, int digitoConta, double saldo, String tipo){

        super(numAgencia, numConta, digitoConta, saldo);
        this.tipo = tipo;
    }


    public String toString(){
        return super.toString() + " Tipo: " + tipo;
    }

    public static void setTaxaSaque(double taxa) {
        if (taxa > 0){
            taxasaque = taxa;
        }
    }

    @Override
    public boolean deposito(double valor) {
        // TODO Auto-generated method stub
        return super.deposito(valor);
    }

    @Override
    public boolean saque(double valor) {
        // TODO Auto-generated method stub
        if (getSaldo() >= valor + taxasaque){
            return super.saque(valor + taxasaque);        
        }
        return false;
    }



}
