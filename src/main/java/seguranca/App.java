package seguranca;

public class App {
    public static void main(String[] args) {
        Funcionario funcionario= new Funcionario("Augsto", 23);
        Hospede hospede =  new Hospede("Marcos", 18);
        Visitante visitante = new Visitante("Rodrigo", 16);

        System.out.println(funcionario.cargo());
        System.out.println(visitante.cargo());
        System.out.println(hospede.cargo());
    }
}
