package cesde.service;

import cesde.domain.Course;
import cesde.repository.CourseRepository;
import cesde.util.TypeValidator;

import java.util.List;
import java.util.Optional;

public class CourseServiceImpl implements CourseService {

    private final CourseRepository courseRepository;

    public CourseServiceImpl(CourseRepository courseRepository){
        this.courseRepository = courseRepository;
    }

    @Override
    public Course createCourseService(){

        Course course = new Course();

        course.setId(TypeValidator.validateInt("Ingrese el id del curso"));
        course.setName(TypeValidator.validateString("Ingrese el nombre del curso"));
        course.setProgram(TypeValidator.validateString("Ingrese el programa"));
        course.setSchool(TypeValidator.validateString("Ingrese la escuela"));
        course.setTeacher(TypeValidator.validateString("Ingrese el profesor"));
        course.setStartDate(TypeValidator.validateString("Ingrese la fecha de inicio"));
        course.setEndDate(TypeValidator.validateString("Ingrese la fecha de fin"));

        return courseRepository.createCourseRepository(course);
    }

    @Override
    public Course updateCourseService(int id){

        Course course = courseRepository.getCourseById(id);

        if(course != null){

            System.out.println("Seleccione el dato a actualizar \n" +
                    "1. id \n" +
                    "2. Nombre \n" +
                    "3. Programa \n" +
                    "4. Escuela \n" +
                    "5. Profesor \n" +
                    "6. Fecha Inicio \n" +
                    "7. Fecha Fin ");

            int option = TypeValidator.validateInt("Opcion: ");

            switch (option){
                case 1:
                    course.setId(TypeValidator.validateInt("Actualizar id"));
                    break;
                case 2:
                    course.setName(TypeValidator.validateString("Actualizar nombre"));
                    break;
                case 3:
                    course.setProgram(TypeValidator.validateString("Actualizar programa"));
                    break;
                case 4:
                    course.setSchool(TypeValidator.validateString("Actualizar escuela"));
                    break;
                case 5:
                    course.setTeacher(TypeValidator.validateString("Actualizar profesor"));
                    break;
                case 6:
                    course.setStartDate(TypeValidator.validateString("Actualizar fecha inicio"));
                    break;
                case 7:
                    course.setEndDate(TypeValidator.validateString("Actualizar fecha fin"));
                    break;
                default:
                    System.out.println("Seleccione una opción valida");
            }
        } else {
            System.out.println("Curso no encontrado");
        }

        return course;
    }

    @Override
    public Optional<Course> getCourseById(int id) {

        Course course = courseRepository.getCourseById(id);

        if (course != null) {
            System.out.println("Id: " + course.getId() + "\n" +
                    "Nombre: " + course.getName() + "\n" +
                    "Programa: " + course.getProgram() + "\n" +
                    "Escuela: " + course.getSchool() + "\n" +
                    "Profesor: " + course.getTeacher() + "\n" +
                    "Periodo: " + course.getStartDate() + " a " + course.getEndDate());
        } else {
            System.out.println("Curso no encontrado");
        }

        return Optional.ofNullable(course);
    }

    @Override
    public List<Course> getAllCourses() {
        return courseRepository.getAllCourses();
    }

    @Override
    public void deleteCourse(int id) {
        System.out.println("Estoy en el service");
        courseRepository.deleteCourseRepository(id);
    }
}
