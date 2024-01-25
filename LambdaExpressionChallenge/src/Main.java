import java.util.*;
import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {
//        String for random middle initial //        randomLetters to uppercase
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
//        List of alphabet
        List<String> randomLetters = new ArrayList<>(List.of(alphabet.split("")));
//      make all randomLetters upperCase and put " ." at front
        randomLetters.replaceAll(s -> "." + s.toUpperCase());
//      ***forEach print out random letters
        randomLetters.forEach(System.out::println);
//      List of firstNames
        List<String> firstNames = new ArrayList<>(List.of("aNNie", "BoB", "SUsaNne", "EMIly",
                "ToNY", "pHiL", "eVe"));
//      make all elements uppercase
        firstNames.replaceAll(String::toUpperCase);
//      ***forEach to print result of toUpperCase and "."
        firstNames.forEach(System.out::println);
//        Line separator for output
        System.out.println("-".repeat(30));
//        Randomize randomLetters to add as middle initial
        List<String> randomList = randomlySelectedValues(randomLetters);
//      ***forEach print randomList
        randomList.forEach(System.out::println);

//        reverse the firstNames for last firstNames
        List<String> lastNames = new ArrayList<>();
        System.out.println("-".repeat(30));
        for (var rev : firstNames) {
            StringBuilder s = new StringBuilder();
            s.append(rev);
            String lName = s.reverse().toString().toUpperCase();
            lastNames.add(lName);
            }
//      ***forEach print lastName
        lastNames.forEach(System.out::println);
        System.out.println("-".repeat(30));
//      put them all together --> firstName, randomList, lastName
        List<String> firstLastNames = buildFullName(firstNames, randomList, lastNames);
//      ***forEach print firstLastNames
        firstLastNames.forEach(System.out::println);
//      remove names where lastname == firstname --> Buchalka solution
        firstLastNames.removeIf(s -> s.substring(0, s.indexOf(" ")).equals(
                s.substring(s.lastIndexOf(" ") + 1)));
        /* the above code as a multi-line lambda expression:
        firstLastNames.removeIf(s -> {
            String first = s.substring(0, s.indexOf(" "));
            String last = s.substring(s.lastIndexOf(" ") + 1);
            return first.equals(last);
        });*/
        System.out.println("-".repeat(30));
        firstLastNames.forEach(System.out::println);



    }

    public static List<String> randomlySelectedValues(List<String> values) {
        Random randy = new Random();
        Collections.shuffle(values);
        return values;
    }

    public static List<String> buildFullName(List<String> list1, List<String> list2,
                                             List<String> list3) {
        List<String> firstLastName = new ArrayList<>();
        for (int i = 0; i < list1.size(); i++) {
            StringBuilder sb = new StringBuilder();
            sb.append(list1.get(i) + " ").append(list2.get(i) + " ").append(list3.get(i));
            firstLastName.add(sb.toString());
        }
        return firstLastName;
    }


}