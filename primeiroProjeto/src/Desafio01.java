import java.util.Scanner;

public class Desafio01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String nome = "Mizael Douglas";
        double saldoInicial = 2000.00;
        double adicionarSaldo = 0;
        double saldoTotal = 0;
        int operacao = 0;

        System.out.println("*************************************************");

        System.out.println("Dados iniciais do cliente: ");
        System.out.println();
        System.out.println();

        System.out.println("Nome:                  " + nome);
        System.out.println("Tipo da conta:         Corrente");
        System.out.println("Saldo:                 " + saldoInicial);
        System.out.println();

        System.out.println("*************************************************");

        System.out.println();
        System.out.println();
        System.out.println();

        System.out.println("Operações");
        System.out.println();

        System.out.println("1- Consultar saldos");
        System.out.println("2- Receber valor");
        System.out.println("3- Transferir valor");
        System.out.println("4- Para sair");
        System.out.println();



        while (operacao != 4){
            System.out.println("_________________________________________________________");
            System.out.println();
            System.out.println("Digite a opção desejada:");
            operacao = sc.nextInt();
            if (operacao == 1){
                System.out.println("Seu saldo é de: " + saldoInicial);
            }else if (operacao == 2){
                System.out.println("Digite o valor que voce irar receber: ");
                adicionarSaldo = sc.nextDouble();
                    saldoInicial += adicionarSaldo;
                    System.out.println("Seu saldo foi atualizado para: " + saldoInicial);
            }else if (operacao == 3){
                System.out.println("Digite o valor que voce irar tranferir: ");
                adicionarSaldo = sc.nextDouble();
                while (adicionarSaldo >  saldoInicial && adicionarSaldo >= 0 ) {
                    System.out.println("\nNão há saldo suficiente para realizar a transferencia ");
                    adicionarSaldo = saldoInicial;
                    System.out.println("seu saldo atual é de: " + saldoInicial);
                    System.out.println("\nDigite o valor que voce irar tranferir: ");
                    adicionarSaldo = sc.nextDouble();
                }
                saldoInicial -= adicionarSaldo;
                System.out.println("Seu saldo foi atualizado para: " + saldoInicial);

            } else if(operacao > 4 || operacao == 0){
                System.out.println("Erro digite um numero de 1 a 4");
            }
        }
            System.out.println("Você digitou 4, você esta saindo do Banco, até aproxima");

    }
}
