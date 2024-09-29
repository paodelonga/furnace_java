package modelo_fofoca_entj.Viewer;

import modelo_fofoca_entj.Modeller.MPerson;

public class VPerson {
    MPerson modeller;

    public VPerson(MPerson modeller) {
        this.modeller = modeller;
    }

    // External Viewer Getters
    public String getName() {
        return modeller.getName();
    }
    public String getCPF() {
        return modeller.getCPF();
    }
    public String getNumber() {
        return modeller.getNumber();
    }
    public Integer getAge() {
        return modeller.getAge();
    }
}
