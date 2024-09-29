package modelo_fofoca_entj;

import modelo_fofoca_entj.Modeller.*;
import modelo_fofoca_entj.Viewer.*;

public class App {
    public static void main(String[] args) {
        MPerson newPerson = new MPerson("Ana", "457.246.325-21", "98327573727", 32);
        new VPerson(newPerson).getPersonDetails();

        newPerson.updateAge(48);
        new VPerson(newPerson).getPersonDetails();

    }
}