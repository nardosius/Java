import java.lang.reflect.Array;
import java.util.Arrays;

public class ArOne {

    public ArOne() {
        int[] myIntArray = new int[5];
        int[] anotherArray = myIntArray;

        System.out.println("myIntArray = " + Arrays.toString(myIntArray));
        System.out.println("anotherArray = " + Arrays.toString(anotherArray));

        anotherArray[0] = 1;
        modifyArray(myIntArray);

        System.out.println("after change myIntArray = " + Arrays.toString(myIntArray));
        System.out.println("after change anotherArray = " + Arrays.toString(anotherArray));

        printText("hello", "world", "again!");
        System.out.println("_".repeat(20));
    }

    private static void modifyArray (int[] array) {
        array[1] = 2;
    }

    private static void printText(String...textList){//can overload arguments w/o declaring array
        for (String t : textList) {
            System.out.println(t);
        }
    }
}
