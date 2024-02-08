public class OverloadReverseIntOrArr {

    static int reverse(int n) {
        int rev = 0;
        while (n > 0) {
            rev = rev * 10 + n % 10;
            n /= 10;
        }
        return rev;
    }

    static int[] reverse(int[] arr) {
        int[] rev = new int[arr.length];
        int index = 0;
        for (int i = arr.length - 1; i >= 0; i--) {
            rev[index] = arr[i];
            index++;
        }
        return rev;
    }

    public static void main(String[] args) {
        System.out.println("Reverse of 3055: " + reverse(3055));
        int[] arr = { 1, 1, 2, 3, 5, 8, 13, 21, 34, 55 };
        System.out.println("The reverse of the array: "+ java.util.Arrays.toString(reverse(arr)));
    }
    
}