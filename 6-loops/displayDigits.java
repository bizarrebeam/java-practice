public class displayDigits {
    public static void main(String[] args) {
        int n = 257;

        while (n > 0) {
            System.out.println(n % 10); // get the
            n /= 10;
        }
    }
}