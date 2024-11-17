package FunctionMethod;
// 1)Print a given name in a function 
// camel case means the latter should be lower and upper case
import java.util.*;
public class function1 {
    public static void printMyName(String name){
        System.out.println(name);
        return;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //System.out.println("Enter your name: ");
        String name = sc.next();

        printMyName(name); //call kiya function ka
    }
}
