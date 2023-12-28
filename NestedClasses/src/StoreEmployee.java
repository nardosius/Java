import java.util.Comparator;

public class StoreEmployee extends Employee {

    private String store;

public StoreEmployee() {

}

    public StoreEmployee(int employeeID, String name, int yearStarted, String store) {
        super(employeeID, name, yearStarted);
        this.store = store;
    }

    @Override
    public String toString() {
        return "%-8s%s".formatted(store, super.toString());
    }

    public class StoreComparator<T extends StoreEmployee> implements Comparator<StoreEmployee> {
//The inner class comparator to be run in Main. Access to the inner class must be accomplished through
//instantiation of the StoreEmployee object and then equating the comparator to an invocation of the inner
//like this: e.g., var genericEmployee = new StoreEmployee;
//        var comparator = genericEmployee.new StoreComparator<>();
        @Override
        public int compare(StoreEmployee o1, StoreEmployee o2) {
            int result = o1.store.compareTo(o2.store);
            if (result == 0) {//when object comparison = 0, they are equal
                return new Employee.EmployeeComparator<>("yearStarted").compare(o1,o2);
            }
            return result;
        }
    }
}
/*Any time you build a comparator class, understand that it implements the interface Comparator. You
* must implement, at a minimum, the compare() method. Please take note of the structure and syntax
* of the above displayed overridden compare() method*/