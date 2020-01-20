import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class TestRunWithLambda {
    public static void main(String[] args) {
        
        Comparator<Employee> emp = (o1,o2)->(o1.getSalary()>=o2.getSalary()?1:(o1.getSalary()<=o2.getSalary()?-1:0));
        
        ArrayList<Employee> allEmployees = Employee.getAllEmployees();
        
        System.out.println(allEmployees);
        Collections.sort(allEmployees,emp);
        System.out.println(allEmployees);
    }
}
