import java.util.Random;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        DayOfTheWeek weekDay = DayOfTheWeek.TUES;//notice no "new" to instantiate
        System.out.println(weekDay);
        for (int i = 0; i < 10; i++) {
            weekDay = getRandomDay();
//            System.out.printf("Name is %s, Ordinal value = %d%n", weekDay.name(), weekDay.ordinal());//name() and ordinal() are methods on enum objects
//            if (weekDay == DayOfTheWeek.FRI) {
//                System.out.println("Found a Friday!");
//            }
            switchDayOfTheWeek(weekDay);
        }
        for (Topping topping : Topping.values()) {
            System.out.println(topping.name() + " : " + topping.getPrice());
        }
    }
    public static void switchDayOfTheWeek(DayOfTheWeek weekDay) {
        int weekDayInteger = weekDay.ordinal() + 1;
        switch (weekDay) {
            case WED -> System.out.println("Wednesday is Day " + weekDayInteger);
            case THURS -> System.out.println("Thursday is Day " + weekDayInteger);
            case SAT -> System.out.println("Saturday is Day " + weekDayInteger);
            default -> System.out.println(weekDay.name().charAt(0) + weekDay.name().substring(1).toLowerCase() +
                    "day is Day " + weekDayInteger);
        }

    }
    public static DayOfTheWeek getRandomDay() {
        int randomInteger = new Random().nextInt(7);
        var allDays = DayOfTheWeek.values();//notice .values() method on DaysOfTheWeek
        return allDays[randomInteger];//basically extracting from an array
    }
}