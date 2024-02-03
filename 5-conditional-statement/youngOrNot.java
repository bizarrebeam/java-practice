import java.util.Scanner;

public class youngOrNot {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = input.nextInt();
        input.close();

        if (14<=age && age<=25) {
            System.out.println("You are young.");
        } else {
            System.out.println("You are not young.");
        }   

    }
}
