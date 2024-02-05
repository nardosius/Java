import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class Main {

    public static void main(String[] args) {
//        Function, Predicate and Consumer functions all come with built-in funx
        String name = "Tim";
        Function<String, String> uCase = String::toUpperCase;
//        apply is run on a base data type like String Integer or Double
        System.out.println(uCase.apply(name));
//      lastName is a funx which concatenates some string with "Buchalka"
        Function<String, String> lastName = s -> s.concat(" Buchalka");
        Function<String, String> uCaseLastName = uCase.andThen(lastName);
        System.out.println(uCaseLastName.apply(name));
//      compose runs the arg funx (lastName) and then executes the calling funx (uCase)
        uCaseLastName = uCase.compose(lastName);
        System.out.println(uCaseLastName.apply(name));
        /*uCase = uCaseLastName.compose(lastName);
        System.out.println(uCase.apply(name));*/
//      the ".andThen" method chains lambda expressions together
        Function<String, String[]> f0 = uCase
                .andThen(s -> s.concat(" Buchalka"))
                .andThen(s -> s.split(" "));
        System.out.println(Arrays.toString(f0.apply(name)));

        Function<String, String> f1 = uCase
                .andThen(s -> s.concat(" Buchalka"))
                .andThen(s -> s.split(" "))
                .andThen(s -> s[1].toUpperCase() + ", " + s[0]);
        System.out.println(f1.apply(name));

        Function<String, Integer> f2 = uCase
                .andThen(s -> s.concat(" Buchalka"))
                .andThen(s -> s.split(" "))
                .andThen(s -> String.join(", ", s))
                .andThen(String::length);
        System.out.println(f2.apply(name));
        /*With chained lambdas it does not matter what the beginning data type is
        * as long as the return type matches the second type parameter in the
        * Function<T, T> funx*/

        String[] names = {"Ann", "Bob", "Carol"};
        Consumer<String> s0 = s -> System.out.print(s.charAt(0));
        Consumer<String> s1 = System.out::println;
        Arrays.asList(names).forEach(s0
                .andThen(s -> System.out.print(" - "))
                .andThen(s1));
// Predicate funx return a Boolean
        Predicate<String> p1 = s -> s.equals("TIM");
        Predicate<String> p2 = s -> s.equalsIgnoreCase("TIM");
        Predicate<String> p3 = s -> s.startsWith("T");
        Predicate<String> p4 = s -> s.endsWith("e");
//        Now we can chain them with "or"
        Predicate<String> combined1 = p1.or(p2);
        System.out.println("combined1 = " + combined1.test(name));//"test" is boolean method

        Predicate<String> combined2 = p3.and(p4);
        System.out.println("combined2 = " + combined2.test(name));
        Predicate<String> combined3 = p3.and(p4).negate();//negate is like "!"
        System.out.println("combined3 = " + combined3.test(name));

        record Person(String firstName, String lastName) {

        }

        List<Person> list = new ArrayList<>(Arrays.asList(
                new Person("Peter", "Pan"),
                new Person("Peter", "Pumpkineater"),
                new Person("Minnie", "Mouse"),
                new Person("Mickey", "Mouse")
        ));

        list.sort(((o1, o2) -> o1.lastName.compareTo(o2.lastName)));//IntelliJ says use Comparator.comparing
        list.forEach(System.out::println);

        System.out.println("-".repeat(30));
        list.sort(Comparator.comparing(Person::lastName));//using Intellij's suggestion
        list.forEach(System.out::println);
//        can also chain comparator methods thusly:
        System.out.println("-".repeat(30));
        list.sort(Comparator.comparing(Person::lastName)
                .thenComparing(Person::firstName));
        list.forEach(System.out::println);
//        now to reverse
        System.out.println("-".repeat(30));
        list.sort(Comparator.comparing(Person::lastName)
                .thenComparing(Person::firstName).reversed());
        list.forEach(System.out::println);

    }
}