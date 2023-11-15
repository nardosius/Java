import java.util.Arrays;

public class MultiArrays {//can use var keyword to let java infer data type

    public MultiArrays() {
    int[][] murray = new int[4][4];
    for (int i=0; i< murray.length; i++) {
        for (int j=0; j<murray[i].length; j++) {
            murray[i][j] = (i * 10) + j;
        }
    }
        System.out.println(Arrays.deepToString(murray));
        System.out.println();
        for (var el : murray) {
            System.out.println(Arrays.toString(el));
            for (var inner : el) {
                System.out.println(inner);
            }
        }
    }
}
