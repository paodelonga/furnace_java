package gerenciador.Entidade;

import java.util.Objects;

public class Reserva {
    private Integer identificador;
    private Quarto quarto;
    private Hospede hospede;
    private Double valor;

    public Reserva() {
    }

    public Reserva(Integer identificador, Quarto quarto, Hospede hospede) {
        this.identificador = identificador;
        this.quarto = quarto;
        this.hospede = hospede;

        this.quarto.setIdHospede(this.hospede.getDocumento());
        this.quarto.setIdReserva(this.identificador);

        this.hospede.setIdQuarto(this.quarto.getNumero());
        this.hospede.setIdReserva(this.identificador);
    }

    public Integer getIdentificador() {
        return identificador;
    }

    public Quarto getQuarto() {
        return quarto;
    }

    public Hospede getHospede() {
        return hospede;
    }

    public Double getValor() {
        return valor;
    }

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

    public Reserva setValor(Double valor) {
        this.valor = valor;
        return this;
    }

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
