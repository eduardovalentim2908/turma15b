package exercicios.exercicio03;

public class App {
    public static void main(String[] args) {
        Conta c1 = new Conta(3827, 42537, 3, 3475.24);
       
        ContaCorrente cc1 = new ContaCorrente(3465, 32768, 0, 5000.00, "Conta Corrente");
       
        c1.deposito(557.30);
        c1.saque(948.75);
        System.out.println(c1);
        System.out.println();

        System.out.println(cc1);
        if (cc1.deposito(1000.00)){
            System.out.println("Deposito realizado.");    
        }else{
            System.out.println("Falha na operação de depósito.");
        }

        if (cc1.saque(1500.00)){
            System.out.println("Saque realizado.");
        }else{
            System.out.println("Saldo insuficiente.");
        }
        System.out.println(cc1);
        System.out.println();

        ContaEspecial ce1 = new ContaEspecial(4398, 39845, 2, 18000.00, "Conta Especial");

        System.out.println(ce1);
        if (ce1.deposito(15000.00)){
            System.out.println("Deposito realizado.");    
        }else{
            System.out.println("Falha na operação de depósito.");
        }

        if (ce1.saque(35000.00)){
            System.out.println("Saque realizado.");
        }else{
            System.out.println("Saldo insuficiente.");
        }
        System.out.println(ce1);
        System.out.println();


        ContaPoupanca cp1 = new ContaPoupanca(4698, 32345, 0, 1000.00, "Conta Poupanca");

        System.out.println(cp1);
        if (cp1.deposito(500.00)){
            System.out.println("Deposito realizado.");    
        }else{
            System.out.println("Falha na operação de depósito.");
        }

        if (cp1.saque(700.00)){
            System.out.println("Saque realizado.");
        }else{
            System.out.println("Saldo insuficiente.");
        }
        System.out.println(cp1);


    }
}
