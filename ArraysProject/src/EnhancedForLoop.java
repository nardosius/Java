import java.util.Arrays;

public class EnhancedForLoop {//can iterate through array without index numbers

    public EnhancedForLoop() {
        int[] someArray = new int[10];
        for (int i = 0; i < someArray.length; i++) {
            someArray[i] = i + 1;
        }

        for (int element : someArray) {
            System.out.print(element);
        }
        System.out.println(Arrays.toString(someArray));
        //assign an array to an object
        Object objectVariable = someArray;
        if (objectVariable instanceof int[]) {
            System.out.println("objectVariable is really an int array");
        }
        Object[] objectArray = new Object[3];
        objectArray[0] = "hello";
        objectArray[1] = new StringBuilder("World");
        objectArray[2] = someArray;
    }
}
