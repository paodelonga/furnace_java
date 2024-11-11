package modelo_fofoca_entj_rush.Viewer;

import modelo_fofoca_entj_rush.Services.Aluno;
import java.util.List;

public class VAluno {
    public void exibirDetalhesAluno(String nome, int matricula) {
        System.out.println("Nome: " + nome);
        System.out.println("Matrícula: " + matricula);
    }

    public void exibirListaDeAlunos(List<Aluno> alunos) {
        for (Aluno aluno : alunos) {
            exibirDetalhesAluno(aluno.getNome(), aluno.getMatricula());
            System.out.println("------");
        }
    }
}
