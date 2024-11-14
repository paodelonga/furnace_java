package gerenciador;

import gerenciador.Tipo.QuartoNome;

import java.math.BigDecimal;

public class gerenciador {
    public static void main(String[] args) {
        Servico servico = new Servico(512);

        servico.adicionarQuartoTabela(QuartoNome.TRIPLO, new BigDecimal(250), 180);
        servico.adicionarQuartoTabela(QuartoNome.SUPERIOR, new BigDecimal(350), 152);
        servico.adicionarQuartoTabela(QuartoNome.LUXO, new BigDecimal(500), 130);
        servico.adicionarQuartoTabela(QuartoNome.SUITE, new BigDecimal(750), 50);

        servico.
    }
}
