package cesde.domain;

import java.util.Scanner;

public class Enrollment {
    Scanner sc = new Scanner(System.in);

    // Attributes in English
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

    // get y set

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
        System.out.println("Ingrese el Id de la Matrícula:");
        int id = sc.nextInt();
        enrollment.setId(id);
        sc.nextLine();

        System.out.println("Ingrese la Fecha:");
        String date = sc.nextLine();
        enrollment.setDate(date);

        System.out.println("Ingrese el Nombre del Estudiante:");
        String student = sc.nextLine();
        enrollment.setStudent(student);

        System.out.println("Ingrese el Nombre del Curso:");
        String course = sc.nextLine();
        enrollment.setCourse(course);

        System.out.println("Ingrese el Aula:");
        String classroom = sc.nextLine();
        enrollment.setClassroom(classroom);

        System.out.println("Ingrese el Estado de la Matrícula:");
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

    public static class Teacher {
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

        //get y set

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

        // Methods

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
}