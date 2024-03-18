public class Subject{
    private String subjectID;
    private String name;
    private int maxMarks;
    private int marksObtained;

    public Subject(String subjectID, String name) {
        this.subjectID = subjectID;
        this.name = name;
    }

    public Subject(String subjectID, String name, int maxMarks) {
        this.subjectID = subjectID;
        this.name = name;
        this.maxMarks = maxMarks;
    }

    public String getSubjectID() {
        return subjectID;
    }

    public String getName() {
        return name;
    }

    public int getMaxMarks() {
        return maxMarks;
    }

    public int getMarksObtained() {
        return marksObtained;
    }

    public void setMaxMarks(int maxMarks) {
        this.maxMarks = maxMarks;
    }

    public void setMarksObtained(int marksObtained) {
        this.marksObtained = marksObtained;
    }

    // another method
    public boolean isQualified(int mark) {
        return mark >= maxMarks / 10 * 4;
    }
    
    public String toString() {
        return 
                "subjectID='" + subjectID + '\'' +
                ", name='" + name + '\'' +
                ", maxMarks=" + maxMarks +
                ", marksObtained=" + marksObtained;
    }
}

