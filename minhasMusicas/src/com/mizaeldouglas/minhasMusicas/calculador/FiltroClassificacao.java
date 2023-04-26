package com.mizaeldouglas.minhasMusicas.calculador;

public class FiltroClassificacao {

    public void filtra(Classificacao classificacao){
        if (classificacao.getClassificacao() >= 4){
            System.out.println("Está entre as mais tocadas");
        } else if (classificacao.getClassificacao() >= 2) {
            System.out.println("Muito bem avaliada no momento!");
        }else {
            System.out.println("Quase ninguem escutou, mas vale a pena dar uma chance!");
        }
    }
}
