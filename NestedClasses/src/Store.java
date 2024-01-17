import java.util.Comparator;
import java.util.List;

public class Store {

    /*This class used a main method in the Udemy course. My habit is to have only one
    * main method per project package. In reality this can easily be accomplished form
    * the existing main method:
    * public staic void main (String[] args) {
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

}
