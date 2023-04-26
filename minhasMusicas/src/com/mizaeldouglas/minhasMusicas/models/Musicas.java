package com.mizaeldouglas.minhasMusicas.models;

import lombok.Getter;
import lombok.Setter;

@Setter @Getter
public class Musicas extends Audio {
    private int duracaoEmMinutos;
    private String album;
    private int musicaPorAlbum;
    private int duracao;

    public int tempoTotalAudio(){
        return this.duracaoEmMinutos * this.duracao;

    }


}
