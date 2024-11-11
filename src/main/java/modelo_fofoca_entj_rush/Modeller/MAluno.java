package modelo_fofoca_entj_rush.Modeller;

import modelo_fofoca_entj_rush.Services.Aluno;
import java.util.ArrayList;
import java.util.List;

public class MAluno {
    private List<Aluno> alunos;

    public MAluno() {
        this.alunos = new ArrayList<>();
    }

    // TODO
    public void adicionarAluno(Aluno aluno) {
        alunos.add(aluno);
    }

    public void removerAluno(int matricula) {
        alunos.removeIf(aluno -> aluno.getMatricula() == matricula);
    }

    public Aluno buscarAlunoPorMatricula(int matricula) {
        return alunos.stream()
                .filter(aluno -> aluno.getMatricula() == matricula)
                .findFirst()
                .orElse(null);
    }

    public List<Aluno> getAlunos() {
        return alunos;
    }
}
