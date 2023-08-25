package proyecto1courses;

import java.util.ArrayList;

public class Controladora {
    
      
  
    
    public static ArrayList<Professor> profesoresArray = new ArrayList<>();
    
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
    
    public String getProfessorCode(int indexUpdate){
        
        String code = profesoresArray.get(indexUpdate).getCode();
        
        return code;
    }
    
}
