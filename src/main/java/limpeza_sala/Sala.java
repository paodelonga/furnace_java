package limpeza_sala;

public class Sala {
    String estado;
    Integer numero;
    Integer quantidade_mesa;

    public Sala(Integer numero, Integer quantidade_mesa) {
        this.numero = numero;
        this.quantidade_mesa = quantidade_mesa;
        estado = "Suja";
    }
}
