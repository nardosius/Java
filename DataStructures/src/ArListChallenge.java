import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class ArListChallenge {
    private static Scanner scanner = new Scanner(System.in);
    private ArrayList<String> groceries = new ArrayList<>();
    public void menu() {
        boolean flag = true;
        while (flag) {
        printActions();
        switch (Integer.parseInt(scanner.nextLine())) {
            case 1 -> addItems(groceries);
            case 2 -> removeItems(groceries);
            case 3 -> printList(groceries);
            default -> flag = false;
        }
        }
    }
    private void printGroceries() {
        groceries.sort(Comparator.naturalOrder());
        System.out.println(groceries);
    }
    private static void addItems(ArrayList<String> groceries) {
        System.out.println("Add item(s) [separate by comma]:");
        String[] items = scanner.nextLine().split(",");
        for (String i : items) {
            String trimmed = i.trim();
            if (!groceries.contains(trimmed)) {
                groceries.add(trimmed);
            }
        }
    }

    private static void removeItems(ArrayList<String> groceries) {
        System.out.println("Remove item(s) [separate by comma]:");
        String[] items = scanner.nextLine().split(",");
        for (String i : items) {
            String trimmed = i.trim();
            groceries.remove(trimmed);
        }
    }

    private static void printList(ArrayList<String> groceries) {
        StringBuilder basketList = new StringBuilder();
        for (String i: groceries) {
            basketList.append(i + ", ");
        }
        System.out.println("Your current basket: " + basketList);
    }

    private static void printActions() {
        String textBlock = """
                Available actions:
                                
                0 - to shutdown
                                
                1 - to add item(s) to list (comma delimited list)
                                
                2 - to remove any items (comma delimited list)
                
                3 - print a current list of items
                                
                Enter a number for which action you want to do:""";
        System.out.print(textBlock + " ");
    }
}
