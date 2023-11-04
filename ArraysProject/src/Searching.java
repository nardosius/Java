import java.util.Arrays;

public class Searching {
    /*use Arrays.binarySearch. Array must be sorted, no guarantee what returned if
    * duplicate values, elements must be comparable (instances of same type)
    * returns: position of match if found, -1 if no match found, positive number may
    * not be position of first match*/
    public Searching() {
        String[] sArray = {"Able", "Jane", "Mark", "Ralph", "David"};
        Arrays.sort(sArray);//remember binary search needs sorted array
        System.out.println(Arrays.toString(sArray));
        if (Arrays.binarySearch(sArray, "Mark") >= 0) {
            System.out.println("Found Mark in the list");
        }
        int[] s1 = {1, 2, 3, 4, 5};
        int[] s2 = {1, 2, 3, 4, 5};

        if (Arrays.equals(s1, s2)) {
            System.out.println("Arrays are equal");
        } else {
            System.out.println("Arrays are not equal");
        }

    }
}
