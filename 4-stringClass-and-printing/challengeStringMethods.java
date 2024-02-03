public class challengeStringMethods {
    public static void main(String[] args) {
        String str = "programmer@gmail.com";
        System.out.println(str.contains("@gmail.com"));
        int atIndex = str.indexOf("@");
        String gmailName = str.substring(atIndex);
        System.out.println(gmailName);
    }
}
