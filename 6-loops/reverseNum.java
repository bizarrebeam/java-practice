public class reverseNum {
    public static void main(String[] args) {
        int n = 257;
        int rev = 0;

        while (n > 0) {
            rev = rev * 10 + n % 10;
            n /= 10;
        }

        System.out.println(rev);
    }
}

//  237, jadi 0 x 10 + 7, terus angkanya dibikin jd 25
// 25, jadi 25 x 10 + 3, terus angkanya dibikin jd 2
// 2, jadi 2 x 10 + 2, terus angkanya dibikin jd 0
