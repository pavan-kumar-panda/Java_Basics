package FunctionMethod;
// Find the factorial of a number
import java.util.*;
public class factorial {
   public static void printFactorial(int n){
     //loop
     if(n<0){
        System.out.println("Invalid Number");
        return;
     }
     int factorial = 1;
     for(int i=n; i>=1; i--){
        factorial = factorial * i;
     }
     System.out.println(factorial);
     return;
   } 
   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter the value of n: ");
       int n = sc.nextInt();
       System.out.println("The factorial of " +n);
       printFactorial(n);
   }
}