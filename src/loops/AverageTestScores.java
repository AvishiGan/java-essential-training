package loops;

import java.util.Scanner;

public class AverageTestScores {
    public static void main(String[] args) {

        //Initialize what we know
        int numberOfStudents = 24;
        int numberOfTests = 4;

        Scanner scanner = new Scanner(System.in);

        //Process all students
        for (int i = 0; i < numberOfStudents; i++) {

            double total = 0;

            //Process all tests
            for (int j = 0; j < numberOfTests; j++) {
                System.out.println("Enter the score for test #" + (j + 1));
                double score = scanner.nextDouble();
                total = total + score;
            }

            double average = total / numberOfTests;
            System.out.println("Test average for student #" + (i + 1) + " is " + average);
        }

        scanner.close();
    }
}
