package FunctionMethod;

// 3) Make a function to multiple of 2 numbers and return the product
import java.util.*;
public class function3 {
public static int calculateProduct(int a, int b){
    return a*b;
}
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();

    System.out.println("Product of 2 numbers5 is : "+ calculateProduct(a,b));
}
}
