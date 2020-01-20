import java.util.ArrayList;
import java.util.Collections;

public class TestRunWithoutLambda {
   
    public static void main(String[] args) {
        EmployeeRanker emp = new EmployeeRanker();
        ArrayList<Employee> allEmployees = Employee.getAllEmployees();
        
        System.out.println(allEmployees);
        Collections.sort(allEmployees,emp);
        System.out.println(allEmployees);
    }

}
