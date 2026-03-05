package clase4;

import java.util.List;
import java.util.Scanner;

public class Course {
    Scanner sc = new Scanner(System.in);

    // Attributes
    private int id;
    private String name;
    private String program;
    private String school;
    private String teacher;
    private String startDate;
    private String endDate;

    // Constructors
    public Course() {
    }

    public Course(int id, String name, String program, String school, String teacher, String startDate, String endDate) {
        this.id = id;
        this.name = name;
        this.program = program;
        this.school = school;
        this.teacher = teacher;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    // Getters And Setters
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getProgram() {
        return program;
    }
    public void setProgram(String program) {
        this.program = program;
    }

    public String getSchool() {
        return school;
    }
    public void setSchool(String school) {
        this.school = school;
    }

    public String getTeacher() {
        return teacher;
    }
    public void setTeacher(String teacher) {
        this.teacher = teacher;
    }

    public String getStartDate() {
        return startDate;
    }
    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }
    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    // Methods
    public Course createCourse(Course course) {
        System.out.println("Ingrese el ID del Curso:");
        course.setId(sc.nextInt());
        sc.nextLine();

        System.out.println("Ingrese el Nombre del Curso:");
        course.setName(sc.nextLine());

        System.out.println("Ingrese el Programa:");
        course.setProgram(sc.nextLine());

        System.out.println("Ingrese la Escuela:");
        course.setSchool(sc.nextLine());

        System.out.println("Ingrese el nombre del Profesor:");
        course.setTeacher(sc.nextLine());

        System.out.println("Ingrese fecha de Inicio (DD/MM/AAAA):");
        course.setStartDate(sc.nextLine());

        System.out.println("Ingrese fecha de Fin (DD/MM/AAAA):");
        course.setEndDate(sc.nextLine());

        return course;
    }

    public void getCourseById(int id) {
        if (id == this.id) {
            System.out.println("ID: " + this.id + "\n" +
                    "Curso: " + this.name + "\n" +
                    "Programa: " + this.program + "\n" +
                    "Profesor: " + this.teacher + "\n" +
                    "Periodo: " + this.startDate + " a " + this.endDate);
        } else {
            System.out.println("Curso no encontrado");
        }
    }

    public Course updateCourse(Course course) {
        return course;
    }

    public void deleteCourse(int id) {
        System.out.println("Curso con ID " + id + " eliminado.");
    }
}