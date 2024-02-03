public class binaryChecker {
    public static void main(String[] args) {
        int b = 10110001;
        String bString = String.valueOf(b);
        System.out.println(bString.matches("[01]*"));
    }
}
