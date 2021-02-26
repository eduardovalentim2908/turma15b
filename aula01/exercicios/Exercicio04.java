package exercicios;

import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double SalarioMinimo, ConsumoResidencia, ValorKwh;
        // Inserir valor do salário mínimo
        System.out.println("Favor inserir o valor atual do salário mínimo."); 
        //Digitação do Salario Mínimo Atual
        SalarioMinimo = entrada.nextDouble(); 
        // Inserir Consumo da Residencia em KWatts/hora
        System.out.println("Favor inserir o consumo de energia da residencia em Kilowatts/hora."); 
        //Digitação do Consumo de Energia
        ConsumoResidencia = entrada.nextDouble(); 
        // Calcular o valor do Kilowatts/hora
        ValorKwh = (SalarioMinimo / 500);
        // Informar valor do KwH
        System.out.println("O Valor de 1 Kwh é: R$" + ValorKwh);
        // Valor total da conta.
        System.out.println("Considerando que foram gastos " + ConsumoResidencia + ", o valor da conta é: R$" + (ConsumoResidencia * ValorKwh));
        // Valor da conta com desconto.
        System.out.println("O valor da conta com 15% de desconto é: R$" + ((ConsumoResidencia * ValorKwh) * 0.85));
        entrada.close();     
    }    
}
