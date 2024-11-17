package FunctionMethod;
// 2) Make a function to add 2 numbers and return the sum
import java.util.*;
public class function2 {
    public static int calculateSum(int a, int b){
        int sum = a + b;
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter firtst number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();
        

        int sum = calculateSum(a,b);
        System.out.println("Sum of 2 numbers is : "+ sum);
    }
}
