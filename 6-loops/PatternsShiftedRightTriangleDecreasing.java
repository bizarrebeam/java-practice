public class PatternsShiftedRightTriangleDecreasing {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            for (int j=1; j<=i; j++) { // kalau j diset <=i, jadinya malah decreasing pattern!
                System.out.print(" " + " ");
            }
            for (int j = 1; j <= (5 - i + 1); j++) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }
}

// remember to print the loop for spaces first as what i'm doing here is
// pushing the asterisk to the right side