import java.util.Random;

public class Personagem {
     String nome;
     int vida;
     int forca;
     int defesa;
    public Personagem(String nome, int vida, int forca, int defesa) {
        this.nome = nome;
        this.vida = vida;
        this.forca = forca;
        this.defesa = defesa;
    }


    public void ataca(Personagem inimigo){
        int dano = calcularDano(this.forca,inimigo.defesa);
        System.out.println(this.nome + " ataca " + inimigo.nome + " causando " + dano + " de dano.");
        inimigo.recebeDano(dano);
    }

    private void recebeDano(int dano) {
        this.vida -= dano;
        if (this.vida <= 0){
            System.out.println("*****************************");
            System.out.println(this.nome + " Foi derrotado!");
            System.out.println("*****************************");
        }

    }

    private int calcularDano(int forcaAtacante, int defesaDefensor) {
        Random geradorAleatorio = new Random();
        double aleatorio = geradorAleatorio.nextDouble(0.5);
        double danoBruto = forcaAtacante * aleatorio;
        double danoFinal = danoBruto * defesaDefensor;
        return (int) danoFinal;
    }
}
