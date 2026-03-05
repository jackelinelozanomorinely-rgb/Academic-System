package clase4;

import java.util.List;
import java.util.Scanner;

public class Teacher {
    Scanner sc = new Scanner(System.in);

    // Attributes
    private int id;
    private String firstName;
    private String lastName;
    private String email;
    private String specialty;

    // Constructors
    public Teacher() {
    }

    public Teacher(int id, String firstName, String lastName, String email, String specialty) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.specialty = specialty;
    }

    // --- GETTERS AND SETTERS ---

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    // --- METHODS ---

    public Teacher createTeacher(Teacher teacher) {
        System.out.println("Ingrese el ID del Profesor:");
        int id = sc.nextInt();
        teacher.setId(id);
        sc.nextLine();

        System.out.println("Ingrese el Nombre:");
        String firstName = sc.nextLine();
        teacher.setFirstName(firstName);

        System.out.println("Ingrese el Apellido:");
        String lastName = sc.nextLine();
        teacher.setLastName(lastName);

        System.out.println("Ingrese el Correo Electrónico:");
        String email = sc.nextLine();
        teacher.setEmail(email);

        System.out.println("Ingrese la Especialidad:");
        String specialty = sc.nextLine();
        teacher.setSpecialty(specialty);

        return teacher;
    }

    public void getTeacherById(int id) {
        if (id == this.id) {
            System.out.println("--- Datos del Profesor ---");
            System.out.println("ID: " + this.id);
            System.out.println("Nombre: " + this.firstName + " " + this.lastName);
            System.out.println("Email: " + this.email);
            System.out.println("Especialidad: " + this.specialty);
        } else {
            System.out.println("Profesor no encontrado.");
        }
    }

    public Teacher updateTeacher(Teacher teacher) {
        return teacher;
    }

    public void deleteTeacher(int id) {
        System.out.println("Profesor con ID " + id + " eliminado.");
    }
}