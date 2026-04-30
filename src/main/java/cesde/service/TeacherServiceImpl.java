package cesde.service;

import cesde.domain.Teacher;
import cesde.repository.TeacherRepository;
import cesde.util.TypeValidator;

import java.util.List;
import java.util.Optional;

public class TeacherServiceImpl implements TeacherService {

    private final TeacherRepository teacherRepository;

    public TeacherServiceImpl(TeacherRepository teacherRepository){
        this.teacherRepository = teacherRepository;
    }

    @Override
    public Teacher createTeacherService(){

        Teacher teacher = new Teacher();

        teacher.setId(TypeValidator.validateInt("Ingrese el id del profesor"));
        teacher.setName(TypeValidator.validateString("Ingrese el nombre del profesor"));
        teacher.setEmail(TypeValidator.validateString("Ingrese el email del profesor"));

        return teacherRepository.createTeacherRepository(teacher);
    }

    @Override
    public Teacher updateTeacherService(int id){

        Teacher teacher = teacherRepository.getTeacherById(id);

        if(teacher != null){
            System.out.println("Seleccione el dato a actualizar \n" +
                    "1. id \n" +
                    "2. Nombre \n" +
                    "3. Email ");

            int option = TypeValidator.validateInt("Opcion: ");

            switch (option){
                case 1:
                    teacher.setId(TypeValidator.validateInt("Actualizar id"));
                    break;
                case 2:
                    teacher.setName(TypeValidator.validateString("Actualizar nombre"));
                    break;
                case 3:
                    teacher.setEmail(TypeValidator.validateString("Actualizar email"));
                    break;
                default:
                    System.out.println("Seleccione una opción válida");
            }
        } else {
            System.out.println("Profesor no encontrado");
        }

        return teacher;
    }

    @Override
    public Optional<Teacher> getTeacherById(int id){

        Teacher teacher = teacherRepository.getTeacherById(id);

        if (teacher != null) {
            System.out.println("id: " + teacher.getId() + "\n" +
                    "Nombre: " + teacher.getName() + "\n" +
                    "Email: " + teacher.getEmail());
        } else {
            System.out.println("Profesor no encontrado");
        }

        return Optional.ofNullable(teacher);
    }

    @Override
    public List<Teacher> getAllTeachers() {
        return teacherRepository.getAllTeachers();
    }

    @Override
    public void deleteTeacher(int id) {
        teacherRepository.deleteTeacherRepository(id);
    }
}