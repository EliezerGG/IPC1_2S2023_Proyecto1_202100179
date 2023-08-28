package proyecto1courses;

import java.util.ArrayList;

public class Professor {
    
    private String code;
    private String name;
    private String lastName;
    private String email;
    private String passWord;
    private String gender; 
    private ArrayList<Course> cursosProfArray = new ArrayList<>();
    public Professor(){};

    public Professor(String code, String name, String lastName, String email, String passWord, String gender) {
        this.code = code;
        this.name = name;
        this.lastName = lastName;
        this.email = email;
        this.passWord = passWord;
        this.gender = gender;
    }
    
    public Professor(ArrayList cursosProfArray){
        this.cursosProfArray = cursosProfArray;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

   
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public ArrayList<Course> getCursosProfArray() {
        return cursosProfArray;
    }

    public void setCursosProfArray(ArrayList<Course> cursosProfArray) {
        this.cursosProfArray = cursosProfArray;
    }
    
    
    
}
