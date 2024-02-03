public class regEx {
    public static void main(String[] args) {
        String str1 = "john30@gmail.com";
        System.out.println(str1.matches("\\w*@gmail.*")); 
        
    }
}
