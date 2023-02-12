package Function;

import java.util.Scanner;

public class Function_1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String name, regNo;
        int marksIN, marksEX;
        System.out.println("Enter the number of students: ");
        int num = scan.nextInt();
        scan.nextLine();
        Student object[] = new Student[num]; // Array of the objects
        for (int i = 0; i < num; i++) {
            System.out.println("Enter the name of the student:");
            name = scan.nextLine();
            System.out.println("Enter the register number of the Student:");
            regNo = scan.nextLine();
            System.out.println("Enter the internal marks in the java: ");
            marksIN = scan.nextInt();
            System.out.println("Enter the external marks in the java: ");
            marksEX = scan.nextInt();
            scan.nextLine();
            object[i] = new Student(name, regNo, marksEX, marksIN);
        }
        for (int i = 0; i < num; i++)
            System.out.println(object[i].toString());
        System.out.println("Average marks in internal exams in java: " + MarksAverage(object, num));
        System.out.println("Average marks in external exams in java: " + MarksAverage(object, num, 4));
        scan.close();
    }

    // Function Overloading
    public static double MarksAverage(Student object[], int num) {
        double sum = 0.0;
        for (int i = 0; i < num; i++) {
            sum += object[i].internalMarks;
        }
        return sum / num;
    }

    // Function Overloading
    public static double MarksAverage(Student object[], int num, int n) {
        double sum = 0.0;
        for (int i = 0; i < num; i++) {
            sum += object[i].externalMarks;
        }
        return sum / num;
    }

}
