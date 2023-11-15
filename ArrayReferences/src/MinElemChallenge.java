import java.util.Arrays;
import java.util.Scanner;

public class MinElemChallenge {
       public MinElemChallenge() {
          int minimum = findMin(readIntegers());
          System.out.println("The minimum number in the array is: " + minimum);
          System.out.println();



    }
    private static int[] readIntegers() {
        System.out.println("Please enter numbers separated by commas, e.g. 47,52,1,85, etc.");
        Scanner scanner = new Scanner(System.in);
        String temp = scanner.nextLine();
        String[] out = temp.split(",");
        int[] nums = new int[out.length];
        for (int i = 0; i < out.length; i++) {
            nums[i] = Integer.parseInt(out[i].trim());
        }
        System.out.println(Arrays.toString(nums));
        int[] copyArray = Arrays.copyOf(nums, nums.length);
        System.out.println();
        reverse2(copyArray);
        return nums;
    }

    private static int findMin(int[] array) {
        Arrays.sort(array);
        int minimum = array[0];
        return minimum;
    }

    private static void reverse(int[] array) {
        System.out.println("Array before reversing: " + Arrays.toString(array));
        int[] copied = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            copied[i] = array[array.length - (i + 1)];
            System.out.println("---> " + copied[i]);
        }
        System.out.println();
        System.out.println("Array after reversing: " + Arrays.toString(copied));
    }

    private static void reverse2(int[] array) {//Buchalka's method - much better
           int maxIndex = array.length - 1;//ID the highest index number of the array
           int halfLength = array.length / 2;//number of iterations for swapping the values
        System.out.println("Array before reversing: " + Arrays.toString(array));

           for (int i = 0; i < halfLength; i++) {
               int temp = array[i];//store value of current index in temp var
               array[i] = array[maxIndex - i];//reset current index to last index
               array[maxIndex - i] = temp;//move the last index in temp to move to lower index
               System.out.println("---> " + Arrays.toString(array));
           }
        System.out.println("Array after reversing: " + Arrays.toString(array));
    }

    private static int[] reverse3(int[] array) {//makes copy of array but preserves original
           int[] reversedArray = new int[array.length];
           int maxIndex = array.length - 1;
           for (int el : array) {//enhanced for loop
               reversedArray[maxIndex--] = el;//can decrement index inside size brackets!
           }
           return reversedArray;
    }

}
