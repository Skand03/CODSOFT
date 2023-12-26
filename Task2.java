import java.util.*;

public class Task2 {
    public static void main(String[] args) {
        Student_grade();
    }

    public static void Student_grade() {
        Scanner sc = new Scanner(System.in);
        int marks[] = new int[5];
        int total = 0;
        float average;

        for (int i = 0; i <= 4; i++) {
            System.out.println("Enter the Subject name : ");
            String subject = sc.next();

            System.out.println("Enter the Marks : ");
            marks[i] = sc.nextInt();
            total += marks[i];
            System.out.println(" Subject name is " + subject + " and marks is " + marks[i]);
        }
        System.out.println("Total Marks of subject  is : " + total + " ");

        average = total / 5;
        System.out.println("The student grade is : " + average + " ");

        if (average >= 90) {
            System.out.println("Grade A");
        }

        else if (average >= 80) {
            System.out.println("Grade B");
        } else if (average >= 70) {
            System.out.println("Grade C");
        } else if (average >= 60) {
            System.out.println("Grade D");
        }

        else if (average >= 40) {
            System.out.println("Grade E");
        } else if (average >= 33) {
            System.out.println("Grade F");
        } else {
            System.out.println("Fail");
        }
        sc.close();
    }
}
