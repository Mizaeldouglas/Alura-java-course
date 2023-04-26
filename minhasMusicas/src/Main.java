import com.mizaeldouglas.minhasMusicas.calculador.ClassificacaoCalc;
import com.mizaeldouglas.minhasMusicas.models.Musicas;
import com.mizaeldouglas.minhasMusicas.models.PodCasts;

public class Main {
    public static void main(String[] args) {

        Musicas musicas = new Musicas();
        PodCasts podCasts = new PodCasts();
        ClassificacaoCalc calc = new ClassificacaoCalc();

        musicas.avalia(5);
        musicas.avalia(10);
        musicas.avalia(8);
        musicas.setDuracao(5);
        musicas.setDuracaoEmMinutos(2);
        musicas.curtidas(32);
        musicas.setMusicaPorAlbum(10);

        System.out.println(musicas.getTotalDeAvaliacao());
        System.out.println(musicas.resultClassificacao());
        System.out.println("Quantidade De musica por albuns: " + musicas.getMusicaPorAlbum());
        System.out.println("Qunatidade de munutos tem o album Todo: " + musicas.tempoTotalAudio());
        System.out.println("Duração: " + musicas.getDuracao());
        System.out.println();
        System.out.println("Quantidade de curtidas: " + musicas.getCurtidas());


        podCasts.setEpisodio(10);
        podCasts.setDuracaoEmMinutos(60);
        podCasts.setTitulo("podecast Peewe");
        podCasts.curtidas(50);
        podCasts.avalia(3);
        podCasts.avalia(6);
        podCasts.avalia(9);
        System.out.println(podCasts.getClassificacao());
        calc.inclui(podCasts);
        calc.inclui(musicas);
        System.out.println();



    }
}