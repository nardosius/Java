import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

record Employee(String firstname, String lastName, String hireDate) {

    public String empToString() {
        return firstname + ", " + lastName + " " + hireDate;
    }

}
public class Main {

    public static void main(String[] args) {

        List<Employee> empList = new ArrayList<>(List.of(new Employee("Ben", "Stiller", "01/02/2015"),
                new Employee("Dirk", "Diggler", "05/08/2000"),
                new Employee("Cameron", "Diaz", "11/02/2013"),
                new Employee("Salma", "Hayek", "23/07/2020")));
//Could also have broken down emps as vars, e.g. e1, e2, e3, etc. and used List<Employee> list = new ArrayList<>(Arrays.asList(e1, e2, e3));
        empInfo(empList, "name");
        System.out.println();
        empInfo(empList, "year");//sortField could be anything because of toString if statement

    }
    public static void empInfo(List<Employee> list, String sortField) {
                int currentYear = LocalDate.now().getYear();

                class MyEmployee {
                    Employee containedEmployee;
                    int yearsWorked;
                    String fullName;

                    public MyEmployee(Employee containedEmployee) {
                        this.containedEmployee = containedEmployee;
                        yearsWorked = currentYear - Integer.parseInt(containedEmployee.hireDate().split("/")[2]);
                        fullName = String.join(" ", containedEmployee.firstname(), containedEmployee.lastName());
                    }

                    @Override
                    public String toString() {
                        return "%s has been an employee for %d years".formatted(fullName, yearsWorked);
                    }
                }
        //                    create list for MyEmployee (populated from List<Employee> list)
        List<MyEmployee> list1 = new ArrayList<>();
                for (Employee employee : list) {
                    list1.add(new MyEmployee(employee));
                }
                var comparator = new Comparator<MyEmployee>() {

                    @Override
                    public int compare(MyEmployee o1, MyEmployee o2) {
                        if (sortField.equals("name")) {
                            return o1.fullName.compareTo(o2.fullName);
                        }
                        return o1.yearsWorked - o2.yearsWorked;
                    }
                };
                //now run sort()
        list1.sort(comparator);
        for (MyEmployee myEmployee : list1) {
            System.out.println(myEmployee);
        }
    }
}