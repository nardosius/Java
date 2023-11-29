import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println();
        System.out.println(getDoubleObject().getClass().getName() + getDoubleObject());
        System.out.println(getLiteralDoublePrimitive());

        System.out.println();
        var ourList = getList(1, 2, 3, 4, 5);
        System.out.println(ourList);
    }


    private static Double getDoubleObject() {
        return Double.valueOf(100.00);
    }

    private static Double getLiteralDoublePrimitive() {
        return 100.00;
    }

    private static ArrayList<Integer> getList(int... varargs){//can use "Integer" and java will
        ArrayList<Integer> aList = new ArrayList<>();//autobox
        for (int i : varargs) {
            aList.add(i);
        }
        return aList;
    }
    private static Integer returnAnInteger(Integer i){
        return i;
    }

    private static int returnAnInt(int i){
        return i;
    }


}

