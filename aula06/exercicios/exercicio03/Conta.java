package exercicios.exercicio03;

public class Conta {
    private int numAgencia, numConta, digitoConta; 
    private double saldo;
    
   
    public Conta(int numAgencia, int numConta, int digitoConta, double saldo){
        this.numAgencia = numAgencia;
        this.numConta = numConta;
        this.digitoConta = digitoConta;
        this.saldo = saldo;
    
        
    }
    
    public boolean deposito(double valor){
        if (valor > 0){
            saldo += valor;
            return true;
        }
        return false;
    }
    
    public double getSaldo(){
        return saldo;
    }

    public boolean saque(double valor){
        if (saldo > 0){
            saldo -= valor;
            return true;
        }
        return false;
    }



   public String toString(){
    return "Agencia: " + numAgencia + " Conta: " + numConta + "-" + digitoConta + " Saldo: R$ " + saldo;

}


   
}
