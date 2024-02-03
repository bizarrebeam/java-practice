public class reverseNumStringVer {
    public static void main(String[] args) {
        int n = 257;
        String rev = "";

        while (n > 0) {
            int lastDigit = n % 10; // get the last digit
            rev += lastDigit; // add the last digit to rev
            n /= 10; // remove the last digit
        }

        System.out.println(rev);
    }
}

// kesalahan gweh adalah, bagian n mod 10 tida gue store di variable, jadinya nilai asli
//  n nya udh berubah dari awal