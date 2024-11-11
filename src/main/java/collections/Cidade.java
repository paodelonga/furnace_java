package collections;

import java.util.LinkedList;

public class Cidade {
    private String toponimo;
    private LinkedList<Pessoa> pessoas;

    public Cidade(String toponimo) {
        this.toponimo = toponimo;
        this.pessoas = new LinkedList<>();
    }

    public String toponimo() {
        return toponimo;
    }

    public LinkedList<Pessoa> pessoas() {
        return pessoas;
    }

    public Cidade setToponimo(String toponimo) {
        this.toponimo = toponimo;
        return this;
    }

    public Cidade setPessoas(LinkedList<Pessoa> pessoas) {
        this.pessoas = pessoas;
        return this;
    }
}
