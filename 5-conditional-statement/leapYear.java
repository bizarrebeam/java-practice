public class leapYear {
    public static void main(String[] args) {
        int year = 2020;
        boolean leap = false;

        if (year % 4 == 0) {
            if (year % 100 != 0) {
                leap = true;
            } else if (year % 400 == 0) {
                leap = true;
            }
        }

        if (leap) {
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is not a leap year.");
        }
    }
}
