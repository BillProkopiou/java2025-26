public class Rental {

    private int rentalId;
    private Car car;
    private Customer customer;
    private String begin;
    private String expire;
    private Employee employee;

    //Constructor

    public Rental(int rentalId , Car car , Customer customer , String begin , String expire , Employee employee){
        this.rentalId = rentalId;
        car.setAvailability(false);
        this.car = car;
        this.customer = customer;
        this.begin = begin;
        this.expire = expire;
        this.employee = employee;
    }

    //Getters

    public int getRentalId() {
        return rentalId;
    }

    public Car getCar() {
        return car;
    }

    public Customer getCustomer() {
        return customer;
    }

    public String getBegin() {
        return begin;
    }

    public String getExpire() {
        return expire;
    }

    public Employee getEmployee() {
        return employee;
    }

    //Setters

    public void setRentalId(int rentalId) {
        this.rentalId = rentalId;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public void setBegin(String begin) {
        this.begin = begin;
    }

    public void setExpire(String expire) {
        this.expire = expire;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    @Override
    public int hashCode() {
        return rentalId;
    }
}
