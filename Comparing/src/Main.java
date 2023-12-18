import java.util.Arrays;
import java.util.Comparator;

public class Main {

    public static void main(String[] args) {
//An exploration of the Comparable interface
        Integer five = 5;
        Integer[] others = {0, 5, 10, -50, 50};

        for (Integer i : others) {
            int val = five.compareTo(i);
            System.out.printf("%d %s %d: compareTo=%d%n", five, (val == 0 ? "==" : (val < 0) ? "<" : ">"), i, val);
        }
        String banana = "banana";
        String[] fruit = {"apple", "banana", "pear", "BANANA"};

        for (String s : fruit) {
            int val = banana.compareTo(s);//val comes back as 0, 1 or -1
            System.out.printf("%s %s %s: compareTo=%d%n", banana, (val == 0 ? "==" : (val > 0) ? "<" : ">"), s, val);
        }
        Arrays.sort(fruit);
        System.out.println(Arrays.toString(fruit));
/*The comparisons below compare the strings of the characters with the single characters themselves the integer values of these can
be added or subtracted to produce the following output:
banana < apple: compareTo=1
banana == banana: compareTo=0
banana > pear: compareTo=-14
banana < BANANA: compareTo=32

[BANANA, apple, banana, pear]
A:65 a:97
B:66 b:98
P:80 p:112*/

        System.out.println("A:" + (int)'A' + " " + "a:"+(int)'a');
        System.out.println("B:" + (int)'B' + " " + "b:"+(int)'b');
        System.out.println("P:" + (int)'P' + " " + "p:"+(int)'p');

        Student tim = new Student("Tim");
        Student[] students = {new Student("Zach"), new Student("Alexa"), new Student("Tim"), new Student("Ann")};
//        The practice of turning a class into an array makes sense: String[], Integer[], Double[], etc.

        Arrays.sort(students);//cannot use without implementing Comparable on the Student class
        System.out.println(Arrays.toString(students));
        System.out.println("result = " + tim.compareTo(new Student("TIM")));

        Comparator<Student> gpaSorter = new StudentGPAComparator();
        Arrays.sort(students, gpaSorter.reversed());//can reverse sort order
        System.out.println(Arrays.toString(students));

    }
}