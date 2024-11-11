package modelo_fofoca_entj_rush.Controller;

import modelo_fofoca_entj_rush.Modeller.MAluno;
import modelo_fofoca_entj_rush.Viewer.VAluno;

import modelo_fofoca_entj_rush.Services.Aluno;
import java.util.List;

public class CAluno {
    private MAluno modelo;
    private VAluno visao;

    public CAluno(MAluno modelo, VAluno visao) {
        this.modelo = modelo;
        this.visao = visao;
    }

    // TODO
    public void adicionarAluno(String nome, int matricula) {
        Aluno aluno = new Aluno(nome, matricula);
        modelo.adicionarAluno(aluno);
    }

    public void removerAluno(int matricula) {
        modelo.removerAluno(matricula);
    }

    public void atualizarVisao() {
        List<Aluno> alunos = modelo.getAlunos();
        visao.exibirListaDeAlunos(alunos);
    }

    public void exibirDetalhesAluno(int matricula) {
        Aluno aluno = modelo.buscarAlunoPorMatricula(matricula);
        if (aluno != null) {
            visao.exibirDetalhesAluno(aluno.getNome(), aluno.getMatricula());
        } else {
            System.out.println("Aluno não encontrado.");
        }
    }
}
