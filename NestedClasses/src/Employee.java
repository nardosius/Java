import java.util.Comparator;

public class Employee {

    private int employeeID;
    private String name;
    private int yearStarted;


    public Employee() {

    }
    public Employee(int employeeID, String name, int yearStarted) {
        this.employeeID = employeeID;
        this.name = name;
        this.yearStarted = yearStarted;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "%d %-8s %d".formatted(employeeID, name, yearStarted);
    }

    public static class EmployeeComparator <T extends Employee> implements Comparator<Employee> {

        private String sortType;

        public EmployeeComparator() {
            this("name");
        }

        public EmployeeComparator(String sortType) {
            this.sortType = sortType;
        }

        @Override
        public int compare(Employee o1, Employee o2) {
            if (sortType.equalsIgnoreCase("yearStarted")) {
                return o1.yearStarted - o2.yearStarted;
            }
            return o1.name.compareTo(o2.name);
      /*If you try to access a private field from here like Employee.yearStarted, you will get an error.
      If you don't want to use a getter for security reasons, you can create a nested class inside Employee*/
        }
    }
}
