import java.util.Arrays;
import java.util.Random;

public class ArrayMethods {
int[] firstArray = getRandomArray(10);
int[] secondArray = new int[10];
int[] thirdArray = getRandomArray(10);
int[] fourthArray = Arrays.copyOf(thirdArray, thirdArray.length);

    public ArrayMethods() {
        System.out.println(Arrays.toString(firstArray));
        Arrays.sort(firstArray);
        System.out.println(Arrays.toString(firstArray));
        System.out.println();
        System.out.println(Arrays.toString(secondArray));
        Arrays.fill(secondArray, 5);
        System.out.println(Arrays.toString(secondArray));
        System.out.println();
        System.out.println(Arrays.toString(thirdArray));
        System.out.println();
        System.out.println(Arrays.toString(fourthArray));
        Arrays.sort(fourthArray);
        System.out.println(Arrays.toString(thirdArray));
        System.out.println(Arrays.toString(fourthArray));

    }
    private static int[] getRandomArray(int len) {
        Random random = new Random();
        int[] newInt = new int[len];
        for (int i = 0; i < len; i++){
            newInt[i] = random.nextInt(200);
        }
        return newInt;
    }
}
