package gerenciador;

import java.util.Objects;

public class Hospede {
    private String nome;
    private String documento;
    private Integer idQuarto;
    private Integer idReserva;

    public Hospede() {}

    public Hospede(String nome, String documento) {
        this.nome = nome;
        this.documento = documento;
    }

    public String getNome() {
        return nome;
    }

    public String getDocumento() {
        return documento;
    }

    public Integer getIdQuarto() {
        return idQuarto;
    }

    public Integer getIdReserva() {
        return idReserva;
    }

    public Hospede setDocumento(String documento) {
        this.documento = documento;
        return this;
    }

    public Hospede setNome(String nome) {
        this.nome = nome;
        return this;
    }

    public Hospede setIdQuarto(Integer idQuarto) {
        this.idQuarto = idQuarto;
        return this;
    }

    public Hospede setIdReserva(Integer idReserva) {
        this.idReserva = idReserva;
        return this;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (!(object instanceof Hospede other)) return false;
        return Objects.equals(documento, other.getDocumento());
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((documento == null) ? 0 : documento.hashCode());
        return result;
    }
}
