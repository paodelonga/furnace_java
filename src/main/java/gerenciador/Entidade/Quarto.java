package gerenciador.Entidade;

import gerenciador.Tipo.QuartoTipo;

import java.util.Objects;

public class Quarto  {
    private Integer numero;
    private QuartoTipo tipo;
    private String idHospede;
    private Integer idReserva;

    public Quarto() {}

    public Quarto(Integer numero, QuartoTipo tipo) {
        this.numero = numero;
    }

    public Integer getNumero() {
        return numero;
    }

    public QuartoTipo getTipo() {
        return tipo;
    }

    public String getIdHospede() {
        return idHospede;
    }

    public Integer getIdReserva() {
        return idReserva;
    }

    public Quarto setNumero(Integer numero) {
        this.numero = numero;
        return this;
    }
    public Quarto setTipo(QuartoTipo tipo) {
        this.tipo = tipo;
        return this;
    }

    public Quarto setIdHospede(String idHospede) {
        this.idHospede = idHospede;
        return this;
    }

    public Quarto setIdReserva(Integer idReserva) {
        this.idReserva = idReserva;
        return this;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (!(object instanceof Quarto other)) return false;
        return Objects.equals(numero, other.getNumero());
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((numero == null) ? 0 : numero.hashCode());
        return result;
    }
}
