package exemplos.exemplo01;

import java.util.HashMap;

public class GerenciaContas {
    private HashMap<Integer, Conta> mapadecontas;

    public GerenciaContas(){
        mapadecontas = new HashMap<>();

    }

    public void novaContaCorrente(int numeroConta){
        ContaCorrente cc = null;
        cc = new ContaCorrente(numeroConta);
        mapadecontas.put(numeroConta, cc);
    }

    public void novaContaEspecial(int numeroConta, double limite){
        ContaEspecial ce = null;
        ce = new ContaEspecial(numeroConta, limite);
        mapadecontas.put(numeroConta, ce); 
    }

    public void novaContaPoupanca(int numeroConta){
        ContaPoupanca cp = null;
        cp = new ContaPoupanca(numeroConta);
        mapadecontas.put(numeroConta, cp);
    }

    public boolean deposito(int numeroConta, Double valor){
        Conta conta = mapadecontas.get(numeroConta);
            if(conta != null){
                return conta.deposito(valor);    
            }
            return false;
        }

    public boolean saque(int numeroConta, Double valor){
        Conta conta = mapadecontas.get(numeroConta);
            if(conta != null){
                return conta.saque(valor);
            }
                return false;        
        }
                
    public String exibirSaldo(int numeroConta){
        Conta conta = mapadecontas.get(numeroConta);
            if(conta != null){
                return conta.toString();
            }
            return "Conta não encontrada";       
    }

}
