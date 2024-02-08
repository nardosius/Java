import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        String[][] matrix1 = {{"null", "null", "null"},
                {"null", "null", "null"}, {"null", "null", "null"}};

        printMatrix(matrix1);
        System.out.println();
        randomXandOs(matrix1);
    }

    public static void printMatrix(String[][] matrix) {
        for (String[] strings : matrix) {
            System.out.println();
            for (int j = 0; j < 3; j++) {
                System.out.print(strings[j] + ", ");
            }
        }
    }

    public static void randomXandOs(String[][] matrix) {
        Random rando = new Random();
        for ( String[] s : matrix) {
            System.out.println();
            for (int i = 0; i < 3; i++) {
                s[i] = "O";
                System.out.print(s[i] + ", ");
            }
        }
    }
}