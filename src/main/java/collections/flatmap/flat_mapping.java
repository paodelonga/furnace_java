package collections.flatmap;

import collections.Cidade;
import collections.Pessoa;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Stream;

public class flat_mapping {
    public static void main(String[] args) {
        // Declara cidades
        Cidade bh = new Cidade("Belo Horizonte");
        Cidade sp = new Cidade("São PaulO");

        // Adiciona pessoas as cidades
        bh.pessoas().add(new Pessoa("Adriano"));
        bh.pessoas().add(new Pessoa("Carlos"));
        bh.pessoas().add(new Pessoa("Lucas"));

        sp.pessoas().add(new Pessoa("Paulo"));
        sp.pessoas().add(new Pessoa("Gustavo"));
        sp.pessoas().add(new Pessoa("Danilo"));

        // Declara lista de cidades
        List<Cidade> cidades = new ArrayList<>();

        // Adiciona cidades declaras na lista de cidadaes
        cidades.add(bh);
        cidades.add(sp);

        // Codigo de referencia https://medium.com/@kauegatto123/streams-em-java-tudo-que-voc%C3%AA-precisa-saber-d03c2ca17162
        // Function<City, Stream<Person>> flatMapper = city -> city.getPeople().stream();
        // long count = cities.stream().flatMap(flatMapper) /*poderíamos colocar a funçao direto aqui, é uma lambda*/.count()

        Function<Cidade, Stream<Pessoa>> funcaoFlatMapping = cidade -> cidade.pessoas().stream();

        // Utilizando interface Funcional
        cidades
            .stream()
            .flatMap(
                funcaoFlatMapping
            )
            .forEach(
                p -> System.out.println(p.nome())
            );

        // Utilizando expressão lambda
        cidades
            .stream()
            .flatMap(
                cidade -> cidade.pessoas().stream()
            )
            .forEach(
                p -> System.out.println(p.nome())
            );

        // Utilizando map
        cidades
            .stream()
            .map(
                cidade -> cidade.pessoas()
            )
            .forEach(
                pessoas -> pessoas.forEach(
                    pessoa -> System.out.println(pessoa.nome())
                )
            );

    }
}
