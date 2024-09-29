package modelo_fofoca_entj;

import modelo_fofoca_entj.Modeller.*;
import modelo_fofoca_entj.Viewer.*;

public class App {
    public static void main(String[] args) {
        MPerson newPerson = new MPerson("Ana", "457.246.325-21", "98327573727", 32);
        System.out.println(new VPerson(newPerson).getName());
        System.out.println(new VPerson(newPerson).getAge());
        System.out.println(new VPerson(newPerson).getCPF());
        System.out.println(new VPerson(newPerson).getNumber());

        newPerson.updateAge(48);
        System.out.println(new VPerson(newPerson).getName());
        System.out.println(new VPerson(newPerson).getAge());
        System.out.println(new VPerson(newPerson).getCPF());
        System.out.println(new VPerson(newPerson).getNumber());
    }
}