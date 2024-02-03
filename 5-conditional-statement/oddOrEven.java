import java.util.Scanner;

public class oddOrEven {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = input.nextInt();
        input.close();
        
        if (n%2 == 0) {
            System.out.println("The number is even.");
        } else {
            System.out.println("The number is odd.");
        }


    }
}
