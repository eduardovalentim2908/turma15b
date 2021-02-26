package exercicios.exercicio04;

public class Relogio {
    private int hora, minuto, segundo;
    public boolean validador;

    public Relogio(int h, int m, int s){
        validador = true;
        obterHora(h);
        obterMinuto(m);
        obterSegundo(s);
        
      }

    public void obterHora(int hora){
        if(hora >= 0 && hora < 24){

            this.hora = hora;
        }else{
            validador = false;
        }
        
    }
    
    public void obterMinuto(int minuto){
        
        if(minuto >= 0 && hora < 60){

            this.minuto = minuto;
        }else{
            validador = false;
        }
    }
    
    public void obterSegundo(int segundo){
        
        if(segundo >= 0 && hora < 60){

            this.segundo = segundo;
        }else{
            validador = false;
        }

    }
    
    
    public void apresentar(){
        if (validador == true){
            System.out.println("A hora atual é:  " + hora + ":" + minuto + ":" + segundo);
        }else{
            System.out.println("Formato de Hora incorreto.");
        }
        
    }
    
}

