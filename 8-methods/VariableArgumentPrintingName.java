public class VariableArgumentPrintingName {
    static void showList(String... names) {
        for (int i = 0; i < names.length; i++) {
            System.out.println((i + 1) + ". " + names[i]);
        }
    }
    public static void main(String[] args) {
        showList("Bambina", "Tatjana", "Gadis", "Cinta", "Alexa", "Kanina", "Cantika");
    }

}
