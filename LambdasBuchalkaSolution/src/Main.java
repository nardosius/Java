import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Main {
    private static Random random = new Random();

    public static void main(String[] args) {
        String[] names = {"Anna", "Bob", "Carole", "David", "Ed", "Fred", "Gary"};
        Arrays.setAll(names, i -> names[i].toUpperCase());//setAll ops on regular array
        System.out.println("--> Transform to Uppercase");
        System.out.println(Arrays.toString(names));

        List<String> backedByArray = Arrays.asList(names);
        backedByArray.replaceAll(s -> s + (" " + getRandomChar('A', 'Z') + "."));
        System.out.println("--> Add random middle initial");
        System.out.println(Arrays.toString(names));

        backedByArray.replaceAll(s -> s + " " + getReversedName(s.split(" ")[0]));
        System.out.println("--> Add reversed name as last name");
        Arrays.asList(names).forEach(System.out::println);
        //Arrays.asList allows List<> ops on regular array

        List<String> newList = new ArrayList<>(List.of(names));
//        This is the magic part. Remove any palindromes between first and last names
        /*newList.removeIf(s -> s.substring(0, s.indexOf(" ")).equals(
                s.substring(s.lastIndexOf(" ") + 1)));*/
//        previous code written as multi-line lambda:
        newList.removeIf(s -> {
            String first = s.substring(0, s.indexOf(" "));
            String last = s.substring(s.lastIndexOf(" ") + 1);
            return first.equals(last);
        });
        System.out.println("--> Remove palindromes of first and last names");
        newList.forEach(System.out::println);
    }

//Method to get random letters for middle initial
    public static char getRandomChar(char startChar, char endChar) {
        return (char) random.nextInt(startChar, (int) endChar + 1);
    }

    private static String getReversedName(String firstName) {
        return new StringBuilder(firstName).reverse().toString();
    }
}