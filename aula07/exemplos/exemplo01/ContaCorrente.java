package exemplos.exemplo01;

public class ContaCorrente extends Conta{
    String tipo;
    private final double taxadep = 0.10;

    public ContaCorrente(int numAgencia, int numConta, int digitoConta, double saldo, String tipo){

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
        if (getSaldo() >= valor){
            return super.saque(valor);        
        }
        return false;

    }

        

    
    }





