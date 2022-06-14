package by.itacademy.javase.lecture9.enumeration;

public enum WeekDay {

    MONDAY(1, "ПН"),
    TUESDAY(2, "ВТ"),
    WEDNESDAY(3, "СР"),
    THURSDAY(4, "ЧТ"),
    FRIDAY(5, "ПТ"),
    SATURDAY(6, "СБ"),
    SUNDAY(7, "ВС");
//    UNKNOWN();

    private int number;

    private String name;

    WeekDay(int number, String name) {
        this.number = number;
        this.name = name;
    }

    private int test(int num) {
        WeekDay[] values = values();

        if (num == 7) {
            return 0;
        }

        return num + 1;
    }

    private void print(int num) {
        for (WeekDay value : values()) {
            if (value.number == num) {
                System.out.println(value);
            }
        }
    }

    public int getNumber() {
        return number;
    }

    public String getName() {
        return name;
    }
}
