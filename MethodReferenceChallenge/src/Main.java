import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.function.Function;

public class Main {
    private static Random random = new Random();

    public static void main(String[] args) {

        String[] names1 = {"aNnA", "DAve", "jOhN", "CAroLe",
                "stEVen", "jUDIth"};
        List<String> names2 = Arrays.asList(names1);
        namesToUpperCase(names2);
        printArray(names2);
        System.out.println("-".repeat(30));
        addMiddleInitial(names2);
        printArray(names2);
        List<String> lastNames = addLastName(names2);
        System.out.println("-".repeat(30));
        printArray(lastNames);
        System.out.println("-".repeat(30));
        List<String> firstAndLastNames = firstAndLastNames(names2, lastNames);
        printArray(firstAndLastNames);


    }

    private static String transformations(List<String> list, Function funx) {

        return list.toString();
    }
    private static List<String> namesToUpperCase(List<String> list) {
        list.replaceAll(String::toUpperCase);
        return list;
    }

    private static List<String> addMiddleInitial(List<String> list) {
        list.replaceAll(s -> s + (" " + getRandomChar('A', 'Z') + "."));
        return new ArrayList<>();
    }

    private static List<String> addLastName(List<String> list) {
        List<String> lastName = new ArrayList<>();
        for (String s : list) {
            String n = (s.substring(0, s.indexOf(" ")));
            n = getReversedName(n);
            lastName.add(n);
        }
        return lastName;
    }

    private static List<String> firstAndLastNames(List<String> list1,
                                                  List<String> list2) {

        List<String> faln = new ArrayList<>();
        int i = 0;
        for (String s : list1) {
            s = s + " " + list2.get(i);
            i++;
            faln.add(s);
        }
        return faln;
    }

    private static String getReversedName(String firstName) {
        return new StringBuilder(firstName).reverse().toString();
    }

    private static void printArray(List<String> list) {
        for (String s : list) {
            System.out.println(s);
        }
    }

    public static char getRandomChar(char startChar, char endChar) {
        return (char) random.nextInt(startChar, (int) endChar + 1);
    }
}