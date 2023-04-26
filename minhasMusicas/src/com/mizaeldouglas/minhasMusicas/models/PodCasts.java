package com.mizaeldouglas.minhasMusicas.models;

import javax.crypto.spec.PSource;

public class PodCasts extends Audio {
    private  int episodio;
    private int minutosPorEpisodio;


    public int getEpisodio() {
        return episodio;
    }

    public void setEpisodio(int episodio) {
        this.episodio = episodio;
    }

    @Override
    public int getDuracaoEmMinutos() {
        return episodio *  minutosPorEpisodio;
    }
    public int getCurtidas(){
        return episodio;
    }
}
