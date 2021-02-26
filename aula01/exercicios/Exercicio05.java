package exercicios;

import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Double custoFabrica, lucroDistribuidor, valorImpostos, valorTotalVeiculo;
        // Inserir valor do veiculo 
        System.out.println("Favor inserir o valor de fábrica do veiculo."); 
        //Digitação do Custo do Veiculo para a Fábrica
        custoFabrica = entrada.nextDouble(); 
        // Calculo do Lucro do Distribuidor
        lucroDistribuidor = custoFabrica * 0.28;
        // Calculo do valor dos Impostos
        valorImpostos = custoFabrica * 0.45;
        //Calculo do Valor total do veiculo para o Consumidor Final
        valorTotalVeiculo = custoFabrica + valorImpostos + lucroDistribuidor;
        // Apresentação do valor total do veiculo para o consumidor final
        System.out.println("O valor total do veiculo para o consumidor é de: R$ " + valorTotalVeiculo);
        // Apresentação do valor de impostos pagos na compra do veiculo pelo consumidor final.
        System.out.println("Do valor total do veiculo, R$ " + valorImpostos + " são impostos.");
        entrada.close();
    }
}
