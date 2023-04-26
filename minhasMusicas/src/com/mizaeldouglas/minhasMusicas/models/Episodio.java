package com.mizaeldouglas.minhasMusicas.models;

import com.mizaeldouglas.minhasMusicas.calculador.Classificacao;
import lombok.Getter;
import lombok.Setter;

@Setter @Getter
public class Episodio implements Classificacao {
    private int numero;
    private  String titulo;
    private PodCasts podCasts;
    private int totalVisualizacao;
    private int totalCurtida;

    @Override
    public int getClassificacao() {
        if (totalVisualizacao > 100){
            return 4;
        }else {

            return 2;
        }
    }

}
