package alura.mizaeldouglas.minhasMusicas.models;

import lombok.Getter;
import lombok.Setter;

@Setter @Getter
public class NewAudio {

    private String titulo;
    private int totalReproducaoes;
    private int totalCurtidas;
    private double classificacao;


    public void curte(){
        this.totalCurtidas++;
    }
    public  void reproduz(){
        this.totalReproducaoes++;
    }

}
