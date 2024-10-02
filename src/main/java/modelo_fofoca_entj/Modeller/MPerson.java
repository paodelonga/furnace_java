package modelo_fofoca_entj.Modeller;

public class MPerson {
    String name;
    String cpf;
    String number;
    Integer age;

    public MPerson(String name, String cpf, String number, Integer age) {
        this.name = name;
        this.cpf = cpf;
        this.number = number;
        this.age = age;
    }

    // Internal Modeller Setters
    public void setName(String person_name) {
        this.name = person_name;
    }
    public void setCPF(String person_cpf) {
        this.cpf = person_cpf;
    }
    public void setNumber(String person_number) {
        this.number = person_number;
    }
    public void setAge(Integer person_age) {
        this.age = person_age;
    }

    // Internal Modeller Getters
    public String getName() {
        return name;
    }
    public String getCPF() {
        return cpf;
    }
    public String getNumber() {
        return number;
    }
    public Integer getAge() {
        return age;
    }
}
