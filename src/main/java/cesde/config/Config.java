package cesde.config;

import cesde.repository.ClassroomRepository;
import cesde.repository.StudentRepository;
import cesde.repository.CourseRepository;
import cesde.repository.TeacherRepository;
import cesde.repository.SchoolRepository;

import cesde.service.ClassroomServiceImpl;
import cesde.service.StudentServiceImpl;
import cesde.service.CourseServiceImpl;
import cesde.service.TeacherServiceImpl;
import cesde.service.SchoolServiceImpl;

import cesde.view.*;

import cesde.userinterface.MenuApp;

public class Config {

    public static MenuApp createMenuApp() {

        // ===== STUDENT =====
        StudentRepository studentRepository = new StudentRepository();
        StudentServiceImpl studentService = new StudentServiceImpl(studentRepository);
        StudentView studentView = new StudentView(studentService);

        // ===== COURSE =====
        CourseRepository courseRepository = new CourseRepository();
        CourseServiceImpl courseService = new CourseServiceImpl(courseRepository);
        CourseView courseView = new CourseView(courseService);


        // ===== TEACHER =====
        TeacherRepository teacherRepository = new TeacherRepository();
        TeacherServiceImpl teacherService = new TeacherServiceImpl(teacherRepository);
        TeacherView teacherView = new TeacherView(teacherService);

        //CLASSROOM
        ClassroomRepository classroomRepository = new ClassroomRepository();
        ClassroomServiceImpl classroomService = new ClassroomServiceImpl(classroomRepository);
        ClassroomView classroomView = new ClassroomView(classroomService);

        //SCHOOL
        SchoolRepository schoolRepository = new SchoolRepository();
        SchoolServiceImpl schoolService = new SchoolServiceImpl(schoolRepository);
        SchoolView schoolView = new SchoolView(schoolService);

        // ===== MENU =====
        return new MenuApp(studentView, courseView, teacherView, classroomView, schoolView);
    }
}
