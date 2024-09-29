package modelo_fofoca_entj.Controller;

import modelo_fofoca_entj.Modeller.MPerson;

public class CPerson {
    MPerson modeller;

    public CPerson(MPerson modeller) {
        this.modeller = modeller;
    }

    // External Controller Updaters
    public void updateName(String new_name) {
        modeller.setName(new_name);
    }

    public void updateAge(Integer new_age) {
        modeller.setAge(new_age);
    }
}
