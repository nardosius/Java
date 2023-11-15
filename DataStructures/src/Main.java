import java.util.*;

record groceryItems(String name, String type, int count){

    public groceryItems(String name){
        this(name, "DAIRY", 1);
    }
}



public class Main {

    public static void main(String[] args) {
        /*Object[] groceryArray = new Object[3];//basic; groceryArray as a generic object
        groceryArray[0] = new groceryItems("milk");
        groceryArray[1] = new groceryItems("apple", "produce", 5);
        groceryArray[2] = "5 oranges";*/
        /*groceryItems[] groceryArray = new groceryItems[3];//object becomes type; can make array out of it
        groceryArray[0] = new groceryItems("milk");
        groceryArray[1] = new groceryItems("apple", "produce", 1);
        groceryArray[2] = new groceryItems("oranges", "produce", 5);
        System.out.println(Arrays.toString(groceryArray));

        ArrayList<groceryItems> groceryList = new ArrayList<>();
        groceryList.add(new groceryItems("cheese", "dairy", 2));
        groceryList.add(new groceryItems("grapes", "produce", 1));
        groceryList.add(new groceryItems("steak", "meats", 2));
        System.out.println(groceryList.toString());

        String[] items = {"milk", "eggs", "bacon", "bread"};//can place into a generic data structure
        List<String> itemList = List.of(items);//from generic List to.....
        ArrayList<String> list = new ArrayList<>(itemList);//more specific typed ArrayList
        ArrayList<String> nextList = new ArrayList<>(List.of("mustard", "ketchup", "pickles", "onions"));
        nextList.addAll(Arrays.asList("monkey", "rooster", "dog", "rat"));
        System.out.println();
        System.out.println(list.toString());
        nextList.sort(Comparator.naturalOrder());
        System.out.println(nextList.toString());*/

        ArListChallenge arListChallenge = new ArListChallenge();
        arListChallenge.menu();

    }
}