public class Customer {

    private int AFM;
    private String fullName;
    private int number;
    private String email;

    public Customer(int AFM , String fullName , int number , String email){

        this.AFM = AFM;
        this.fullName = fullName;
        this.number = number;
        this.email = email;

    }
//:)
    public int getAFM() {
        return AFM;
    }

    public String getFullName() {
        return fullName;
    }

    public int getNumber() {
        return number;
    }

    public String getEmail() {
        return email;
    }

    public void setAFM(int AFM) {
        this.AFM = AFM;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}
