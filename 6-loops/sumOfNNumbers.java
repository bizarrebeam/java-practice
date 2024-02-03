public class sumOfNNumbers {
    public static void main(String[] args) {
        int n = 10;
        int i = 1;
        int sum = 0;

        while (i <= n) {
            sum += i;
            i++;
        }
        System.out.println("The sum of the first " + n + " numbers is " + sum); 
    }
}
