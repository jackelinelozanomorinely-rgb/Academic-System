package cesde.service;

import cesde.domain.Classroom;
import cesde.repository.ClassroomRepository;
import cesde.util.TypeValidator;

import java.util.List;
import java.util.Optional;

public class ClassroomServiceImpl implements ClassroomService {

    private final ClassroomRepository classroomRepository;

    public ClassroomServiceImpl(ClassroomRepository classroomRepository){
        this.classroomRepository = classroomRepository;
    }

    @Override
    public Classroom createClassroomService(){

        Classroom classroom = new Classroom();

        classroom.setId(TypeValidator.validateInt("Ingrese el id del aula"));
        classroom.setName(TypeValidator.validateString("Ingrese el nombre del aula"));
        classroom.setCapacity(TypeValidator.validateInt("Ingrese la capacidad del aula"));

        return classroomRepository.createClassroomRepository(classroom);
    }

    @Override
    public Classroom updateClassroomService(int id){

        Classroom classroom = classroomRepository.getClassroomById(id);

        if(classroom != null){
            System.out.println("Seleccione el dato a actualizar \n" +
                    "1. id \n" +
                    "2. Nombre \n" +
                    "3. Capacidad ");

            int option = TypeValidator.validateInt("Opcion: ");

            switch (option){
                case 1:
                    classroom.setId(TypeValidator.validateInt("Actualizar id"));
                    break;
                case 2:
                    classroom.setName(TypeValidator.validateString("Actualizar nombre"));
                    break;
                case 3:
                    classroom.setCapacity(TypeValidator.validateInt("Actualizar capacidad"));
                    break;
                default:
                    System.out.println("Seleccione una opción válida");
            }
        } else {
            System.out.println("Aula no encontrada");
        }

        return classroom;
    }

    @Override
    public Optional<Classroom> getClassroomById(int id){

        Classroom classroom = classroomRepository.getClassroomById(id);

        if (classroom != null) {
            System.out.println("id: " + classroom.getId() + "\n" +
                    "Nombre: " + classroom.getName() + "\n" +
                    "Capacidad: " + classroom.getCapacity());
        } else {
            System.out.println("Aula no encontrada");
        }

        return Optional.ofNullable(classroom);
    }

    @Override
    public List<Classroom> getAllClassrooms() {
        return classroomRepository.getAllClassrooms();
    }

    @Override
    public void deleteClassroom(int id) {
        classroomRepository.deleteClassroomRepository(id);
    }
}