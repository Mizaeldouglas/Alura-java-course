package com.mizaeldouglas.minhasMusicas.calculador;

import com.mizaeldouglas.minhasMusicas.models.Audio;

public class ClassificacaoCalc {
    private int tempoTotal;

    public int getTempoTotal() {
        return tempoTotal;
    }


    public void inclui(Audio audio){
        this.tempoTotal += audio.getDuracaoEmMinutos();
    }

}
