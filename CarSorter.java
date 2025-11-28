import java.util.ArrayList;
import java.util.Comparator;

public class CarSorter {

    public static void sortById(ArrayList<Car> cars) {
        cars.sort(Comparator.comparingInt(Car::getId));
    }

    public static void sortByPlate(ArrayList<Car> cars) {
        cars.sort(Comparator.comparing(Car::getPlate));
    }

    public static void sortByBrand(ArrayList<Car> cars) {
        cars.sort(Comparator.comparing(Car::getBrand));
    }

    public static void sortByType(ArrayList<Car> cars){
        cars.sort(Comparator.comparing(Car::getType));
    }

    public static void sortByModel(ArrayList<Car> cars){
        cars.sort(Comparator.comparing(Car::getModel));
    }

    public static void sortByYear(ArrayList<Car> cars) {
        cars.sort(Comparator.comparingInt(Car::getYear));
    }

    public static void sortByColour(ArrayList<Car> cars){
        cars.sort(Comparator.comparing(Car::getColour));
    }

    public static void sortByAvailability(ArrayList<Car> cars){
        cars.sort(Comparator.comparing(Car::isAvailable).reversed());
    }

}
