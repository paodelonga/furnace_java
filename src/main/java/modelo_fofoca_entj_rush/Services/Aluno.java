package modelo_fofoca_entj_rush.Services;

public class Aluno {
    private String nome;
    private int matricula;

    // TODO
    public Aluno(String nome, int matricula) {
        this.nome = nome;
        this.matricula = matricula;
    }

    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }
}