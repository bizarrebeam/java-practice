import java.util.Scanner;

public class findRadixFromString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        String input = sc.nextLine();
        sc.close();

        if (input.matches("[0-1]+")) {
            System.out.println("Binary");
        } else if (input.matches("[0-7]+")) {
            System.out.println("Octal");
        } else if (input.matches("[0-9A-F]+")) {
            System.out.println("Hexadecimal");
        } else {
            System.out.println("Not a number");
        }
    }
}
