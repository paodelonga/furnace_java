package gerenciador.Entidade;

import java.math.BigDecimal;
import java.util.Objects;

public class Reserva {
    private Integer identificador;
    private Quarto quarto;
    private Hospede hospede;
    private BigDecimal valor;

    public Reserva(Integer identificador, Quarto quarto, Hospede hospede) {
        this.identificador = identificador;
        this.quarto = quarto;
        this.hospede = hospede;

        this.quarto.setIdHospede(this.hospede.getDocumento());
        this.quarto.setIdReserva(this.identificador);

        this.hospede.setIdQuarto(this.quarto.getNumero());
        this.hospede.setIdReserva(this.identificador);
    }

    // Getters
    public Integer getIdentificador() {
        return identificador;
    }

    public Quarto getQuarto() {
        return quarto;
    }

    public Hospede getHospede() {
        return hospede;
    }

    public BigDecimal getValor() {
        return valor;
    }

    // Setters
    public Reserva setIdentificador(Integer identificador) {
        this.identificador = identificador;
        return this;
    }

    public Reserva setQuarto(Quarto quarto) {
        this.quarto = quarto;
        return this;
    }

    public Reserva setHospede(Hospede hospede) {
        this.hospede = hospede;
        return this;
    }

    public Reserva setValor(BigDecimal valor) {
        this.valor = valor;
        return this;
    }

    // Internals
    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (!(object instanceof Reserva other)) return false;
        return Objects.equals(identificador, other.getIdentificador());
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((identificador == null) ? 0 : identificador.hashCode());
        return result;
    }
}
