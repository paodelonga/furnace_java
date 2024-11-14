package gerenciador.Entidade;

import gerenciador.Tipo.QuartoNome;

import java.math.BigDecimal;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class Hotel {
    private String nome;
    private Integer quantidadeReservaMaxima;
    private LinkedList<Reserva> listaReservas;
    private LinkedList<Quarto> listaQuartos;
    private LinkedList<Hospede> listaHospedes;
    private EnumMap<QuartoNome, Integer> tabelaQuartos;
    private EnumMap<QuartoNome, BigDecimal> tabelaValores;

    public Hotel(String nome, Integer quantidade_reserva_maxima) {
        this.nome = nome;
        this.quantidadeReservaMaxima = quantidade_reserva_maxima;

        this.listaReservas = new LinkedList<Reserva>();
        this.listaQuartos = new LinkedList<Quarto>();
        this.listaHospedes = new LinkedList<Hospede>();
    }

    // Getters
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

    public EnumMap<QuartoNome, Integer> getTabelaQuartos() {
        return tabelaQuartos;
    }

    public EnumMap<QuartoNome, BigDecimal> getTabelaValores() {
        return tabelaValores;
    }

    // Setters
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

    public Hotel setTabelaQuartos(EnumMap<QuartoNome, Integer> tabela_quartos) {
        tabelaQuartos = tabela_quartos;
        return this;
    }

    public Hotel setTabelaValores(EnumMap<QuartoNome, BigDecimal> tabela_valores) {
        tabelaValores = tabela_valores;
        return this;
    }

    // Adders
    public Boolean adicionaReserva(Reserva reserva) {
        if (listaReservas.size() < quantidadeReservaMaxima) {
            return !listaReservas.contains(reserva) && listaReservas.add(reserva);
        }
        return false;
    }

    public Boolean adicionaQuarto(Quarto quarto) {
        if (listaQuartos.size() < quantidadeReservaMaxima) {
            return !listaQuartos.contains(quarto) && listaQuartos.add(quarto);
        }
        return false;
    }

    public Boolean adicionaHospede(Hospede hospede) {
        if (listaHospedes.size() < quantidadeReservaMaxima) {
            return !listaHospedes.contains(hospede) && listaHospedes.add(hospede);
        }
        return false;
    }

    public Boolean adicionaQuartoTabela(QuartoNome nome, BigDecimal valor, Integer quantidade_inicial) {
        tabelaQuartos.put(nome, quantidade_inicial);
        tabelaValores.put(nome, valor);

        return tabelaQuartos.containsKey(nome) && tabelaValores.containsKey(nome);
    }

    // Obters
    public Reserva obterReserva(Reserva reserva) {
        return listaReservas.get(listaReservas.indexOf(reserva));
    }

    public Quarto obterQuarto(Quarto quarto) {
        return listaQuartos.get(listaQuartos.indexOf(quarto));
    }

    public Hospede obterHospede(Hospede hospede) {
        return listaHospedes.get(listaHospedes.indexOf(hospede));
    }

    public Map<BigDecimal, Integer> obterQuartoTabela(QuartoNome nome) {
        return Map.of(tabelaValores.get(nome), tabelaQuartos.get(nome));
    }

    // Removers
    public Boolean removeReserva(Reserva reserva) {
        return listaReservas.remove(reserva);
    }

    public Boolean removeQuarto(Quarto quarto) {
        return listaQuartos.remove(quarto);
    }

    public Boolean removeHospede(Hospede hospede) {
        return listaHospedes.remove(hospede);
    }

    public Boolean removeQuartoTabela(QuartoNome nome) {
        tabelaQuartos.remove(nome);
        tabelaValores.remove(nome);

        return !(tabelaQuartos.containsKey(nome) && tabelaValores.containsKey(nome));
    }
}
