package proyecto1courses;

import java.io.File;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import persistencia.ControladoraPersistencia;

public class Controladora {
    
    public static ArrayList<Professor> profesoresArray = new ArrayList<>();
    public static ArrayList<Course> cursosArray = new ArrayList<>();
    public static ArrayList<Student> estudiantesArray = new ArrayList<>();
    


    public void addProfessor(String code, String name, String lastName, String email, String passWord, String gender) {
        
         Professor profesor = new Professor();
        if (profesoresArray.size() <50) {

            profesor.setCode(code);
            profesor.setName(name);
            profesor.setLastName(lastName);
            profesor.setEmail(email);
            profesor.setPassWord(passWord);
            profesor.setGender(gender);

            profesoresArray.add(profesor);
            
        }else{
            JOptionPane.showMessageDialog(null, "Se ha excedido de limete de profesores");
        }
        
                
    }
    
    public void addCourseToProfessor(int indexProfesor, int indexCourse){
        profesoresArray.get(indexProfesor).addCoursetoProf(cursosArray.get(indexCourse));
        System.out.println("Se ha agregado curso");
        System.out.println( profesoresArray.get(indexProfesor).getName() + " " +
                profesoresArray.get(indexProfesor).getCursosProfArray().get(indexCourse).getNameCourse());
    }
    
    public void deleteProfessor(int indexDelete){
        
        profesoresArray.remove(indexDelete);
  
    }
    
    public void deleteCourse(int indexDelete){
        
        cursosArray.remove(indexDelete);
    }
    
    public String getProfessorCode(int indexUpdate){
        
        String code = profesoresArray.get(indexUpdate).getCode();
        
        return code;
    }
    
    public void addCourse(String code, String name, int credit, Professor profesor){
        Course curso = new Course();
        
        curso.setCodeCourse(code);
        curso.setNameCourse(name);
        curso.setCredits(credit);
        curso.setProfesor(profesor);
        
        cursosArray.add(curso);
        
    }
    
    public String getCourseCode(int indexUpdate){
        String code = cursosArray.get(indexUpdate).getCodeCourse();
        return code;
    }
    
    public void addStudent(String code, String name, String lastName, String email, String gender, String password){
        Student estudiante = new Student();
        
        if (estudiantesArray.size() <300) {
            estudiante.setCodeStudet(code);
            estudiante.setNameStudet(name);
            estudiante.setLastNameStudent(lastName);
            estudiante.setEmailStudent(email);
            estudiante.setGender(gender);
            estudiante.setPasswordStudent(password);

            estudiantesArray.add(estudiante);
            
        }else{
            JOptionPane.showMessageDialog(null, "Se ha excedido el limite de alumnos");
        }
    }
    
    public void deleteStudent(int indexStudent){
        
        estudiantesArray.remove(indexStudent);
                
    }
    
    public void saveData() {
        ControladoraPersistencia.serializarObjeto("profesores.Dat", profesoresArray);
        ControladoraPersistencia.serializarObjeto("cursos.Dat", cursosArray);
        ControladoraPersistencia.serializarObjeto("estudiantes.Dat", estudiantesArray);
    }

    public void loadData() {
        File profesoresFile = new File("profesores.Dat");
        if (profesoresFile.exists()) {
            profesoresArray = ControladoraPersistencia.deserializarObjeto("profesores.Dat", ArrayList.class);
        }

        File cursosFile = new File("cursos.Dat");
        if (cursosFile.exists()) {
            cursosArray = ControladoraPersistencia.deserializarObjeto("cursos.Dat", ArrayList.class);
        }

        File estudiantesFile = new File("estudiantes.Dat");
        if (estudiantesFile.exists()) {
            estudiantesArray = ControladoraPersistencia.deserializarObjeto("estudiantes.Dat", ArrayList.class);
        }
    }

}
