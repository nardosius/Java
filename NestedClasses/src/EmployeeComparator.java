import java.util.Comparator;

public class EmployeeComparator <T extends Employee> implements Comparator<Employee> {
    @Override
    public int compare(Employee o1, Employee o2) {
        return o1.getName().compareTo(o2.getName());
      /*If you try to access a private field from here like Employee.yearStarted, you will get an error.
      If you don't want to use a getter for security reasons, you can create a nested class inside Employee*/
    }


}
