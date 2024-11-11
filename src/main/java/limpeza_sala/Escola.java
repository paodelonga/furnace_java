package limpeza_sala;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import java.util.function.Consumer;

public class Escola {
    public static void main(String[] args) {
        List<Sala> lista_salas = new LinkedList<Sala>(
            List.of(
                new Sala(1, new Random().nextInt(15, 40)),
                new Sala(2, new Random().nextInt(15, 40)),
                new Sala(3, new Random().nextInt(15, 40)),
                new Sala(4, new Random().nextInt(15, 40)),
                new Sala(5, new Random().nextInt(15, 40)),
                new Sala(6, new Random().nextInt(15, 40))
            )
        );

        // for (int i = 0; i < lista_salas.size(); i++) {
        //     System.out.println("NUM: " + lista_salas.get(i).numero);
        //     System.out.println("QTD: " + lista_salas.get(i).quantidade_mesa);
        //     System.out.println("EST: " + lista_salas.get(i).estado);
        //     System.out.println("==================");
        // }

        Consumer<List<Sala>> dspl = sd -> {
            sd.forEach(
                sf -> {
                    System.out.println("NUM: " + sf.numero);
                    System.out.println("QTD: " + sf.quantidade_mesa);
                    System.out.println("EST: " + sf.estado);
                    System.out.println("=============");
                }
            );
        };

        dspl.accept(lista_salas);

        lista_salas.forEach(
            sj -> {
                sj.estado = "limpa";
            }
        );

        dspl.accept(lista_salas);
    }
}
