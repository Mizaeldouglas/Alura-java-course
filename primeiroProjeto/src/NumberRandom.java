import java.util.Random;
import java.util.Scanner;

public class NumberRandom {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         int numberRandom = new Random().nextInt(20);
         int tentativas = 10;
         int numeroDeTentativas = 9;

//        System.out.println(numberRandom);
        System.out.println("Você tem "+ tentativas-- +" tentativas para acertar um numero entre 1 até 20, Digite um numero: ");
        int numeroDigitado = sc.nextInt();

        for (int i = 1; i <= tentativas; i++) {
//            System.out.println(numberRandom);
            if (numeroDigitado == numberRandom){
                System.out.println("Você acertou!! o numero Digitado foi: " + numeroDigitado );
                break;
            } else if (numeroDigitado != numberRandom){
                System.out.println("Voce errou você tem "+ numeroDeTentativas-- +" tentativas, digite novamente outro numero: ");
                numeroDigitado = sc.nextInt();
            }
        }
        System.out.println("Voce erro todos o numero correto é: " + numberRandom);



    }
}
