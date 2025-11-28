import java.util.ArrayList;
import java.util.Comparator;

public class EmployeeSorter {

    public static void safeAddEmployee(ArrayList<Employee> a , Employee b){

        for(Employee emp : a){
            if(emp.equals(b)){
                System.out.println("Error this employee already has an account!");
                return;
            }
        }

        a.add(b);

    }

    public static void sortByUsername(ArrayList<Employee> emp){
        emp.sort(Comparator.comparing(Employee::getUsername));
    }

    public static void sortByFullName(ArrayList<Employee> emp){
        emp.sort(Comparator.comparing(Employee::getFullName));
    }

    public static void sortByEmail(ArrayList<Employee> emp){
        emp.sort(Comparator.comparing(Employee::getEmail));
    }

}
