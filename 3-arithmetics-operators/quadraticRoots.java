import java.util.Scanner;

public class quadraticRoots {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the coefficients of the quadratic equation: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        sc.close();

        double root1 = -b + Math.sqrt(b * b - 4 * a * c) / (2 * a);
        double root2 = -b - Math.sqrt(b * b - 4 * a * c) / (2 * a);
        
        System.out.println("The roots of the quadratic equation are: " + root1 + " and " + root2);  
    }
}
