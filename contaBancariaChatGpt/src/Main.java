import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ContaBancaria conta1 = new ContaBancaria();
        System.out.println();
        System.out.println("*********** Bem vindo ao Banco Central ***********");
        System.out.println("____________________________________________________");

        System.out.println("\nDigite Seu Nome Completo: ");
        conta1.setNomeConta(sc.nextLine());

        System.out.println("Digite o numero da sua Conta: ");
        conta1.setNumeroConta(sc.nextInt());

        System.out.println("Digite o numero do CPF: ");
        conta1.setCpf(sc.next());

        System.out.println("Digite o seu CEP: ");
        conta1.setCep(sc.nextInt());

        System.out.println("Digite o seu Estado: ");
        conta1.setEstado(sc.next());

        System.out.println("\n____________________________________________________");


        System.out.println("\n*********** Conta bancária criada com sucesso. ***********");
        System.out.println("\nNome do titular da conta: " + conta1.getNomeConta());
        System.out.println("Número da conta: " + conta1.getNumeroConta());
        System.out.println("CPF do titular da conta: " + conta1.getCpf());
        System.out.println("Cep do titular da conta: " + conta1.getCep());
        System.out.println("Estado: " + conta1.getEstado());

        int opcao;
        System.out.println("\n____________________________________________________");
        do {
            System.out.println("\nEscolha uma opção:");
            System.out.println("1 - Depositar");
            System.out.println("2 - Sacar");
            System.out.println("3 - Verificar saldo");
            System.out.println("4 - Informaçào do cliente");
            System.out.println("0 - Sair");

            System.out.println("\n____________________________________________________");

            opcao = sc.nextInt();

            switch (opcao){
                case 1:
                    System.out.print("\nDigite o valor a ser depositado: ");
                    double valorDeposito = sc.nextDouble();
                    conta1.depositar(valorDeposito);
                    break;
                case 2:
                    System.out.print("\nDigite o valor a ser sacado: ");
                    double valorRetirado = sc.nextDouble();
                    conta1.sacar(valorRetirado);
                case 3:
                    conta1.verificarSaldo();
                    break;
                case 4:
                    System.out.println("Nome: " + conta1.getNomeConta());
                    System.out.println("CPF: " + conta1.getCpf());
                    System.out.println("Cep: " + conta1.getCep());
                    System.out.println("Estado: " + conta1.getEstado());
                    break;
                case 0:
                    System.out.println("Encerrando programa.");
                    break;
            }

        }while (opcao != 0);
            sc.close();

    }
}