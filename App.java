package OrientaçãoObjeto.GerenciadorDeTarefas;

import java.util.Scanner;

import OrientaçãoObjeto.GerenciadorDeTarefas.domain.GerenciadorTarefas;
import OrientaçãoObjeto.GerenciadorDeTarefas.domain.Tarefa;

public class App {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            GerenciadorTarefas gerenciadorTarefas = new GerenciadorTarefas();

            System.out.println("Bem vindo ao Gerenciador de Tarefas!\nComo posso te ajudar?");
            int opção1;

            do {
                System.out.println(
                        "\n1. Adicionar Tarefa\n2. Listar Tarefas\n3. Marcar Tarefa como Concluída\n4. Remover Tarefa\n5. Sair\n");
                System.out.print("Escolha uma opção: ");
                opção1 = scanner.nextInt();
                scanner.nextLine();

                switch (opção1) {
                    case 1:
                        System.out
                                .print("Nos diga o nome da tarefa que gostaria de adicionar e sua descrição!\nNome: ");
                        String nome = scanner.nextLine();

                        System.out.print("Descrição: ");
                        String descricao = scanner.nextLine();

                        Tarefa novaTarefa = new Tarefa(nome, descricao);
                        gerenciadorTarefas.criar(novaTarefa);
                        break;

                    case 2:
                        for (Tarefa tarefa : gerenciadorTarefas.listarFalse()) {
                            System.out.println("Em andamento: " + tarefa.getNome());

                        }
                        for (Tarefa tarefa : gerenciadorTarefas.listarTrue()) {
                            System.out.println("Concluida: " + tarefa.getNome());
                        }
                        break;

                    case 3:
                        System.out.println("Informe qual tarefa gostaria de concluir:");
                        String case3 = scanner.nextLine();
                        gerenciadorTarefas.concluir(case3);
                        break;

                    case 4:
                        System.out.println("Informe qual tarefa gostaria de excluir:");
                        String case4 = scanner.nextLine();
                        gerenciadorTarefas.excluir(case4);
                        break;

                    case 5:
                        break;
                    default:
                        System.out.print("Opção inválida!\nEscolha uma opção: ");
                        opção1 = scanner.nextInt();
                }

            } while (opção1 != 5);
        }
        System.out.println("Muito obrigado por utilizar nossos serviços!");

    }
}
