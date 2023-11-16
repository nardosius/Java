// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        // Press Shift+F10 or click the green arrow button in the gutter to run the code.
        // Press Shift+F9 to start debugging your code. We have set one breakpoint
        // for you, but you can always add more by pressing Ctrl+8.
            letterFinder("breakfast", 'f');

    }
    public static void letterFinder(String word, Character match) {
        char[] wordArray = word.toCharArray();
        Boolean condition1 = word.length() > 2;

        if (condition1) {
            for (int i = 0; i < word.length(); i++) {
                if (wordArray[i] == match) {
                    System.out.println("Matched letter " + match + " at " + i);
                } else {
                    System.out.println("No match at i");}
            }
        } else {
            System.out.println("Please enter required arguments");
            System.out.println(word.getClass().getSimpleName());
            System.out.println(match.getClass().getSimpleName());
            System.out.println(word.length());
        }
        System.out.println(condition1);
    }
}