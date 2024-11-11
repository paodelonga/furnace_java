package modelo_fofoca_entj_rush;

import modelo_fofoca_entj_rush.Modeller.MAluno;
import modelo_fofoca_entj_rush.Viewer.VAluno;
import modelo_fofoca_entj_rush.Controller.CAluno;

public class App {
    public static void main(String[] args) {
        MAluno modelo = new MAluno();
        VAluno visao = new VAluno();
        CAluno controlador = new CAluno(modelo, visao);

        // Adiciona alguns alunos
        controlador.adicionarAluno("João", 12345);
        controlador.adicionarAluno("Maria", 67890);
        controlador.adicionarAluno("Ana", 54321);

        // Exibe a lista completa de alunos
        controlador.atualizarVisao();

        // Exibe detalhes de um aluno específico
        // controlador.exibirDetalhesAluno(12345);

        // Remove um aluno
        // controlador.removerAluno(67890);

        // Atualiza a lista após remoção
        // System.out.println("Após remoção:");
        // controlador.atualizarVisao();
    }
}
