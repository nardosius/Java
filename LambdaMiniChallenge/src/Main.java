import java.util.Arrays;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public class Main {
    public static void main(String[] args) {
/*Change the following into lambda expressions*/
        Consumer<String> printTheParts = new Consumer<String>() {
            @Override
            public void accept(String s) {
                String[] parts = s.split(" ");
                for (String part : parts) {
                    System.out.println(part);
                }
            }
        };
        /*To start w/ lambda, object will be instantiated followed by "="
        * then use "someVar -> { ......args };" Lambdas end w/ a ";" after
        * the closing curly brace*/
//        printTheParts as a lambda:
        Consumer<String> printWordsLambda = sentence -> {
            String[] parts = sentence.split(" ");
            for (String part : parts) {
                System.out.println(part);
            }
        };
//        printTheParts as a different lambda:
        Consumer<String> printWordsForEach = sentence -> {
            String[] parts = sentence.split(" ");
            Arrays.asList(parts).forEach(s -> System.out.println(s));
        };

        Consumer<String> printWordsConcise = sentence -> {
            Arrays.asList(sentence.split(" ")).forEach(s -> System.out.println(s));
        };

        Function<String, String> everySecondsChar = source -> {
            StringBuilder returnVal = new StringBuilder();
            for (int i = 0; i < source.length(); i++) {
                if (i % 2 == 1) {
                    returnVal.append(source.charAt(i));
                }
            }
            return returnVal.toString();
        };

        UnaryOperator<String> everySecondChars = source -> {//no arguments to pass here. Must use "apply" w/sout
            StringBuilder returnVal = new StringBuilder();
            for (int i = 0; i < source.length(); i++) {
                if (i % 2 == 1) {
                    returnVal.append(source.charAt(i));
                }
            }
            return returnVal.toString();
        };
//      This can be shortened
        Supplier<String> love = () -> {
            String iLoveJava = "I love Java";
            return iLoveJava;
        };

        Supplier<String> iLovejava = () -> "I love Java";

//        "apply w/sout to pass arguments to lambda constructed w/o place to enter args
        /*System.out.println(everySecondChars.apply("1234567890"));
        printTheParts.accept("Hello World!");
        System.out.println("-".repeat(30));
        printWordsLambda.accept("Let's do Lambdas!");
        System.out.println("-".repeat(30));
        printWordsForEach.accept("This is Fun!");
        System.out.println("-".repeat(30));
        printWordsConcise.accept("What a way to code");
        System.out.println("-".repeat(30));
        System.out.println(everySecondChar("Hello"));
        System.out.println("-".repeat(30));
        System.out.println(everySecondsChar.apply("I am coding!"));*/
        String result = everySecondCharacter(everySecondsChar, "1234567890");
        System.out.println(result);
        System.out.println("-".repeat(30));
        String supplierResult = iLovejava.get();
        System.out.println(supplierResult);
    }
    /*Second part of challenge. Turn this into a lambda:*/
    public static String everySecondChar(String source) {
        StringBuilder returnVal = new StringBuilder();
        for (int i = 0; i < source.length(); i++) {
            if (i % 2 == 1) {
                returnVal.append(source.charAt(i));
            }
        }
        return returnVal.toString();
    }

    public static String everySecondCharacter(Function<String, String> funx, String source) {
        return funx.apply(source);
    }

}