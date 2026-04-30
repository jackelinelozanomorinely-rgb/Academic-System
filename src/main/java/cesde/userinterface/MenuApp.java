package cesde.userinterface;

import cesde.util.TypeValidator;
import cesde.view.StudentView;
import cesde.view.CourseView;
import cesde.view.TeacherView;
import cesde.view.SchoolView;
import cesde.view.ClassroomView;

import java.util.Scanner;

public class MenuApp {

    Scanner sc = new Scanner(System.in);

    private final ClassroomView classroomView;
    private final StudentView studentView;
    private final CourseView courseView;
    private final TeacherView teacherView;
    private final SchoolView schoolView;

    public MenuApp(StudentView studentView, CourseView courseView, TeacherView teacherView, ClassroomView classroomView, SchoolView schoolView){
        this.studentView = studentView;
        this.courseView = courseView;
        this.teacherView = teacherView;
        this.classroomView = classroomView;
        this.schoolView = schoolView;
    }
    public void mainMenu(){

        System.out.println("Presione 1 para iniciar la Aplicación");

        int init = sc.nextInt();
        sc.nextLine();

        while(init != 0){

            System.out.println("Seleccione una opción 1. Registro 2. Inicio de Sesion 3. Salir ");

            int option = sc.nextInt();
            sc.nextLine();

            switch (option){

                case 1:
                    System.out.println("Crear usuario");
                    studentView.createStudent();
                    break;

                case 2:
                    System.out.println("Iniciar Sesión");
                    boolean token = true;
                    menuApplication(token);
                    break;

                case 3:
                    System.out.println("Salir del sistema ");
                    init = 0;
                    break;

                default:
                    System.out.println("Ingrese una opción valida");
            }
        }
    }

    public void menuApplication(boolean token){

        while(token) {
            System.out.println("Seleccione 1. Estudiante 2. Gestion de Cursos 3. Profesores 4. Aulas 5. Salir");

            int menu = sc.nextInt();

            switch (menu) {
                case 1:
                    System.out.println("Estudiante");
                    studentMenu();
                    break;

                case 2:
                    System.out.println("Gestion de Cursos");
                    courseMenu();
                    break;

                case 3:
                    System.out.println("Profesores");
                    teacherMenu();
                    break;

                case 4:
                    System.out.println("Aulas");
                    classroomMenu();
                    break;

                case 5:
                    System.out.println("Volviendo al menú principal");
                    token = false;
                    break;
                default:
                    System.out.println("Seleccione menu valido");
            }
        }
    }

    public void courseMenu(){

        System.out.println("Menu Curso");
        boolean init = true;
        sc.nextLine();

        while(init){
            System.out.println("Seleccione 1. Estudiante 2. Gestion de Cursos 3. Profesores 4. Aulas 5. Escuelas 6. Salir");

            int opt = sc.nextInt();
            sc.nextLine();

            switch (opt){
                case 1:
                    System.out.println("Crear Curso");
                    courseView.createCourse();
                    break;

                case 2:
                    System.out.println("Actualizar Curso");
                    courseView.updateCourse(TypeValidator.validateInt("Ingrese el id del curso a actualizar"));
                    break;

                case 3:
                    System.out.println("Ver Cursos");
                    courseView.getAllCourses();
                    break;

                case 4:
                    System.out.println("Ver curso por id");
                    int id = sc.nextInt();
                    courseView.getCourseById(id);
                    break;

                case 5:
                    System.out.println("Escuelas");
                    schoolMenu();
                    break;

                case 6:
                    System.out.println("Volviendo al menú principal");
                    init = false;
                    break;

                default:
                    System.out.println("Seleccione opción valida");
            }
        }
    }

    public void studentMenu(){

        System.out.println("Menu Estudiante");
        boolean init = true;
        sc.nextLine();

        while(init){
            System.out.println("1. Crear Estudiante 2. Actualizar Estudiante 3. ver Estudiantes 4. Ver Estudiante por Id 5. Eliminar Estudiante 6. Volver");

            int opt = sc.nextInt();
            sc.nextLine();

            switch (opt){
                case 1:
                    System.out.println("Crear Estudiante");
                    studentView.createStudent();
                    break;

                case 2:
                    System.out.println("Actualizar Estudiante");
                    studentView.updateStudent(TypeValidator.validateInt("Ingrese el id del estudiante a actualizar"));
                    break;

                case 3:
                    System.out.println("Ver Estudiantes");
                    studentView.getAllStudents();
                    break;

                case 4:
                    System.out.println("Ver estudiante por id");
                    int id = sc.nextInt();
                    studentView.getStudentById(id);
                    break;

                case 5:
                    System.out.println("Eliminar Estudiante");
                    int idToRemove = sc.nextInt();
                    studentView.deleteStudent(idToRemove);
                    break;

                case 6:
                    System.out.println("Volviendo al menú principal");
                    init = false;
                    break;

                default:
                    System.out.println("Seleccione opción valida");
            }
        }
    }
    public void teacherMenu(){

        System.out.println("Menu Profesor");
        boolean init = true;
        sc.nextLine();

        while(init){
            System.out.println("1. Crear Profesor 2. Actualizar Profesor 3. Ver Profesores 4. Ver Profesor por Id 5. Eliminar Profesor 6. Volver");

            int opt = sc.nextInt();
            sc.nextLine();

            switch (opt){
                case 1:
                    teacherView.createTeacher();
                    break;

                case 2:
                    teacherView.updateTeacher(TypeValidator.validateInt("Ingrese el id del profesor"));
                    break;

                case 3:
                    teacherView.getAllTeachers();
                    break;

                case 4:
                    int id = sc.nextInt();
                    teacherView.getTeacherById(id);
                    break;

                case 5:
                    int idToRemove = sc.nextInt();
                    teacherView.deleteTeacher(idToRemove);
                    break;

                case 6:
                    init = false;
                    break;

                default:
                    System.out.println("Seleccione opción valida");
            }
        }
    }
    public void classroomMenu(){

        System.out.println("Menu Aula");
        boolean init = true;
        sc.nextLine();

        while(init){
            System.out.println("1. Crear Aula 2. Actualizar Aula 3. Ver Aulas 4. Ver Aula por Id 5. Eliminar Aula 6. Volver");

            int opt = sc.nextInt();
            sc.nextLine();

            switch (opt){
                case 1:
                    classroomView.createClassroom();
                    break;

                case 2:
                    classroomView.updateClassroom(TypeValidator.validateInt("Ingrese el id del aula"));
                    break;

                case 3:
                    classroomView.getAllClassrooms();
                    break;

                case 4:
                    int id = sc.nextInt();
                    classroomView.getClassroomById(id);
                    break;

                case 5:
                    int idToRemove = sc.nextInt();
                    classroomView.deleteClassroom(idToRemove);
                    break;

                case 6:
                    init = false;
                    break;

                default:
                    System.out.println("Seleccione opción valida");
            }
        }
    }
    public void schoolMenu(){

        System.out.println("Menu Escuela");
        boolean init = true;
        sc.nextLine();

        while(init){
            System.out.println("1. Crear Escuela 2. Actualizar Escuela 3. Ver Escuelas 4. Ver Escuela por Id 5. Eliminar Escuela 6. Volver");

            int opt = sc.nextInt();
            sc.nextLine();

            switch (opt){
                case 1:
                    schoolView.createSchool();
                    break;

                case 2:
                    schoolView.updateSchool(TypeValidator.validateInt("Ingrese el id de la escuela"));
                    break;

                case 3:
                    schoolView.getAllSchools();
                    break;

                case 4:
                    int id = sc.nextInt();
                    schoolView.getSchoolById(id);
                    break;

                case 5:
                    int idToRemove = sc.nextInt();
                    schoolView.deleteSchool(idToRemove);
                    break;

                case 6:
                    init = false;
                    break;

                default:
                    System.out.println("Seleccione opción valida");
            }
        }
    }
}