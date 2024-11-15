package collections.set;

import collections.Pessoa;

import java.util.HashSet;

public class App {
    private static HashSet<Pessoa> pessoas;

    private static Pessoa adicionarPessoa(Pessoa pessoa) {
        pessoas.add(pessoa);
        return pessoa;
        // System.out.printf("%s %d%n", pessoa.nome(), pessoa.idade());
    }

    private static void exibirPessoas() {
        pessoas.forEach(
            pessoa -> System.out.println(pessoa.nome() + " " + pessoa.idade())
        );
    }

    public static void main(String[] args) {
        pessoas = new HashSet<Pessoa>();

        adicionarPessoa(new Pessoa("João Silva", 25));
        adicionarPessoa(new Pessoa("Maria Oliveira", 30));
        adicionarPessoa(new Pessoa("Pedro Santos", 22));
        adicionarPessoa(new Pessoa("Ana Costa", 28));
        adicionarPessoa(new Pessoa("Lucas Souza", 35));
        adicionarPessoa(new Pessoa("Beatriz Lima", 27));
        adicionarPessoa(new Pessoa("Rafael Azevedo", 29));
        adicionarPessoa(new Pessoa("Camila Almeida", 24));
        adicionarPessoa(new Pessoa("Bruno Rocha", 42));
        adicionarPessoa(new Pessoa("Bruno Rocha", 31));
        adicionarPessoa(new Pessoa("Fernando Nunes", 31));
        adicionarPessoa(new Pessoa("Julia Mendes", 26));
        adicionarPessoa(new Pessoa("Bruno Ramos", 32));
        adicionarPessoa(new Pessoa("Larissa Rocha", 23));
        adicionarPessoa(new Pessoa("Carlos Teixeira", 34));
        adicionarPessoa(new Pessoa("Gabriela Barbosa", 21));
        adicionarPessoa(new Pessoa("Thiago Moreira", 33));

        exibirPessoas();
    }
}
