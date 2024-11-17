package FunctionMethod;

import java.util.Scanner;

public class SumOfOddNumbers {
   public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a positive integer: ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Please enter a positive integer.");
        } else {
            System.out.println("The sum of all odd numbers from 1 to " + n + " is: " + sumOfOddNumbers(n));
        }
    }

    public static int sumOfOddNumbers(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i = i + 2) {
            sum = sum + i;
        }
        return sum;
    }
} 
