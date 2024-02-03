public class dateFormatChecker {
    public static void main(String[] args) {
        String d = "01/12/2000";
        // System.out.println(d.matches("[/]{2}")); my fault here is it only match 2 consecutives /
        System.out.println(d.matches("[0-3][0-9]/[0-1][0-9]/[0-9]{4}"));
    }
}
