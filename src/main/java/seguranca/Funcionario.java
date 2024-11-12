package seguranca;

import java.io.Serializable;

public class Funcionario extends Pessoa implements Employer {
    private String nome;
    private Integer idade;
    private Cargo cargo;

    public Funcionario(String nome, Integer idade) {
        this.nome = nome;
        this.idade = idade;
        this.cargo = new Cargo("Funcionario");
    }

    @Override
    public Cargo cargo() {
        return cargo;
    }
}
