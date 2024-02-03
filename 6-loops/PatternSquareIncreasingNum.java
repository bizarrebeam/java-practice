public class PatternSquareIncreasingNum {
    public static void main(String[] args) {
        int count = 0;
        for (int i=1; i<=5; i++) {
            for (int j = 1; j <= 5; j++) {
                count++;
                System.out.format("%2d ", count);
            }
            System.out.println(); // it's like pressing enter after each row
        }
    }
}

// println: printing but goes to the newline
// print: printing but stays on the same line