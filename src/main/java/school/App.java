package School;

public class App {
    public static void main(String[] args) {
        Student student = new Student("Rodrigo", 2.0, "2VDMT1", new String[][] {{"Chemical", ""}, {"Mathematic", ""}});
        student.advertise();
        student.enroll("3VTV1", new String[][] {{"English", "3.0"}, {"Literature", "8.0"}, {"Arts", "1.2"}});
        student.advertise();
    }
}
