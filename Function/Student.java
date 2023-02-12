package Function;

public class Student {
    String studentName;
    String studentRegNo;
    int internalMarks;
    int externalMarks;

    Student() // Default Constructor
    {
        this.studentName = null;
        this.studentRegNo = null;
        this.internalMarks = 0;
        this.externalMarks = 0;
    }

    Student(String name, String reg, int marksIN, int marksEX) // Parameterised Constructor with 4 parameters
    {
        this();
        this.studentName = name;
        this.studentRegNo = reg;
        this.internalMarks = marksIN;
        this.externalMarks = marksEX;
    }

    // Function overriding
    @Override
    public String toString() {
        return "Student Name: " + studentName + "\nStudent Register Number: " + studentRegNo
                + "\nStudent Internal Marks: " + internalMarks + "\nStudent External Marks: " + externalMarks
                + "\n-------------------------------";
    }
}
