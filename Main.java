import java.util.HashSet;

public class Main {

    public static void safeAdd(HashSet<Car> a , Car b){

        for(Car car : a){
            if(car.equals(b)){
                System.out.println("Error the car already exists!");
                return;
            }
        }

        a.add(b);

    }

    public static void main(String[] args) {

        HashSet<Car> cars = new HashSet<>();
        HashSet<Employee> employees = new HashSet<>();
        HashSet<Customer> customers = new HashSet<>();

        Car c1 = new Car(1 , "AN3225" , "Toyota" , "Gamato" , "Corolla" , 1970 , "Red" , true);
        Car c2 = new Car(1 , "AN3226" , "Toyota" , "Gamato" , "Corolla" , 1970 , "Red" , true);

        safeAdd(cars , c1);
        safeAdd(cars , c2);

        for(Car a :cars){
            System.out.println(a);
        }

        if(c1.equals(c2)){
            System.out.println("same");
        }

    }
}