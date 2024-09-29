package modelo_fofoca_entj.Viewer;

import modelo_fofoca_entj.Modeller.MPerson;
import modelo_fofoca_entj.Controller.CPerson;

public class VPerson {
    MPerson modeller;
    CPerson controller;

    public VPerson(MPerson modeller, CPerson controller) {
        this.modeller = modeller;
        this.controller = controller;
    }

    // External Viewer Getter
    public void getPersonDetails() {
        System.out.println("Name: " + modeller.getName());
        System.out.println("Number: " + modeller.getNumber());
        System.out.println("CPF: " + modeller.getCPF());
        System.out.println("Age: " + modeller.getAge());
        System.out.println("");
    }
}
