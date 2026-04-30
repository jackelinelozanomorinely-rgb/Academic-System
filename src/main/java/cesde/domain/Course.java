package cesde.domain;

public class Course {

    // Atributes
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

    public Course(int id, String name, String program, String school,
                  String teacher, String startDate, String endDate) {

        this.id = id;
        this.name = name;
        this.program = program;
        this.school = school;
        this.teacher = teacher;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    // Getters and Setters

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
}