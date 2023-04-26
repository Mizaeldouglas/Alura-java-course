package alura.mizaeldouglas.minhasMusicas.models;

import lombok.Getter;
import lombok.Setter;

@Setter @Getter
public class NewPodcast extends NewAudio {
    private String apresentador;
    private  String descricao;

    @Override
    public double getClassificacao() {
        if (this.getTotalCurtidas() > 500){
            return 10;
        } else  {
            return 8;
        }
    }
}
