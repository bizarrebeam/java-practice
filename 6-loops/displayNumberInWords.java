public class displayNumberInWords {
    public static void main(String[] args) {
        int n = 1700;
        String rev = "";

        while (n > 0) {
            int lastDigit = n % 10; // get the last digit
            rev += lastDigit; // add the last digit to rev
            n /= 10; // remove the last digit
        }
        
        for (int i = rev.length() - 1; i >= 0; i--) {
            switch (rev.charAt(i)) {
                case '0':
                    System.out.print("zero ");
                    break;
                case '1':
                    System.out.print("one ");
                    break;
                case '2':
                    System.out.print("two ");
                    break;
                case '3':
                    System.out.print("three ");
                    break;
                case '4':
                    System.out.print("four ");
                    break;
                case '5':
                    System.out.print("five ");
                    break;
                case '6':
                    System.out.print("six ");
                    break;
                case '7':
                    System.out.print("seven ");
                    break;
                case '8':
                    System.out.print("eight ");
                    break;
                case '9':
                    System.out.print("nine ");
                    break;
            }
        }
    }
}
