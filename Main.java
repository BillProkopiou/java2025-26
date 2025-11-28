import java.util.ArrayList;
import java.util.HashSet;

public class Main {

    public static void safeAdd(ArrayList<Car> a , Car b){

        for(Car car : a){
            if(car.equals(b)){
                System.out.println("Error the car already exists!");
                return;
            }
        }

        a.add(b);

    }

    public static void main(String[] args) {

        ArrayList<Car> cars = new ArrayList<>();
        HashSet<Employee> employees = new HashSet<>();
        HashSet<Customer> customers = new HashSet<>();

        Car c1 = new Car(1 , "AN3225" , "Toyota" , "Gamato" , "Corolla" , 1970 , "Red" , true);
        Car c2 = new Car(2 , "AK9983" , "Toyota" , "Gamato" , "Corolla" , 1970 , "Red" , true);
        Car c3 = new Car(3 , "BU7632" , "Nissan" , "4WD" , "Mikra" , 2020 , "White" , true);
        Car c4 = new Car(4 , "KL0093" , "Toyota" , "4WD" , "Hilux" , 2000 , "Gray" , true);

        safeAdd(cars , c1);
        safeAdd(cars , c2);
        safeAdd(cars , c3);
        safeAdd(cars , c4);

        for(Car a :cars){
            System.out.println(a);
        }

        if(c1.equals(c2)){
            System.out.println("same");
        }

    }
}