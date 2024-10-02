package modelo_fofoca_entj.scratchs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class scratch_2 {
    public static void main(String[] args) {
        String[] arr2 = new String[] {"A1", "B2", "C3", "D4", "E5", "F6", "G7", "H8", "I9", "J8", "K9", "L10"};

        List<String> palavras = new ArrayList<>(Arrays.stream(arr2).toList());
        // palavras.addAll(Arrays.stream(arr2).toList());

        // ListIterator<String> it = palavras.listIterator();
        // while (it.hasNext()) {System.out.println(it.next());}
        for (String palavra : palavras) {
            System.out.println(palavra);
        }

    }
}