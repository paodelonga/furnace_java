package School;

import java.util.Arrays;

public class Student {
    // O que os guri tem?
    // Nome, Turma, Sala, Curso, Notas
    private String name; // Nome do estudante
    private Double scores; // Notas dos guri
    private String classroom; // Turma do estudante
    private String[][] courses; // Materias do estudante

    public Student(String name, Double scores, String classroom, String[][] courses) {
        this.name = name;
        this.scores = scores;
        this.classroom = classroom;
        this.courses = courses;
    }

    public void enroll(String classroom, String[][] courses) {
        this.classroom = classroom;
        this.courses = courses;
    }

    public void advertise() {
        System.out.println(this.name);
        System.out.println(this.scores);
        System.out.println(this.classroom);
        System.out.println(this.courses[0][0]);
        System.out.println(this.courses[0][1]);
        System.out.println(this.courses[1][0]);
        System.out.println(this.courses[1][1]);
    }

}
