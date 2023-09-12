package proyecto1courses;

import java.io.Serializable;
import java.util.ArrayList;
import javax.swing.JOptionPane;


public class Course implements Serializable{
    
    private String codeCourse;
    private String nameCourse;
    private int credits;
    private ArrayList<Student> studentsArray = new ArrayList<>(); 
    private Professor profesor;
    private ArrayList<HomeWork> tareasArrayProfesor = new ArrayList<>();
    private ArrayList<HomeWork> tareasArrayEstudiante = new ArrayList<>();
    private double notaAcumuladaStudent;

    public Course(){}

    public Course(String codeCourse, String nameCourse, int credits, Professor profesor, ArrayList students) {
        this.codeCourse = codeCourse;
        this.nameCourse = nameCourse;
        this.credits = credits;
        this.profesor = profesor;
        this.studentsArray = students;
    }
    
     public Course(String codeCourse, String nameCourse, int credits, Professor profesor) {
        this.codeCourse = codeCourse;
        this.nameCourse = nameCourse;
        this.credits = credits;
        this.profesor = profesor;
       
    }
     
    public Course(ArrayList students){
        this.studentsArray = students;
    }
    

    public String getCodeCourse() {
        return codeCourse;
    }
    

    public void setCodeCourse(String codeCourse) {
        this.codeCourse = codeCourse;
    }

    public String getNameCourse() {
        return nameCourse;
    }

    public void setNameCourse(String nameCourse) {
        this.nameCourse = nameCourse;
    }

    public int getCredits() {
        return credits;
    }

    public void setCredits(int credits) {
        this.credits = credits;
    }

    public ArrayList<Student> getStudentsArray() {
        return studentsArray;
    }

    public void setStudentsArray(ArrayList<Student> studentsArray) {
        this.studentsArray = studentsArray;
    }

    public Professor getProfesor() {
        return profesor;
    }

    public void setProfesor(Professor profesor) {
        this.profesor = profesor;
    }
    
    public void addStudentsToCourse(Student estudiante){
        if (studentsArray.size() < 50) {
            studentsArray.add(estudiante);
            
        }else{
            JOptionPane.showMessageDialog(null, "Exceso de estudiantes");
        }
    }
    
    public void deleteStudentToCourse(Student estudiante){
        studentsArray.remove(estudiante);
    }

    public ArrayList<HomeWork> getTareasArrayProfesor() {
        return tareasArrayProfesor;
    }

    public void setTareasArrayProfesor(ArrayList<HomeWork> tareasArrayProfesor) {
        this.tareasArrayProfesor = tareasArrayProfesor;
    }
    
    public void addHomeWorkToCourse(String nameHW, String descripHW, int ponderacionHW,int averageHW){
        HomeWork tarea = new HomeWork();
        
        tarea.setNameHW(nameHW);
        tarea.setDescripHW(descripHW);
        tarea.setPonderacionHW(ponderacionHW);
        tarea.setAverageHW(averageHW);
        
        tareasArrayProfesor.add(tarea);
        System.out.println("se agrego tarea a profesor");
    }
    
    public void addHomeWorkToStudent(String nameHW, String descripHW, int ponderacionHW,double nota,Student estudiante){
        HomeWork tarea = new HomeWork();
        
        tarea.setNameHW(nameHW);
        tarea.setDescripHW(descripHW);
        tarea.setPonderacionHW(ponderacionHW);
        tarea.setNota(nota);
        tarea.addStudentAndNote(estudiante, nota);
        tarea.setEstudiante(estudiante);
        tareasArrayEstudiante.add(tarea);
        System.out.println("se agrego tarea a estudiante");
    }
    

    public double getNotaAcumuladaStudent() {
        return notaAcumuladaStudent;
    }

    public void setNotaAcumuladaStudent(double notaAcumuladaStudent) {
        this.notaAcumuladaStudent = notaAcumuladaStudent;
    }
    
    public void sumarNotas(double nota){
        this.notaAcumuladaStudent += nota;
        System.out.println("Se agrego suma de la nota" + this.notaAcumuladaStudent);
    }

    public ArrayList<HomeWork> getTareasArrayEstudiante() {
        return tareasArrayEstudiante;
    }

    public void setTareasArrayEstudiante(ArrayList<HomeWork> tareasArrayEstudiante) {
        this.tareasArrayEstudiante = tareasArrayEstudiante;
    }
    
    public int getStudentCount(){
        return studentsArray.size();
    }
    
}
