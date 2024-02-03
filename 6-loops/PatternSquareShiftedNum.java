public class PatternSquareShiftedNum {
    public static void main(String[] args) {
        for (int i=1; i<=5; i++) {
            for (int j=1; j<=5; j++) {
                System.out.print((i+j) + " ");
            }
            System.out.println(); // it's like pressing enter after each row
        }
    }
}

// println: printing but goes to the newline
// print: printing but stays on the same line