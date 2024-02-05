import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.*;

class PlainOld {
    private static int last_id = 1;
    private int id;

    public PlainOld() {
        id = PlainOld.last_id++;
        System.out.println("Creating a PlainOld object: id = " + id);
    }
}

public class Main {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>(List.of("Anna", "Bob", "Chuck", "Dave"));
        List<String> list2 = new ArrayList<>(List.of("Deke", "Kate", "Ryan", "Bev"));
        list.forEach(System.out::println);
//      Weird method reference with type reference
        calculator((s1, s2) -> s1.concat(s2), "Hello", "World");
//        Not really the same as below. Different process under hood
        calculator(String::concat, "Anna ", "Bob");
//        can also be written like this:
        calculator((a, b) -> a + b, "Anna ", "Bob");
        calculator(Integer::sum, 100, 350);
        calculator((a, b) -> a - b, 20, 10);
        calculator(Double::sum, 2.5, 3.7);
// Supplier takes no arguments and returns a new instance of the object
        Supplier<PlainOld> reference1 = PlainOld::new;
        PlainOld pojo = reference1.get();

        System.out.println("Getting array");
//        Will make 10 copies of the PlainOld object
        PlainOld[] pojo1 = seedArray(PlainOld::new, 10);

     /*   BinaryOperator on String ops:
        BinaryOperator<String> b1 = (s1, s2) -> s1.concat(s2);
        BiFunction<String, String, String> b2 = (s1, s2) -> s1.concat(s2);*/
        BinaryOperator<String> b1 = String::concat;
        BiFunction<String, String, String> b2 = String::concat;
        /*UnaryOperator<String> u1 = String::concat; --> cannot use b/c concat
        * requires 2 args. This only takes one. But a method which takes no
        * args like toUpperCase() can be applied*/
        UnaryOperator<String> u1 = String::toUpperCase;

        System.out.println(b1.apply("Hello ", "World"));
        System.out.println(b2.apply("Hello ", "World"));
        System.out.println(u1.apply("Hello"));

        String result = "Hello".transform(u1);
        System.out.println("Result = " + result);
        result = result.transform(String::toLowerCase);
        System.out.println("Result = " + result);

//        Here is a Function with String in and Boolean out:
        Function<String, Boolean> f0 = String::isEmpty;
        boolean resultBoolean = result.transform(f0);
        System.out.println("Result = " + resultBoolean);
    }

    private static <T> void calculator(BinaryOperator<T> function, T value1, T value2) {
        T result = function.apply(value1, value2);
        System.out.println("Result of operation: " + result);
    }
    private static PlainOld[] seedArray (Supplier<PlainOld> reference, int count) {
        PlainOld[] array = new PlainOld[count];
        Arrays.setAll(array, x -> reference.get());
        return array;
    }

}