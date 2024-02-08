public class VarArgsMaxNum {
    static int max(int... num) {
        // handle if there's no argument given
        if (num.length == 0) {
            return Integer.MIN_VALUE;
        }

        // loop to search for the max number
        int max = num[0];
        for (int i = 1; i < num.length; i++) {
            if (num[i] > max) {
                max = num[i];
            }
        }
        return max;
    }
    
    public static void main(String[] args) {
        System.out.println(max(1, 2, 3, 4, 5));
        System.out.println(max(187589, 2847, 483, 4092, 584397593));
        System.out.println(max());
    }
}
