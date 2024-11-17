package FunctionMethod;
import java.util.*;
public class averageOfThreeNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first number: ");
        double num1 = sc.nextDouble();

        System.out.println("Enter the second number: ");
        double num2 = sc.nextDouble();

        System.out.println("Enter the third number: ");
        double num3 = sc.nextDouble();

        // Calculate the average
        double average = calculateAverage(num1, num2, num3);

        // Print the average
        System.out.println("The average of the three numbers is: " + average);
        
        sc.close();
    }

    // Function to calculate the average of three numbers
    public static double calculateAverage(double num1, double num2, double num3) {
        return (num1 + num2 + num3) / 3;
    }
}

