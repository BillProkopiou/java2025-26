public class Car{

    private int id;
    private String plate;
    private String brand;
    private String type;
    private String model;
    private int year;
    private String colour;
    private boolean availability;

    //Constructor

    public Car(int id , String plate , String brand , String type , String model , int year , String colour , boolean availability){

        this.id = id;
        this.plate = plate;
        this.brand = brand;
        this.type = type;
        this.model = model;
        this.year = year;
        this.colour = colour;
        this.availability = availability;

    }

    //Getters

    public int getId() {
        return id;
    }

    public String getPlate() {
        return plate;
    }

    public String getBrand(){
        return brand;
    }

    public String getType() {
        return type;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public String getColour() {
        return colour;
    }

    public boolean isAvailable() {
        return availability;
    }

    //Setters

    public void setId(int id) {
        this.id = id;
    }

    public void setPlate(String plate) {
        this.plate = plate;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public void setAvailability(boolean availability) {
        this.availability = availability;
    }

    @Override
    public String toString() {
        return ("id: " + id + " plate: " + plate + " brand: " + brand + " type: " + type + " model: " + model + " Year: " + year + " colour: " + colour + " availability: " + availability);
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj){
            return true;
        }

        if(!(obj instanceof Car)){
            return false;
        }
        Car car = (Car) obj;
        return car.getId() == id || car.getPlate().equals(this.plate);
    }

}
