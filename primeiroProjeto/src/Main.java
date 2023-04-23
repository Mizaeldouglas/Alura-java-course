public class Main {
    public static void main(String[] args) {

        System.out.println("Esse é Scrren Match");
        System.out.println();
        String nomeDoFilme = "Filme: Top Gun: Maverick";
        int anoDeLancamento = 2022;
        System.out.println("Ano de Lançamento: " + anoDeLancamento);
        boolean incluidoNoPlano = true;
        double notaDoFilme = 8.1;
        double media = (9.8 + 6.3 + 8.0) / 3;
        String sinopse;
        sinopse = nomeDoFilme  +
                """
                
                filme de acentura com galã dos anos 80
                muito Bom!
                Ano de lançamento:\s""" + anoDeLancamento;
        System.out.println(sinopse);

        int classificacao = (int) (media / 2);
        System.out.println(classificacao);
    }
}