package by.itacademy.javase.lecture5;

/**
 * @author Valeria Sterzhanova
 */
public class OneDimensionArray {

    public static void main(String[] args) {
        int januaryDays = 31;
        int februaryDays = 28; // not a leap year
        int marchDays = 31;
        int aprilDays = 30;
        int mayDays = 31;
        int juneDays = 30;
        int julyDays = 31;
        int augustDays = 31;
        int septemberDays = 30;
        int octoberDays = 31;
        int novemberDays = 30;
        int decemberDays = 31;

        int[] monthDays = new int[12]; // номер месяца = номер ячейки + 1
        monthDays[0] = 31;
        monthDays[1] = 28;
        monthDays[2] = 31;
        monthDays[3] = 30;
        monthDays[4] = 31;
        monthDays[5] = 30;
        monthDays[6] = 31;
        monthDays[7] = 31;
        monthDays[8] = 30;
        monthDays[9] = 31;
        monthDays[10] = 30;
        monthDays[11] = 31;

        monthDays = new int[]{31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        int[] monthDaysInitialized = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    }
}
