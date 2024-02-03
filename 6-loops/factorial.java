public class factorial {
    public static void main(String[] args) {
        int n = 10;
        int factorial = 1;
        int i = 1;

        while (i <= n) {
            factorial *= i;
            i++;
        }
        System.out.println("The factorial of " + n + " is " + factorial);
    }
}
