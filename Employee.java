public class Employee {

    private String fullName;
    private String username;
    private String email;
    private String password;

    //Constructor

    public Employee(String fullName , String username , String email , String password){

        this.fullName = fullName;
        this.username = username;
        this.email = email;
        this.password = password;

    }

    //Getters

    public String getFullName() {
        return fullName;
    }

    public String getUsername() {
        return username;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    //Setters

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
}
