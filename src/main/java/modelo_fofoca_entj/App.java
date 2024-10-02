package modelo_fofoca_entj;

import modelo_fofoca_entj.Modeller.*;
import modelo_fofoca_entj.Controller.*;
import modelo_fofoca_entj.Viewer.*;

public class App {
    public static void main(String[] args) {
        MPerson personModeller = new MPerson("Ana", "457.246.325-21", "98327573727", 18);
        CPerson personController = new CPerson(personModeller);
        VPerson personVisualizer = new VPerson(personModeller, personController);

        personVisualizer.getPersonDetails();

        personController.updateName("Carla");
        personController.updateAge(48);

        personVisualizer.getPersonDetails();

    }
}
