package com.mizaeldouglas.minhasMusicas.models;

import lombok.Getter;
import lombok.Setter;

@Setter @Getter
public class Audio {

    private String titulo;
    private int duracao;
    private int totalDeReproducao;
    private int totalCurtidas;
    private int duracaoEmMinutos;
    private int classificacao;
    private double somaDasAvaliacoes;
    private int totalDeAvaliacao;
    private int curtidas;





    public void curtidas(int curtidas) {
        this.curtidas += curtidas;
        totalCurtidas++;
    }

    public void avalia(double nota) {
        somaDasAvaliacoes += nota;
        totalDeAvaliacao++;
    }
    public double resultClassificacao(){
        return somaDasAvaliacoes / totalDeAvaliacao;
    }


}
