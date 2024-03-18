public class Student {
    private String studentID;
    private String name;
    private String major;
    private Subject[] subjects;

    // see how to initialize cosntructor if you take an array of some class
    public Student(String studentID, String name, String major, Subject[] subjects) {
        this.studentID = studentID;
        this.name = name;
        this.major = major;
        this.subjects = subjects;
    }
}
