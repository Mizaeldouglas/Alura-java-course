package alura.mizaeldouglas.minhasMusicas.models;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class NewMusica  extends NewAudio{

    private String album;
    private String artista;
    private String genero;

    @Override
    public double getClassificacao() {
        if (this.getTotalReproducaoes() > 2000){
            return 10;
        }else {
            return 5;
        }
    }
}
