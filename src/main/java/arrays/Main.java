/**
 * Reference: https://docs.oracle.com/javase/tutorial/java/nutsandbolts/arrays.html
**/

package arrays;

public class Main {
    public static void main(String[] args) {
        String[] arr0;
        arr0 = new String[10];
        arr0[1] = "arr0: 1;0";
        arr0[2] = "arr0: 2;1";
        arr0[3] = "arr0: 3;2";

        String[] arr1 = new String[10];
        arr1[1] = "arr1: 1;0";
        arr1[2] = "arr1: 2;1";
        arr1[3] = "arr1: 3;2";

        String[] arr2 = new String[] {"A1", "B2", "C3", "D4", "E5"};

        String[] arr3 = {"A", "B", "C"};

        String[][] arr4 = new String[][] {{"A", "B"}, {"A", "B"}};
    }
}
