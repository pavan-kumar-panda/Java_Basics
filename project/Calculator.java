import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Prompting the user to enter the first number
        System.out.println("Enter the first number (a): ");
        int a = sc.nextInt();
        
        // Prompting the user to enter the second number
        System.out.println("Enter the second number (b): ");
        int b = sc.nextInt();
        
        // Prompting the user to enter the operator
        System.out.println("Enter the operation number (1 for +, 2 for -, 3 for *, 4 for /, 5 for %): ");
        int operator = sc.nextInt();
 
        /**
         * 1 -> +
         * 2 -> -
         * 3 -> *
         * 4 -> /
         * 5 -> %
         */
 
        switch(operator) {
            case 1 : 
                System.out.println("Result: " + (a + b));
                break;
            case 2 : 
                System.out.println("Result: " + (a - b));
                break;
            case 3 : 
                System.out.println("Result: " + (a * b));
                break;
            case 4 : 
                if (b == 0) {
                    System.out.println("Invalid Division");
                } else {
                    System.out.println("Result: " + (a / b));
                }
                break;
            case 5 : 
                if (b == 0) {
                    System.out.println("Invalid Division");
                } else {
                    System.out.println("Result: " + (a % b));
                }
                break; 
            default : 
                System.out.println("Invalid Operator");
        }
    }
}
