package clase4;

import java.util.List;
import java.util.Scanner;

public class Enrollment {
    Scanner sc = new Scanner(System.in);

    // Attributes
    private int id;
    private String date;
    private String student;
    private String course;
    private String classroom;
    private String status;

    // Constructors
    public Enrollment() {
    }

    public Enrollment(int id, String date, String student, String course, String classroom, String status) {
        this.id = id;
        this.date = date;
        this.student = student;
        this.course = course;
        this.classroom = classroom;
        this.status = status;
    }

    // --- GETTERS AND SETTERS ---

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getStudent() {
        return student;
    }

    public void setStudent(String student) {
        this.student = student;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public String getClassroom() {
        return classroom;
    }

    public void setClassroom(String classroom) {
        this.classroom = classroom;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    // --- METHODS ---

    public Enrollment createEnrollment(Enrollment enrollment) {
        System.out.println("Ingrese el ID de la Matrícula:");
        int id = sc.nextInt();
        enrollment.setId(id);
        sc.nextLine();

        System.out.println("Ingrese la Fecha (AAAA-MM-DD):");
        String date = sc.nextLine();
        enrollment.setDate(date);

        System.out.println("Ingrese el Nombre del Estudiante:");
        String student = sc.nextLine();
        enrollment.setStudent(student);

        System.out.println("Ingrese el Nombre del Curso:");
        String course = sc.nextLine();
        enrollment.setCourse(course);

        System.out.println("Ingrese el Aula/Salón:");
        String classroom = sc.nextLine();
        enrollment.setClassroom(classroom);

        System.out.println("Ingrese el Estado de la Matrícula (Ej: Activo):");
        String status = sc.nextLine();
        enrollment.setStatus(status);

        return enrollment;
    }

    public void getEnrollmentById(int id) {
        if (id == this.id) {
            System.out.println("Detalles de la Matrícula:" + "\n" +
                    "ID: " + this.id + "\n" +
                    "Fecha: " + this.date + "\n" +
                    "Estudiante: " + this.student + "\n" +
                    "Curso: " + this.course + "\n" +
                    "Salón: " + this.classroom + "\n" +
                    "Estado: " + this.status);
        } else {
            System.out.println("ID de matrícula no encontrado.");
        }
    }


    public Enrollment updateEnrollment(Enrollment enrollment) {
        return enrollment;
    }

    public void deleteEnrollment(int id) {
        System.out.println("Matrícula " + id + " eliminada.");
    }
}