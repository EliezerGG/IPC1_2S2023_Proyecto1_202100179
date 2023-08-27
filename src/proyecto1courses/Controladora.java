package proyecto1courses;

import java.util.ArrayList;

public class Controladora {
    
    public static ArrayList<Professor> profesoresArray = new ArrayList<>();
    public static ArrayList<Course> cursosArray = new ArrayList<>();
    
    static int indexProfessor = 0;

    public void addProfessor(String code, String name, String lastName, String email, String passWord, String gender) {
        
        Professor profesor = new Professor();
 
        profesor.setCode(code);
        profesor.setName(name);
        profesor.setLastName(lastName);
        profesor.setEmail(email);
        profesor.setPassWord(passWord);
        profesor.setGender(gender);
       
        profesoresArray.add(profesor);
        
        
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
}
