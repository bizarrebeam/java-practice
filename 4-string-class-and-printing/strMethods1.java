public class strMethods1 {
    public static void main(String[] args) {
        String str = "Java";
        String strInp = "  Java  ";
        // remember it uses a literal str (not creating a new object from String class)
        // so str refer to object in the pool
        
        // remember string is immutable so i have to assign the methods used into a variable
        // or use the same variable name but the object will be replaced
        int l = str.length();

        String str1 = str.toLowerCase();
        String str2 = str.toUpperCase();
        String strInp1 = strInp.trim();

        String str3 = str.substring(3);
        String str4 = str.substring(1, 3);
        
        String str5 = str.replace('a', 'o'); //replace every OLDCHAR 
    }
}
