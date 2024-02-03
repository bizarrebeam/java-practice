public class removeSpecialChar {
    public static void main(String[] args) {
        String str = "a!B@c#d$1%2^3&";
        str = str.replaceAll("[^a-zA-Z0-9]", "");
        System.out.println(str);
    }
}
