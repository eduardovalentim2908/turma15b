package exemplos.exemplo01;

import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
       Scanner teclado = new Scanner(System.in);
       int opcao;
       int numeroConta;
       double limite, valor;
       ContaCorrente cc = null;
       ContaEspecial ce = null;
       ArrayList<ContaCorrente> listaDeContas = new ArrayList<>();
       
       do{
           System.out.println("1 - Nova Conta Corrente");
           System.out.println("2 - Nova Conta Especial");
           System.out.println("3 - Nova Conta Poupança");
           System.out.println("4 - Depósito");
           System.out.println("5 - Saque");
           System.out.println("6 - Saldo");
           System.out.println("7 - Sair");
           System.out.println("Digite a opção desejada.");
           opcao = teclado.nextInt();


           switch (opcao) {
               case 1:
                   System.out.println("Digite os dados da conta (Agencia, Numero e Digito).");
                   numeroConta = teclado.nextInt();
                   cc = new ContaCorrente(numeroConta);
                   listaDeContas.add(cc);
                   System.out.println(cc);
                   break;
           
               case 2:
        
                   System.out.println("Digite o numero da conta.");
                   numeroConta = teclado.nextInt();
                   System.out.println("Digite o limite da conta.");
                   limite = teclado.nextDouble();
                   ce = new ContaEspecial(numeroConta, limite);

                   break;
        
                case 3:
                
                    break;
        
                case 4:
                    System.out.println("Informe o valor do deposito.");
                    valor = teclado.nextDouble();
                    if (cc.deposito(valor)){
                        System.out.println("Deposito realizado.");
                    }else {
                        System.out.println("Falha na operação.");
                    }
                    break;
        
                case 5:
                
                    break;
        
       
                case 6:
                    System.out.println(listaDeContas);
                    break;
        
                case 7:
                
                    break;
        
                    default:
                    System.out.println("Opção invalida.");
                    break;
        }

        } while(opcao != 7);
       teclado.close();
    }     
        
}
