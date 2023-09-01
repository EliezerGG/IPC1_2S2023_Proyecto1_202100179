package proyecto1courses;

import java.io.Serializable;
import java.util.HashMap;


public class HomeWork implements Serializable{
    private String nameHW;
    private String descripHW;
    private int ponderacionHW;
    private int averageHW;
    private double nota;
    private Student estudiante; 
    private HashMap<Student, Double> notaEstudiante = new HashMap<>();
    
    public HomeWork(){}
    
    public HomeWork(String nameHW, String descripHW, int ponderacionHW, double nota) {
        this.nameHW = nameHW;
        this.descripHW = descripHW;
        this.ponderacionHW = ponderacionHW;
        this.nota = nota;
    }

    public HomeWork(int averageHW) {
        this.averageHW = averageHW;
    }

    public String getNameHW() {
        return nameHW;
    }

    public void setNameHW(String nameHW) {
        this.nameHW = nameHW;
    }

    public String getDescripHW() {
        return descripHW;
    }

    public void setDescripHW(String descripHW) {
        this.descripHW = descripHW;
    }

    public int getPonderacionHW() {
        return ponderacionHW;
    }

    public void setPonderacionHW(int ponderacionHW) {
        this.ponderacionHW = ponderacionHW;
    }

    public int getAverageHW() {
        return averageHW;
    }

    public void setAverageHW(int averageHW) {
        this.averageHW = averageHW;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }
    
    public void addStudentAndNote(Student estudiante, double nota){
        notaEstudiante.put(estudiante, nota);
        System.out.println("Se agrego nota al estudiante" + estudiante.getNameStudet() + nota);
    }
    
    public double getNotaTarea(Student estudiante){
        return notaEstudiante.getOrDefault(estudiante,-1.0);
    }

    public Student getEstudiante() {
        return estudiante;
    }

    public void setEstudiante(Student estudiante) {
        this.estudiante = estudiante;
    }
    
    
}

