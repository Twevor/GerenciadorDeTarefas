package OrientaçãoObjeto.GerenciadorDeTarefas.domain;

public class Tarefa {
    private String nome;
    private String descricao;
    private boolean concluida = false;

    public Tarefa() {
    }

    public Tarefa(String nome, String descricao) {
        this.nome = nome;
        this.descricao = descricao;
        concluida = false;
    }

    public String getNome() {
        return this.nome;
    }

    public String getDescricao() {
        return this.descricao;
    }

    public boolean isConcluida() {
        return this.concluida;
    }

    public void setConcluida() {
        this.concluida = true;
    }

}
