public class Customer {

    private int AFM;
    private String fullName;
    private long number;
    private String email;

    //Constructor

    public Customer(int AFM , String fullName , long number , String email){

        this.AFM = AFM;
        this.fullName = fullName;
        this.number = number;
        this.email = email;

    }

    //Getters

    public int getAFM() {
        return AFM;
    }

    public String getFullName() {
        return fullName;
    }

    public long getNumber() {
        return number;
    }

    public String getEmail() {
        return email;
    }

    //Setters

    public void setAFM(int AFM) {
        this.AFM = AFM;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setNumber(long number) {
        this.number = number;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "AFM: " + AFM + " fullname: " + fullName + " Number: " + number + " email: " + email;
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj){
            return true;
        }

        if(!(obj instanceof Customer)){
            return false;
        }

        Customer cus = (Customer) obj;

        return cus.AFM == (this.AFM) || cus.email.equals(this.email) || cus.number == this.number;

    }

}
