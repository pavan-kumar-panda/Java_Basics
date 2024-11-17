package Patterns;
import java.util.*;
public class Floyds_triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        int number = 1;

        //Outer loop
        for(int i=1; i<=n; i++){
            //Inner loop
            for(int j=1; j<=i; j++){
                System.out.print(number+" ");
                number = number + 1;

            }
            System.out.println();
        }
    }
}
