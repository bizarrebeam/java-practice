public class SumCommandLine {
    public static void main(String[] args) {
        double sum = 0;

        for (String arg : args) {
            if (arg.matches("[0-9\\.]+")) {
                sum += Double.parseDouble(arg);
            } else {
                System.out.println("Invalid input: " + arg);
            }
        }

        System.out.println("The sum of the valid command line arguments is " + sum);
    }
}
