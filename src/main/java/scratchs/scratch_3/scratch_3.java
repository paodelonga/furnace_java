package scratchs.scratch_3;

public class scratch_3 {

    public static void main(String[] args) {
        Dog aDog = new Dog("Max");
        Dog oldDog = aDog;

        // we pass the object to foo
        foo(aDog);

        // aDog variable is still pointing to the "Max" dog when foo(...) returns
        System.out.println("1Out : " + aDog.getName().equals("Max"));

        System.out.println("2Out : " + aDog.getName().equals("Fifi"));
        // aDog == oldDog; // true
    }

    public static void foo(Dog d) {
        System.out.println("1Foo : " + d.getName().equals("Max")); // true
        // change d inside of foo() to point to a new Dog instance construct red with name member variable set to "Fifi"
        // d = new Dog("Fifi")
        // d.name = "Fifi";
        // d.updateName("Fifi");

        System.out.println("2Foo : " + d.getName().equals("Fifi"));
    }
}