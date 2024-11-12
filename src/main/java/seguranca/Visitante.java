package seguranca;

public class Visitante extends Pessoa implements Employer {
    private String nome;
    private Integer idade;
    private Cargo cargo;

    public Visitante(String nome, Integer idade) {
        this.nome = nome;
        this.idade = idade;
        this.cargo = new Cargo("Visitante");
    }

    @Override
    public Cargo cargo() {
        return cargo;
    }
}
