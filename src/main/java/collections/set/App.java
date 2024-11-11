package collections.set;

import collections.Pessoa;

import java.util.HashSet;

public class App {
    private static HashSet<Pessoa> pessoas;

    private static void adicionarPessoa(Pessoa pessoa) {
        System.out.println(
            pessoas.add(pessoa) + " " + pessoa.nome()  + "" + pessoa.idade()
        );
    }

    private static void exibirPessoas() {
        pessoas.forEach(
            pessoa -> System.out.println(pessoa.nome() + pessoa.idade())
        );
    }

    public static void main(String[] args) {
        pessoas = new HashSet<Pessoa>();

        Pessoa p1 = new Pessoa("Gabriel", 12);
        adicionarPessoa(p1);
        adicionarPessoa(p1);

        adicionarPessoa(new Pessoa("Gabriel", 13));
        adicionarPessoa(new Pessoa("Gabriel", 13));

        adicionarPessoa(new Pessoa("Gabriel", null));
    }
}
