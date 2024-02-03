public class palindromeChecker {
    public static void main(String[] args) {
        int n = 12521;
        int temp = n;
        int rev = 0;

        while (n > 0) {
            rev = rev * 10 + n % 10;
            n /= 10;
        }

        if (temp == rev) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not palindrome");
        }
    }
}
