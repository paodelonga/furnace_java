package seguranca;

public interface Employer {
    Cargo cargo = null;

    public default Cargo cargo() {
        return cargo;
    }
}
