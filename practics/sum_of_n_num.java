//Sum of the number 
import java.util.*;
public class sum_of_n_num {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n: ");
        int n = sc.nextInt();

        int sum = 0;
        for(int i =0; i<=n; i++){
            sum = sum + i; 
        }
        System.out.println(sum);
    }
}
