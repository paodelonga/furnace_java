package collections.set;

import collections.Pessoa;

import java.util.HashSet;
import java.util.Set;

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

        Pessoa p2 = new Pessoa("Gabriel", 12);

        System.out.println(p1.equals(p2));
        System.out.println(p2.equals(p1));
        System.out.println(p1.equals(null));

    }
}
