import java.util.Scanner;

public class even_no_n {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner sc = new Scanner(System.in);
        
        // Prompt the user to enter a number
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        
    
         // Print all even numbers from 0 to n
        System.out.println("Even numbers up to " + n + ":");
        for (int i = 0; i <= n; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}

