import java.util.Random;

public class Student implements Comparable<Student> {

    private static int LAST_ID = 1000;

    private static Random random = new Random();
    String name;
    private int id;
    protected double gpa;

    public Student(String name) {
        this.name = name;
        id = LAST_ID++;
        gpa = random.nextDouble(1.0, 4.0);
    }

    @Override
    public String toString() {
        return "%d - %s (%.2f)".formatted(id, name, gpa);
    }

    //@Override
   // public int compareTo(Object o) {//must alter
       //Student other = (Student) o;//this casts a generic object as a Student object
        //return name.compareTo(other.name);//the "other" object can now access the "name" attribute to be returned in compareTo()
    //Buchalka discourages this approach due to potential conflicts involving String literals. Recommends implementing Comparable with a type parameter

    @Override
    public int compareTo(Student o) {
        return Integer.valueOf(id).compareTo(Integer.valueOf(o.id));
    }
}
/*@Override
    public int compareTo(Object o) {
        return 0;
    } This is the native method in Comparable. In most cases, it will need to be modified as above to handle the comparison
    operations required of the data type or object type in the class

    @Override
    public int compareTo(Student o) {
        return name.compareTo(o.name);
        This is another iteration of the compareTo() method without casting*/