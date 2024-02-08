public class ValidateStudentNameAndAge {
    static boolean validateStudentName(String name) {
        return name.matches("[a-zA-Z\\s]+"); // consist one or more--upper, lower, and space
    }

    static boolean validateStudentAge(int age) {
        return age > 7 && age < 18;
    }

    public static void main(String[] args) {
        String name = "Adelya Amanda";
        int age = 15;
        if (validateStudentName(name) && validateStudentAge(age)) {
            System.out.println("Valid name and age for a student");
        } else {
            System.out.println("Invalid name or age for a student");
        }
    }
}
