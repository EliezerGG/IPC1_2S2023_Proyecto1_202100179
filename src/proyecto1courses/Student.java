package proyecto1courses;

import java.util.ArrayList;

public class Student {
    
    private String codeStudet;
    private String nameStudet;
    private String lastNameStudent;
    private String emailStudent;
    private String passwordStudent;
    private String gender;
    private ArrayList<Course> cursosEstudiante = new ArrayList<>();

    public Student(){}
    
    public Student(String codeStudet, String nameStudet, String lastNameStudent, String emailStudent, String gender, String password) {
        this.codeStudet = codeStudet;
        this.nameStudet = nameStudet;
        this.lastNameStudent = lastNameStudent;
        this.emailStudent = emailStudent;
        this.gender = gender;
        this.passwordStudent = password;
    }
    
    public Student(ArrayList cursosEstudiante){
        this.cursosEstudiante = cursosEstudiante;
    }

    public String getCodeStudet() {
        return codeStudet;
    }

    public void setCodeStudet(String codeStudet) {
        this.codeStudet = codeStudet;
    }

    public String getNameStudet() {
        return nameStudet;
    }

    public void setNameStudet(String nameStudet) {
        this.nameStudet = nameStudet;
    }

    public String getLastNameStudent() {
        return lastNameStudent;
    }

    public void setLastNameStudent(String lastNameStudent) {
        this.lastNameStudent = lastNameStudent;
    }

    public String getEmailStudent() {
        return emailStudent;
    }

    public void setEmailStudent(String emailStudent) {
        this.emailStudent = emailStudent;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getPasswordStudent() {
        return passwordStudent;
    }

    public void setPasswordStudent(String passwordStudent) {
        this.passwordStudent = passwordStudent;
    }

    public ArrayList<Course> getCursosEstudiante() {
        return cursosEstudiante;
    }

    public void setCursosEstudiante(ArrayList<Course> cursosEstudiante) {
        this.cursosEstudiante = cursosEstudiante;
    }
    
    public void addCourseToStudent(Course curso){
        cursosEstudiante.add(curso);
        System.out.println("curso agreago al estudiante " + this.nameStudet + " el siguient curso" + curso.getNameCourse());
    }
    
    public void addHomeWorkToStudent(String nameHW, String descripHW, int ponderacionHW, double nota){
        HomeWork tarea = new HomeWork();
        
        tarea.setNameHW(nameHW);
        tarea.setDescripHW(descripHW);
        tarea.setPonderacionHW(ponderacionHW);
        tarea.setNota(nota);
        
        
    }
}
