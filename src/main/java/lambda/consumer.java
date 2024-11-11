package lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.function.Consumer;

public class consumer {
    public static void main(String[] args) {
        Consumer<List<Integer>> cnt = l -> {
            Integer j;
            for (int x = 0; x < l.size(); x++) {
                j = l.get(x);
                l.set(x, j * (j * x));
            }
        };

        List<Integer> Y = new ArrayList<Integer>();
        Y.add(new Random().nextInt(0, 64));
        Y.add(new Random().nextInt(0, 64));
        Y.add(new Random().nextInt(0, 64));
        Y.add(new Random().nextInt(0, 64));

        Consumer<List<Integer>> dspl = t -> t.forEach(
            z -> System.out.println(z)
        );

        cnt.andThen(dspl).accept(Y);
    }
}
