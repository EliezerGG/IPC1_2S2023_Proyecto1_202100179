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
        profesores[indexProfessor] = profesor;
        indexProfessor++;
        
    }
    
    public void deleteProfessor(int indexDelete){
        
        profesoresArray.remove(indexDelete);
         
        if (indexDelete >= 0 && indexDelete < profesores.length) {
            for (int i = indexDelete; i < profesores.length -1; i++) {
                profesores[i] = profesores[i+1];
            }
            
            profesores[profesores.length-1] = null;
           
        }else{
            System.out.println("Indice fuera de los limites de la matriz");
        }
        
        
    }
    
    public String getProfessorCode(int indexUpdate){
        
        String code = profesoresArray.get(indexUpdate).getCode();
        
        return code;
    }
    
}
