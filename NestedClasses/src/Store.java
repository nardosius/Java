import java.util.Comparator;
import java.util.List;

public class Store {

    /*This class used a main method in the Udemy course. My habit is to have only one
    * main method per project package. In reality this can easily be accomplished form
    * the existing main method:
    * public static void main (String[] args) {
    * Meal regularMeal = new Meal();\
    * System.out.println(regularMeal);
    *  the following is a generic comparator method:*/
    public static <T> void  sortIt(List<T> list, Comparator<? super T> comparator) {
        System.out.println("Sorting with Comparator: " + comparator.toString());
        list.sort(comparator);
        for (var employee : list) {
            System.out.println(employee);
        }
    }
    /*Since the introduction of lambda expressions, anonymous classes have become legacy code. It is unlikely that you will write any new code
    * using anonymous classes. Below is an example of what they look like in case such syntax is ever encountered:
    *
    * var anon = new Comparator<StoreEmployee>() { the interface requires the implementation of methods
    *       @Override
    * public int compare(StoreEmployee o1, StoreEmployee o2) {
    * return o1.getName().compareTo(o2.getName());
    * the comparator function is contained inside anon. If the variable is made private, it's inner workings will be unknown to the rest of the
    * program.
    * }*/

}
