package exemplos.exemplo03;

public class Pessoa {
 // Atributos
 String nome;
 int idade;


 // Metodos

 
 // Metodo Construtor
 
 Pessoa(String n, int i){
 
    nome = n;
    idade = i;
 }   
    
 
 void apresentar(){
    System.out.println("Olá! Eu sou o " + nome + " e tenho " + idade + " anos.");

}

}
