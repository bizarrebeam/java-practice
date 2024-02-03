public class armstrongChecker {
    public static void main(String[] args) {
        int n = 153;
        int checkTheNum = n;
        int sum = 0;

        while (checkTheNum > 0) {
            int digit = checkTheNum % 10;
            sum += digit * digit * digit;
            checkTheNum /= 10;
        }

        System.out.println(sum);

        if (sum == n) { // kesalahan gweh: n nya udh jd 0 bjirr
            System.out.println("The number is an Armstrong number.");
        } else {
            System.out.println("The number is not an Armstrong number.");
        }
    }
}
