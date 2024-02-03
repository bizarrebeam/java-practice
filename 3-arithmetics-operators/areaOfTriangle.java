import java.util.Scanner;

// public class areaOfTriangle {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         System.out.println("Enter the base of the triangle: ");
//         double base = sc.nextDouble();

//         System.out.println("Enter the height of the triangle: ");
//         double height = sc.nextDouble();

//         double area = (base * height) / 2;
//         System.out.println("The area of the triangle is: " + area);
//     }
// }

// 

public class areaOfTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the sides (a,b,c) of the triangle: ");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();

        sc.close();

        double s = (a + b + c) / 2;
        double area = Math.sqrt(s * (s - a) * (s - b) * (s - c));
        System.out.println("The area of the triangle is: " + area); 
    }
}
