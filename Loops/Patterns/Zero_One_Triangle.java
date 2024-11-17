package Patterns;
import java.util.*;
public class Zero_One_Triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number:");
        int n = sc.nextInt();

        // outer loop
        for(int i=1; i<=n; i++){ //same rows 
            // inner loop
            for(int j=1; j<=i; j++){ //same column
                // conditions 
                int sum = i+j;
                if(sum % 2 == 0){ // even value
                    System.out.print("1 ");
                }else{ // odd value
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
    }
}

