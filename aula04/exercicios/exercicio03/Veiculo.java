package exercicios.exercicio03;

public class Veiculo {
    String modelo, marca;
    double consumo;

    Veiculo(String montadora, String tipo, double kml){
        marca = montadora;
        modelo = tipo;
        consumo = kml;
       }

void apresentar(){
    System.out.println("O veiculo é da marca " + marca + " e modelo " + modelo + ".");

}

double obterConsumo(){

    return consumo;
}

}
