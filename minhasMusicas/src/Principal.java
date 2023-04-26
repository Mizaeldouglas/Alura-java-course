import alura.mizaeldouglas.minhasMusicas.models.MinhasPreferidas;
import alura.mizaeldouglas.minhasMusicas.models.NewAudio;
import alura.mizaeldouglas.minhasMusicas.models.NewMusica;
import alura.mizaeldouglas.minhasMusicas.models.NewPodcast;

public class Principal {
    public static void main(String[] args) {
        NewMusica musica = new NewMusica();
        musica.setTitulo("A minha alma");
        musica.setArtista("O Rappa");


        for (int i = 0; i < 1000; i++) {
            musica.reproduz();
        }

        for (int i = 0; i < 50; i++) {
            musica.curte();
        }

        NewPodcast podcast = new NewPodcast();
        podcast.setTitulo("BolhaDev");
        podcast.setApresentador("Marcos Mendes");

        for (int i = 0; i < 5000; i++) {
            podcast.reproduz();
        }

        for (int i = 0; i < 1000; i++) {
            podcast.curte();
        }

        MinhasPreferidas preferidas = new MinhasPreferidas();
        preferidas.inclui(podcast);
        preferidas.inclui(musica);



    }
}
