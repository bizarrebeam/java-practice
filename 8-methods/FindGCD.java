import java.util.Scanner;

public class FindGCD {
    static int findGCD(int m, int n) {
        while (m != n) {
            if (m > n) {
                m = m - n;
            } else {
                n = n - m;
            }
        }
        return m;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers: ");
        int m = sc.nextInt();
        int n = sc.nextInt();
        sc.close();

        System.out.println("GCD of " + m + " and " + n + " is " + findGCD(m, n));
    }
}
