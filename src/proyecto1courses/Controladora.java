package proyecto1courses;

import java.util.ArrayList;

public class Controladora {
    
    public static ArrayList<Professor> profesoresArray = new ArrayList<>();
    public static ArrayList<Course> cursosArray = new ArrayList<>();
    public static ArrayList<Student> estudiantesArray = new ArrayList<>();
    


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
        
        estudiante.setCodeStudet(code);
        estudiante.setNameStudet(name);
        estudiante.setLastNameStudent(lastName);
        estudiante.setEmailStudent(email);
        estudiante.setGender(gender);
        estudiante.setPasswordStudent(password);
        
        estudiantesArray.add(estudiante);
    }
    
    public void deleteStudent(int indexStudent){
        
        estudiantesArray.remove(indexStudent);
                
    }
}
