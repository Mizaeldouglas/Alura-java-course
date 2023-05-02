package com.mizaeldouglas;

import com.mizaeldouglas.domain.RegraDeNegocioException;
import com.mizaeldouglas.domain.alunos.DadosCadastroAlunos;
import com.mizaeldouglas.domain.cadastrosAlunos.AlunosService;
import com.mizaeldouglas.domain.cadastrosAlunos.DadosAdicionarAlunos;

import java.util.Scanner;

public class Main {
    private static Scanner teclado = new Scanner(System.in).useDelimiter("\n");
    private static AlunosService service = new AlunosService();

    public static void main(String[] args) {

        var opcao = exibirMenu();
        while (opcao != 8) {
            try {
                switch (opcao) {
                    case 1:
                        listarContas();
                        break;
                    case 2:
                        abrirConta();

                        break;
                    case 3:
                        System.out.println("case 2");
                        break;
                    case 4:
                        System.out.println("case 2");
                        break;
                    case 5:
                        System.out.println("case 2");
                        break;
                    case 6:
                        System.out.println("case 2");
                    case 7:
                        System.out.println("case 2");
                        break;
                }
            } catch (RegraDeNegocioException e) {
                System.out.println("Erro: " +e.getMessage());
                System.out.println("Pressione qualquer tecla e de ENTER para voltar ao menu");
                teclado.next();
            }
            opcao = exibirMenu();
        }

        System.out.println("Finalizando a aplicação.");
    }



    private static int exibirMenu() {
        System.out.println("""
                School - ESCOLHA UMA OPÇÃO:
                1 - Listar alunos cadastrado
                2 - Abertura de conta
                3 - Encerramento de conta
                4 - Consultar saldo de uma conta
                5 - Realizar saque em uma conta
                6 - Realizar depósito em uma conta
                7 - Realizar transferencia
                8 - Sair
                """);
        return teclado.nextInt();
    }

    private static void listarContas() {
        System.out.println("Contas cadastradas:");
        var contas = service.listarCadastroAlunos();
        contas.stream().forEach(System.out::println);

        System.out.println("Pressione qualquer tecla e de ENTER para voltar ao menu principal");
        teclado.next();
    }

    private static void abrirConta() {
        System.out.println("Digite o id da aluno:");
        var id = teclado.nextInt();

        System.out.println("Digite o nome do aluno:");
        var nome = teclado.next();

        System.out.println("Digite o email do aluno:");
        var email = teclado.next();

        System.out.println("Digite o telefone do aluno:");
        var telefone = teclado.next();

        System.out.println("Digite o endereco do aluno:");
        var endereco = teclado.next();




        service.abrir(
                new DadosAdicionarAlunos(new DadosCadastroAlunos(id,nome,email,telefone,endereco)));

        System.out.println("Conta aberta com sucesso!");
        System.out.println("Pressione qualquer tecla e de ENTER para voltar ao menu principal");
        teclado.next();
    }
}