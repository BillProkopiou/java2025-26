import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Car> cars = new ArrayList<>();
        ArrayList<Employee> employees = new ArrayList<>();
        ArrayList<Customer> customers = new ArrayList<>();

        Car c1 = new Car(1 , "PN3225" , "Toyota" , "Gamato" , "Corolla" , 1970 , "Red" , true);
        Car c2 = new Car(5 , "MK9983" , "Toyota" , "Gamato" , "Corolla" , 1970 , "Red" , true);
        Car c3 = new Car(3 , "AU7632" , "Nissan" , "4WD" , "Mikra" , 2020 , "White" , true);
        Car c4 = new Car(4 , "BL0093" , "Toyota" , "4WD" , "Hilux" , 2000 , "Gray" , true);
        Employee e1 = new Employee("Xrhstos Nikolaros" , "Trobas" , "ilovemath@gmail.com" , "myTipCreamy34");

        Car.safeAddCar(cars , c1);
        Car.safeAddCar(cars , c2);
        Car.safeAddCar(cars , c3);
        Car.safeAddCar(cars , c4);

        for(Car a :cars){
            System.out.println(a);
        }

        CarSorter.sortByAvailability(cars);

        System.out.println();

        for(Car a : cars){
            System.out.println(a);
        }

        if(c1.equals(c2)){
            System.out.println("same");
        }

    }
}