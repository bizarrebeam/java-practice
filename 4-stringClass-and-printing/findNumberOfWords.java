public class findNumberOfWords {

    public static void main(String[] args) {
        String str = "abc    de fgh   jkl  hij";
        str = str.replaceAll("\\s+", " ");
        String words[] = str.split("\\s");
        System.out.println(words.length);   
    }
}