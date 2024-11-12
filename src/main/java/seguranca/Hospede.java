package seguranca;

public class Hospede extends Pessoa implements Employer{
    private String nome;
    private Integer idade;
    private Cargo cargo;

    public Hospede(String nome, Integer idade) {
        this.nome = nome;
        this.idade = idade;
        this.cargo = new Cargo("Hospede");
    }

    @Override
    public Cargo cargo() {
        return cargo;
    }
}
