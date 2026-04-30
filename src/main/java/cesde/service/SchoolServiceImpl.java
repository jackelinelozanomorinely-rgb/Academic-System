package cesde.service;

import cesde.domain.School;
import cesde.repository.SchoolRepository;
import cesde.util.TypeValidator;

import java.util.List;
import java.util.Optional;

public class SchoolServiceImpl implements SchoolService {

    private final SchoolRepository schoolRepository;

    public SchoolServiceImpl(SchoolRepository schoolRepository){
        this.schoolRepository = schoolRepository;
    }

    @Override
    public School createSchoolService(){

        School school = new School();

        school.setId(TypeValidator.validateInt("Ingrese el id de la escuela"));
        school.setName(TypeValidator.validateString("Ingrese el nombre de la escuela"));
        school.setDirector(TypeValidator.validateString("Ingrese el nombre del director"));

        return schoolRepository.createSchoolRepository(school);
    }

    @Override
    public School updateSchoolService(int id){

        School school = schoolRepository.getSchoolById(id);

        if(school != null){
            System.out.println("Seleccione el dato a actualizar \n" +
                    "1. id \n" +
                    "2. Nombre \n" +
                    "3. Director ");

            int option = TypeValidator.validateInt("Opcion: ");

            switch (option){
                case 1:
                    school.setId(TypeValidator.validateInt("Actualizar id"));
                    break;
                case 2:
                    school.setName(TypeValidator.validateString("Actualizar nombre"));
                    break;
                case 3:
                    school.setDirector(TypeValidator.validateString("Actualizar director"));
                    break;
                default:
                    System.out.println("Seleccione una opción válida");
            }
        } else {
            System.out.println("Escuela no encontrada");
        }

        return school;
    }

    @Override
    public Optional<School> getSchoolById(int id){

        School school = schoolRepository.getSchoolById(id);

        if (school != null) {
            System.out.println("id: " + school.getId() + "\n" +
                    "Nombre: " + school.getName() + "\n" +
                    "Director: " + school.getDirector());
        } else {
            System.out.println("Escuela no encontrada");
        }

        return Optional.ofNullable(school);
    }

    @Override
    public List<School> getAllSchools() {
        return schoolRepository.getAllSchools();
    }

    @Override
    public void deleteSchool(int id) {
        schoolRepository.deleteSchoolRepository(id);
    }
}
