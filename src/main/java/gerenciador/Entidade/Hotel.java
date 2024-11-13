package gerenciador.Entidade;

import java.util.LinkedList;

public class Hotel {
    private String nome;
    private Integer quantidadeReservaMaxima;
    private LinkedList<Reserva> listaReservas;
    private LinkedList<Quarto> listaQuartos;
    private LinkedList<Hospede> listaHospedes;

    public Hotel() {
        this.listaReservas = new LinkedList<Reserva>();
        this.listaQuartos = new LinkedList<Quarto>();
        this.listaHospedes = new LinkedList<Hospede>();
    }

    public Hotel(String nome, Integer quantidade_reserva_maxima) {
        this.nome = nome;
        this.quantidadeReservaMaxima = quantidade_reserva_maxima;

        this.listaReservas = new LinkedList<Reserva>();
        this.listaQuartos = new LinkedList<Quarto>();
        this.listaHospedes = new LinkedList<Hospede>();
    }

    public String getNome() {
        return nome;
    }

    public Integer getQuantidadeReservaMaxima() {
        return quantidadeReservaMaxima;
    }

    public LinkedList<Reserva> getListaReservas() {
        return listaReservas;
    }

    public LinkedList<Quarto> getListaQuartos() {
        return listaQuartos;
    }

    public LinkedList<Hospede> getListaHospedes() {
        return listaHospedes;
    }

    public Hotel setNome(String nome) {
        this.nome = nome;
        return this;
    }

    public Hotel setQuantidadeReservaMaxima(Integer quantidade_reserva_maxima) {
        quantidadeReservaMaxima = quantidade_reserva_maxima;
        return this;
    }

    public Hotel setListaReservas(LinkedList<Reserva> lista_reservas) {
        listaReservas = lista_reservas;
        return this;
    }

    public Hotel setListaQuartos(LinkedList<Quarto> lista_quartos) {
        listaQuartos = lista_quartos;
        return this;
    }

    public Hotel setListaHospedes(LinkedList<Hospede> lista_hospedes) {
        listaHospedes = lista_hospedes;
        return this;
    }

    public Boolean adicionaReserva(Reserva reserva) {
        if(listaReservas.size() < quantidadeReservaMaxima) {
            return !listaReservas.contains(reserva) && listaReservas.add(reserva);
        }
        return false;
    }

    public Boolean adicionarQuarto(Quarto quarto) {
        if(listaQuartos.size() < quantidadeReservaMaxima) {
            return !listaQuartos.contains(quarto) && listaQuartos.add(quarto);
        }
        return false;
    }

    public Boolean adicionarHospede(Hospede hospede) {
        if(listaHospedes.size() < quantidadeReservaMaxima) {
            return !listaHospedes.contains(hospede) && listaHospedes.add(hospede);
        }
        return false;
    }

    public Boolean removeReserva(Reserva reserva) {
        return listaReservas.remove(reserva);
    }

    public Boolean removeQuarto(Quarto quarto) {
        return listaQuartos.remove(quarto);
    }

    public Boolean removeHospede(Hospede hospede) {
        return listaHospedes.remove(hospede);
    }
}
