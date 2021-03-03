package exemplos.exemplo01;

import java.util.ArrayList;

public class GerenciaContas {
    private ArrayList<Conta> listaDeContas;

    public GerenciaContas(){
        listaDeContas = new ArrayList<>();

    }

    public void novaContaCorrente(int numeroConta){
        ContaCorrente cc = null;
        cc = new ContaCorrente(numeroConta);
        listaDeContas.add(cc);
    }

    public void novaContaEspecial(int numeroConta, double limite){
        ContaEspecial ce = null;
        ce = new ContaEspecial(numeroConta, limite);
        listaDeContas.add(ce); 
    }

    public void novaContaPoupanca(int numeroConta){
        ContaPoupanca cp = null;
        cp = new ContaPoupanca(numeroConta);
        listaDeContas.add(cp);
    }

    public boolean deposito(int numeroConta, Double valor){
        for(Conta conta : listaDeContas){
            if(conta.getNumero() == numeroConta){
                return conta.deposito(valor);
            }
        }
        return false;
    }

    public boolean saque(int numeroConta, Double valor){
        for(Conta conta : listaDeContas){
            if(conta.getNumero() == numeroConta){
                return conta.saque(valor);
            }
        }
        return false;

    }

    public String exibirSaldo(int numeroConta){
        for(Conta conta : listaDeContas){
            if(conta.getNumero() == numeroConta){
                return conta.toString();
            }
        }
        return "Conta não encontrada";

    }


}
