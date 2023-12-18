import java.util.Comparator;

public class StudentGPAComparator implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        return (o2.gpa + o2.name).compareTo(o1.gpa + o1.name);
//        will sort students by GPS from highest to lowest
//        reverse in order to sort from lowest to highest
    }
}
