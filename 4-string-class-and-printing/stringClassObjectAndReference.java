public class stringClassObjectAndReference {
   public static void main(String[] args) {
    //    String str1 = "Java Program";
    //    String str2 = new String("JAVA");

        // converting array into str
        // char c[] = { 'h', 'e', 'l', 'l', 'o' };
        // byte b[] = { 65, 66, 67, 68 };
        // String str3 = new String(c); // consturctor creating str
        // String str4 = new String(b,2,2);
        // System.out.println(str4);

        String a = "Java"; // in a pool of string
        String b=new String("Java"); // new object created in heap
        System.out.println(a==b);   // returns false
        

   } 
}
