import java.util.Scanner;

public class findGrades {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int g1, g2, g3;
        System.out.print("Enter your 1st grade: ");
        g1 = input.nextInt();
        System.out.print("Enter your 2nd grade: ");
        g2 = input.nextInt();
        System.out.print("Enter your 3rd grade: ");
        g3 = input.nextInt();
        input.close();

        int avg = (g1 + g2 + g3) / 3;
        
        if (avg >= 70) {
            System.out.println("Menyala abangkuh!!");
        }
        else if (avg >= 60) {
            System.out.println("Kelas abangda!!");
        }
        else if (avg >= 50) {
            System.out.println("Bukan kaleng-kaleng!!");
        }
        else if (avg >= 40) {
            System.out.println("Ilmu padi abangku!!");
        }
        else {
            System.out.println("hm..");
        }
    }
}
