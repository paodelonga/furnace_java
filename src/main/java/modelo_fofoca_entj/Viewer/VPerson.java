package modelo_fofoca_entj.Viewer;

import modelo_fofoca_entj.Modeller.MPerson;

public class VPerson {
    MPerson modeller;

    public VPerson(MPerson modeller) {
        this.modeller = modeller;
    }

    // External Viewer Getter
    public void getPersonDetails() {
        System.out.println(modeller.getName());
        System.out.println(modeller.getNumber());
        System.out.println(modeller.getCPF());
        System.out.println(modeller.getAge());
    }
}
