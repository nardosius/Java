import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>(List.of("alpha", "bravo",
                "charlie", "delta"));
//        regular enhanced for loop
        for (String s : list) {
            System.out.println(s);
        }
//      forEach method using lambda
        System.out.println("-------");
        list.forEach((s) -> System.out.println(s));
        list.addAll(List.of("echo", "easy", "earnest"));
        list.forEach((s) -> System.out.println(s));
//      now, with multiple statements
        System.out.println("-------");
        String prefix = "nato";
        list.forEach((var myString) -> {
            char first = myString.charAt(0);
            System.out.println(prefix + " " + myString + " means " + first);
        });
        System.out.println("-------");
        list.removeIf(s -> s.startsWith("ea"));
        list.forEach(s -> System.out.println(s));
        list.replaceAll(s -> s.charAt(0) + " - " + s.toUpperCase());
        System.out.println("-------");
        list.forEach(System.out::println);//reference method. "s" is inferred
        System.out.println("-------");

        String[] emptyString = new String[10];
        System.out.println(Arrays.toString(emptyString));
        Arrays.fill(emptyString, "");
        System.out.println(Arrays.toString(emptyString));
        Arrays.setAll(emptyString, (i) -> "" + (i + 1) + ". ");
        System.out.println(Arrays.toString(emptyString));

        Arrays.setAll(emptyString, (i) -> "" + (i + 1) + ". "
        + switch (i) {//switch statement inside lambda expression --> siiiick!
            case 0 -> "one";
            case 1 -> "two";
            case 2 -> "three";
            default -> "";
        });
        System.out.println(Arrays.toString(emptyString));

        String[] names = {"Ann", "Bob", "Carol", "David", "Ed", "Fred"};
        String[] randomList = randomlySelectedValues(15, names,
                () -> new Random().nextInt(0, names.length));
        System.out.println(Arrays.toString(randomList));

        double output = calculator((a, b) -> a * b, 4, 5);
        int result = calculator(Integer::sum, 5, 2);//reference method
        int result3 = calculator((a,b) -> a + b, 5, 2);//lambda method
        var result1 = calculator((a,b) -> a + b, "Hello ", "World!");
        var result2 = calculator((a,b) -> a / b, 10.0, 2.5);
//        can use a return statement inside {} after ->, but not sure why
        System.out.println("-------");
//        Now, a list of arrays to demo the BiConsumer Interface:
        var coords = Arrays.asList(//2-element arrays created for conventional method
                new double[]{47.2160, -95.2348},
                new double[]{29.1566, -89.2495},
                new double[]{35.1566, -90.0659}
        );
        coords.forEach(s -> System.out.println(Arrays.toString(s)));
//        lambda expression can be assigned to a local variable
        BiConsumer<Double, Double> p1 = (lat, lng) ->//ID data types inside "<>"
                System.out.printf("[lat:%.3f lon:%.3f]%n", lat, lng);
        var firstPoint = coords.getFirst();
        processPoint(firstPoint[0], firstPoint[1], p1);//1 coordinate pair
        System.out.println("-------");
        coords.forEach(s -> processPoint(s[0], s[1], p1));//all coordinate pairs
    }
    public static <T> T calculator(BinaryOperator<T> function, T value1, T value2) {
        T result = function.apply(value1, value2);
        System.out.println("Result of operation: " + result);
        return result;
        /*notice the use of "T" before variables and casting of data types
        * BinaryOperator is a built-in interface and does the same thing as
        * the Operation interface. There are over 40 interfaces in java.util.
        * It's a good idea to learn the 4 basic types:
        * 1) Consumer ---> Consumer takes one parameter type, BiConsumer takes 2
        * 2) Function ---> applies function to return a result
        * 3) Predicate ---> Takes one or two params and returns boolean
        * 4) Supplier ---> takes no args but returns instance of type T
          */
    }

    public static <T> void processPoint(T t1, T t2, BiConsumer<T, T> consumer) {
        consumer.accept(t1, t2);
    }

    public static String[] randomlySelectedValues(int count, String[] values,
                                                  Supplier<Integer> s) {
        String[] selectedValues = new String[count];
        for (int i = 0; i < count; i++) {
            selectedValues[i] = values[s.get()];
        }
        return selectedValues;
    }
}