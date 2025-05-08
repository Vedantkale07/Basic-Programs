import java.util.Scanner;

public class StudentGradeCalculator {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask the user how many grades they will enter
        System.out.print("Enter the number of grades: ");
        int numberOfGrades = scanner.nextInt();

        // Create an array to store the grades
        double[] grades = new double[numberOfGrades];
        double sum = 0;

        // Loop to get all grades from the user
        for (int i = 0; i < numberOfGrades; i++) {
            System.out.print("Enter grade #" + (i + 1) + ": ");
            grades[i] = scanner.nextDouble();
            sum += grades[i];
        }

        // Calculate average
        double average = sum / numberOfGrades;

        // Display result
        System.out.printf("The average grade is: %.2f%n", average);
        
        scanner.close();
    }
}
