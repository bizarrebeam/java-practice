import java.util.Scanner;

public class cuboid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the length, breadth and height of the cuboid: ");
        int l = sc.nextInt();
        int b = sc.nextInt();
        int h = sc.nextInt();

        sc.close();

        int frontBackArea = l * h;
        int leftRightArea = b * h;
        int topBottomArea = l * b;

        int totalSurfaceArea = 2 * (frontBackArea + leftRightArea + topBottomArea);
        int volume = l * b * h;

        System.out.println("Total surface area of the cuboid is: " + totalSurfaceArea);
        System.out.println("Volume of the cuboid is: " + volume);   
    }
}
