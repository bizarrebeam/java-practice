import java.util.Scanner;

public class menuDrivenArithmeticOperations {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int num1 = input.nextInt();
        System.out.println("Enter the operation: ");
        String operation = input.next().toUpperCase();
        System.out.println("Enter the second number: ");
        int num2 = input.nextInt();

        switch (operation) {
            case "ADD":
                System.out.println("The sum is: " + (num1 + num2));
                break;
            case "SUB":
                System.out.println("The difference is: " + (num1 - num2));
                break;
            case "MUL":
                System.out.println("The product is: " + (num1 * num2));
                break;
            case "DIV":
                System.out.println("The quotient is: " + (num1 / num2));
                break;
            case "MOD":
                System.out.println("The remainder is: " + (num1 % num2));
                break;
            default:
                System.out.println("Invalid operation");
                break;
        }

    }
}
