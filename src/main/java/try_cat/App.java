package try_cat;

import java.util.InputMismatchException;
import java.util.Scanner;

public class App {
    public static int entradaNumero(String mensagem) {
        Scanner scanner = new Scanner(System.in);

        System.out.print(mensagem);

        try {
            return scanner.nextInt();
        } catch (InputMismatchException e) {
           return entradaNumero(mensagem);
        }
    }

    public static void main(String[] args) {
        // Scanner scanner = new Scanner(System.in);
        //
        // System.out.print("numero > ");
        // Integer numero = scanner.nextInt();

        Integer numero = entradaNumero("numero > ");
        System.out.println(numero);

    }
}
