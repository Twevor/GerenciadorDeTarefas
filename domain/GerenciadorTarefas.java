package OrientaçãoObjeto.GerenciadorDeTarefas.domain;

import java.util.ArrayList;
import java.util.List;

public class GerenciadorTarefas {
    private List<Tarefa> listaTarefas = new ArrayList<>();

    public GerenciadorTarefas() {
    }

    public void criar(Tarefa tarefa) {
        listaTarefas.add(tarefa);
        System.out.println(tarefa.getNome() + " adicionada com sucesso!");
    }

    public List<Tarefa> listarTrue() {
        List<Tarefa> tarefasConcluidas = new ArrayList<>();
        for (Tarefa tarefa : listaTarefas) {
            if (tarefa.isConcluida()) {
                tarefasConcluidas.add(tarefa);
            }
        }
        return tarefasConcluidas;
    }

    public List<Tarefa> listarFalse() {
        List<Tarefa> emAndamento = new ArrayList<>();
        for (Tarefa tarefa : listaTarefas) {
            if (!tarefa.isConcluida()) {
                emAndamento.add(tarefa);
            }
        }
        return emAndamento;
    }

    public void concluir(String nomeTarefa) {
        for (Tarefa tarefa : listaTarefas) {
            if (tarefa.getNome().equalsIgnoreCase(nomeTarefa)) {
                tarefa.setConcluida();
                System.out.println("Tarefa concluída com sucesso!");
                return;
            }
        }

        System.out.println(nomeTarefa + " não faz parte da lista de tarefas!");
    }

    public void excluir(String nomeTarefa) {
        if (listaTarefas.isEmpty()) {
            System.out.println(" não está na lista.");
            return;
        }

        Tarefa tarefaExcluir = null;
        for (Tarefa tarefa : listaTarefas) {
            if (tarefa.getNome().equalsIgnoreCase(nomeTarefa)) {
                tarefaExcluir = tarefa;
                break;
            }
        }
        if (tarefaExcluir != null) {
            listaTarefas.remove(tarefaExcluir);
            System.out.println(nomeTarefa + " removida com sucesso!");
            return;
        }

        System.out.println(nomeTarefa + " não está na lista.");
    }

}
