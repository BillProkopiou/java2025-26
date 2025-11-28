import java.util.ArrayList;
import java.util.Comparator;

public class CustomerSorter {

    public static void safeAddCustomer(ArrayList<Customer> a , Customer b){

        for(Customer cus : a){
            if(cus.equals(b)){
                System.out.println("Error this customer has come here before!");
                return;
            }
        }

        a.add(b);

    }

    public static void sortByFullName(ArrayList<Customer> cus){
        cus.sort(Comparator.comparing(Customer::getFullName));
    }

    public static void sortByEmail(ArrayList<Customer> cus){
        cus.sort(Comparator.comparing(Customer::getEmail));
    }

    public static void sortByNumber(ArrayList<Customer> cus){
        cus.sort(Comparator.comparingLong(Customer::getNumber));
    }

    public static void sortByAFM(ArrayList<Customer> cus){
        cus.sort(Comparator.comparingInt(Customer::getAFM));
    }

}
