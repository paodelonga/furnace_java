package collections;

import java.util.Objects;

public class Pessoa {
    private String nome;
    private Integer idade;

    public Pessoa(String nome, Integer idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public Pessoa(String nome) {
        this.nome = nome;
        this.idade = null;
    }

    public String nome() {
        return nome;
    }

    public Integer idade() {
        return idade;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result +
                 ((nome == null) ? 0 : nome.hashCode()) +
                 (idade == null ? 0 : idade.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Pessoa other)) return false;

        return Objects.equals(nome, other.nome()) &&
               Objects.equals(idade, other.idade());
    }
}
