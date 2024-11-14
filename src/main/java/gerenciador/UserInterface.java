package gerenciador;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class UserInterface {
    Servico servico;

    public UserInterface(Servico servico) {
        this.servico = servico;
        iniciar();
    }

    public void iniciar() {
        Scanner scanner = new Scanner(System.in);

        System.out.printf("""
                    Bem-vinde ao Hotel Lumen
                Data atual: %s%n
                """,
            LocalDateTime.now().format(
                DateTimeFormatter.ofPattern("dd/MM/yyyy - HH:mm:ss")
            )
        );

        System.out.println("""
            SISTEMA HOTELEIRO DE RESERVAS
            [1] Alugar quarto
            [2] Consultar reserva
            [3] Cancelar reserva
            [4] Pagar reserva
            [5] Fazer CheckIn
            [6] Fazer CheckOut
            [7] Listar reservas
            """
        );
    }

}
