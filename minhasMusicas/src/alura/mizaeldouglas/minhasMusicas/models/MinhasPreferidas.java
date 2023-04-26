package alura.mizaeldouglas.minhasMusicas.models;

public class MinhasPreferidas {

    public void inclui(NewAudio audio){
        if (audio.getClassificacao() >=9){
            System.out.println(audio.getTitulo() + " é considerado sucesso absoluto " +
                    "e preferido pro todos!");
        }else {
            System.out.println(audio.getTitulo() + " não faz tanto sucesso mas nos o recomendamos " +
                    "para você!");
        }
    }
}
