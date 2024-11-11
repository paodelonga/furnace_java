package date;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class App {
    public static void main(String[] args) {
        LocalDateTime hora_local = LocalDateTime.now();
        DateTimeFormatter formatador = DateTimeFormatter.ofPattern("HH:mm:ss, dd/MM/yyyy");

        System.out.println(hora_local);
        System.out.println(hora_local.format(formatador));

        // // hora minuto segundo dia mes ano
        // // minuto hora dia mes
        // // 0 0 0 0
        //
        // String entrada = "30 8 5";
        // List<String> listaAlgarismos = Arrays.stream(entrada.split(" ")).toList();
        //
        // ListIterator<String> it = listaAlgarismos.listIterator();
        //
        // System.out.println(entrada);
        // System.out.println(listaAlgarismos);
        //
        // while (it.hasNext()) {
        //     if (it.nextIndex() == 0) {
        //         hora_local = hora_local.plusMinutes(Integer.parseInt(it.next()));
        //     } else if (it.nextIndex() == 1) {
        //         hora_local = hora_local.plusHours(Integer.parseInt(it.next()));
        //     } else if (it.nextIndex() == 2) {
        //         hora_local = hora_local.plusDays(Integer.parseInt(it.next()));
        //     } else if (it.nextIndex() == 3) {
        //         hora_local = hora_local.plusMonths(Integer.parseInt(it.next()));
        //     }
        // }
        //
        // System.out.println(hora_local.format(formatador));
    }
}


