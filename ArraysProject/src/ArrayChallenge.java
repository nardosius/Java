import java.util.Arrays;
import java.util.Random;

public class ArrayChallenge {

    public ArrayChallenge() {
        int[] randomArray = new int[10];
        Random random = new Random();
        for (int i = 0; i < randomArray.length; i++) {
            randomArray[i] = random.nextInt(100);
        }
        int[] copyArray = Arrays.copyOf(randomArray, randomArray.length);
        Arrays.sort(copyArray);
        int[] receivingArray = new int[copyArray.length];

        for (int i = 0; i < copyArray.length; i++) {
            receivingArray[i] = copyArray[copyArray.length - (i + 1)];
        }
        System.out.println("Original array contents: " + Arrays.toString(randomArray));
        System.out.println();
        System.out.println("Array contents sorted in ascending order: " + Arrays.toString(copyArray));
        System.out.println();
        System.out.println("Array contents sorted in descending order: " + Arrays.toString(receivingArray));
    }
}
