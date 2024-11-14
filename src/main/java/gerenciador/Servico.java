package gerenciador;

import gerenciador.Entidade.Hospede;
import gerenciador.Entidade.Hotel;
import gerenciador.Entidade.Quarto;
import gerenciador.Entidade.Reserva;

public class Servico {
    /*
    1. Alugar quarto
    2. Consultar reserva
    3. Cancelar reserva
    4. Pagar reserva
    5. Fazer CheckIn
    6. Fazer CheckOut
    7. Listar reservas
    */

    public Servico(Integer quantidade_maxima_reserva) {
        Hotel hotel = new Hotel("Lumen", quantidade_maxima_reserva);
    }

    // Coisas internas (eu quero usar mvc :crying :crying


    // Coisitas externas
    public void alugarQuarto(Hospede hospede, Quarto quarto) {
    }

    public void consultarReserva(Reserva reserva) {
    }

    public void cancelarReserva(Reserva reserva) {
    }

    public void pagarReserva(Reserva reserva) {
    }

    public void fazerCheckIn(Reserva reserva) {
    }

    public void fazerCheckOut(Reserva reserva) {
    }

    public void listarReservas() {
    }
}
