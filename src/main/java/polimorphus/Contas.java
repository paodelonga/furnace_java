package polimorphus;

public class Contas {
    public static void mostrarCalculo(OperacaoMatematica op, double x, double y) {
        System.out.println("O resultado da operacao é: " + op.calcular(x, y));
    }

    public static void mostrarCalculo(Soma soma, double x, double y) {
        System.out.println("O Resultado é: " + soma.calcular(x, y));
    }

    public static void mostrarCalculo(Subtracao subtracao, double x, double y) {
        System.out.println("O Resultado é: " + subtracao.calcular(x, y));
    }

    public static void main(String[] args) {
        Contas.mostrarCalculo(new Soma(),10,15);
        Contas.mostrarCalculo(new Subtracao(),10,15);
    }

}
