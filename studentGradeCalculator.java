package Source;

import java.util.Scanner;

public class studentGradeCalculator {
    public static String calculateGrade(double average) {
        if (90 <= average && average <= 100) {
            return "A+";
        } else if (80 <= average && average <= 89) {
            return "A";
        } else if (73 <= average && average <= 79) {
            return "B+";
        } else if (64 <= average && average <= 72) {
            return "B";
        } else if (57 <= average && average <= 63) {
            return "C+";
        } else if (52 <= average && average <= 56) {
            return "C";
        } else if (46 <= average && average <= 51) {
            return "D+";
        } else if (41 <= average && average <= 45) {
            return "D";
        } else if (36 <= average && average <= 40) {
            return "E";
        } else {
            return "F";
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number of Subjects :");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Invalid number of subjects.");
            return;
        }

        double[] marks = new double[n];
        double totalMarks = 0;

        for (int i = 0; i < n; i++) {
            System.out.print(" Enter Marks obtained in Subject " + (i + 1) + " : ");
            double x = sc.nextDouble();

            if (0 > x|| x > 100) {
                System.out.println("Invalid input! Marks should be between 0 and 100.");
                return;
            }
            
            marks[i] = x;
            totalMarks += x;
        }
        double average = totalMarks / n;

        String grade = calculateGrade(average);

        System.out.println("\n--- Result ---");
        System.out.println("Total Marks: " + totalMarks + "/" + (n * 100));
        System.out.printf("Average Percentage: %.2f%%\n", average);
        System.out.println("Grade: " + grade);

        sc.close();
    }
}
