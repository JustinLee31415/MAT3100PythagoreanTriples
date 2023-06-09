/*-------------------------------------------------------------
// AUTHOR: Justin Lee
// FILENAME: Lab3.java
// SPECIFICATION: Practice using a loop.
// FOR: CS 1400- Lab #3
// TIME SPENT: 20 minutes
//-----------------------------------------------------------*/
import java.util.Scanner;
public class Lab3 {
    public static void main(String[] args) {
        // This scanner is prepared for you to get inputs
        Scanner scanner = new Scanner(System.in);
        // Declare three variables for HW, midterm, and final exam grades
        // -->
        double HW = 0;
        double midterm = 0;
        double finalExam = 0;
        // Declare a loop control variable i
        // -->
        int i = 0;
        while (i < 3) {
            // Design if-else control flow:
            //
            // if i is 0, asks for the homework grade
            if (i == 0) {
                System.out.print("\nEnter your HOMEWORK grade: ");
                HW = scanner.nextDouble();
                if (HW < 0 || HW > 100) {
                    System.out.println("\n[ERR] Invalid input. A homework grade should be in [0, 100].");
                }
                else {
                    i++;
                }
            }
            // if i is 1, asks for the midterm exam grade
            if (i == 1) {
                System.out.print("\nEnter your MIDTERM EXAM grade: ");
                midterm = scanner.nextDouble();
                if (midterm < 0 || midterm > 100) {
                    System.out.println("\n[ERR] Invalid input. A midterm grade should be in [0, 100].");
                }
                else {
                    i++;
                }
            }
            // if i is 2, asks for the final exam grade
            if (i == 2) {
                System.out.print("\nEnter your FINAL EXAM grade: ");
                finalExam = scanner.nextDouble();
                if (finalExam < 0 || finalExam > 200) {
                    System.out.println("\n[ERR] Invalid input. A final grade should be in [0, 200].");
                }
                else {
                    i++;
                }
            }
            // You have to let the user re-try if any of the inputs is invalid.
            // - homework grade is in [0, 100]
            // - midterm grade is in [0, 100]
            // - final exam grade is in [0, 200]
        }
        // Calculate the weighted total by the formula showed in the PDF
        // -->
        double weighted_total = (HW * .25 + midterm * .25 + finalExam * .25);
        // Show the weighted total and tell the user s/he passed or not
        // -->
        System.out.println("\n[Info] Student's Weighted Total is " + weighted_total);
        if (weighted_total >= 50) {
            // Print "the student PASSED the class."
            System.out.println("\n[Info] Student PASSED the class");
        } else {
            // Print "the student FAILED the class."
            System.out.println("\n[Info] Student FAILED the class");
        }
        scanner.close();
    }  // End of main
}  // End of class
