package proyecto1courses;

public class User {
    String code;
    String name;
    String lastName;
    String email;
    String gender;
    
    public User(String code, String name, String lastName, String email, String gender){
        this.code = code;
        this.name = name;
        this.lastName = lastName;
        this.email = email;
        this.gender = gender;
    
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
    
}
