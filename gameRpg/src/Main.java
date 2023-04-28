public class Main {
    public static void main(String[] args) {
        Guerreiro guerreiro = new Guerreiro("Guerreiro",100,10,10);
        Mago mago = new Mago("Mago",100,10,10);

        int vida = 1;
        do {
            if (guerreiro.vida >= 0 && mago.vida >= 0){
                System.out.println();
                guerreiro.ataca(mago);
                System.out.println("vida do Mago: " + mago.vida);
                System.out.println();
                mago.ataca(guerreiro);
                System.out.println("vida do Guerreiro: " + guerreiro.vida);
                System.out.println("\n-------------------------------------------------------------\n");
            }else {
                System.out.println("Vida do Guerreiro: " + guerreiro.vida);
                System.out.println("Vida do Mago: " + mago.vida);
                System.out.println("Fim de JOGO");
                break;
            }
        } while (vida > 0 || vida < 0);
    }
}