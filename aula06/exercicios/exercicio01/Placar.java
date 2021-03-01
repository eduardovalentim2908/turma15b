package exercicios.exercicio01;

public class Placar {
    private String time1, time2;
    private int placar1, placar2;
    
    public Placar(){
        //this.time1 = "Time da Casa";
        //this.time2 = "Time Visitante";
        this("Mandante", "Visitante", 0, 0);
    }

    public Placar(String time1, String time2){
        //this.time1 = time1;
        //this.time2 = time2;
        //this.placar1 = 0;
        //this.placar2 = 0;

        this(time1, time2, 0, 0);
    }

    
    public Placar(String time1, String time2, int placar1, int placar2){
        this.time1 = time1;
        this.time2 = time2;
        this.placar1 = placar1;
        this.placar2 = placar2;
        
    }

    public String toString(){
        return time1 + " " + placar1 + " X " + placar2 + " " + time2;
    }


}
