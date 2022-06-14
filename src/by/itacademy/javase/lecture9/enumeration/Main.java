package by.itacademy.javase.lecture9.enumeration;

import static enumexample.WeekDay.FRIDAY;
import static enumexample.WeekDay.MONDAY;
import static enumexample.WeekDay.TUESDAY;

public class Main {

    public static void main(String[] args) {
        System.out.println(MONDAY.getNumber());

        WeekDay monday = MONDAY;
        WeekDay friday = FRIDAY;

        System.out.println(monday == friday);
        System.out.println(monday == MONDAY);

        printTimetableByDay(TUESDAY);
        printTimetableByDay(FRIDAY);
    }

    // расписание по дням недели с помощью enum

    public static void printTimetableByDay(WeekDay day) {
        switch (day) {
            case MONDAY:
                System.out.println(day.getName() + ": work");
                break;
            case TUESDAY:
                System.out.println(day.getName() + ": a lot of work");
                break;
            case WEDNESDAY:
                System.out.println(day.getName() + ": also work");
                break;
            case THURSDAY:
            case FRIDAY:
            case SATURDAY:
            case SUNDAY:
                System.out.println(day.getName() + ": chill");
                break;
            default:
                System.out.println("unknown day");
        }
    }
}
