package proyecto1courses;

public class Student {
    
    private String codeStudet;
    private String nameStudet;
    private String lastNameStudent;
    private String emailStudent;
    private String gender;

    public Student(){}
    
    public Student(String codeStudet, String nameStudet, String lastNameStudent, String emailStudent, String gender) {
        this.codeStudet = codeStudet;
        this.nameStudet = nameStudet;
        this.lastNameStudent = lastNameStudent;
        this.emailStudent = emailStudent;
        this.gender = gender;
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
    
    
    
}
