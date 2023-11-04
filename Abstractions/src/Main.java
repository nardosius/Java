import java.util.ArrayList;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        // Press Shift+F10 or click the green arrow button in the gutter to run the code.
            // Press Shift+F9 to start debugging your code. We have set one breakpoint
            // for you, but you can always add more by pressing Ctrl+8.

        Dog dog = new Dog("Wolf", "big", 100);
        dog.makeNoise();
        doAnimalStuff(dog );

        ArrayList<Animal> animals = new ArrayList<>();
        animals.add(dog);
        animals.add(new Dog("German Shepard", "big", 150));
        animals.add(new Fish("Goldfish", "small", 1));
        animals.add(new Fish("Barracuda", "big", 75 ));
        animals.add(new Dog("Pug", "small", 20));
        animals.add(new Horse("Clydesdale", "large", 1000));
        // can now iterate over the list with a for (Object object) loop
        for (Animal animal : animals) {
            doAnimalStuff(animal);
            if (animal instanceof Mammal currentMammal) {//"currentMammal" is created var for instanceof Mammal
                currentMammal.shedHair();//can then call method shedHair on var currentMammal
            }
        }


    }

    private static void doAnimalStuff(Animal animal) {//notice use of abstract class as parameters

        animal.makeNoise();
        animal.move("slow");

    }
}