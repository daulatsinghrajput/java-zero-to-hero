// Write a Java program to find the factorial of a given number. You can take any positive integer as input, calculate its factorial, and print the result. Remember, the factorial of a number n is the product of all positive integers up to n.
import java.util.*;
public class questionTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of f: ");
        int f = sc.nextInt();
        int num = 1;
        if (f == 0 || f == 1){
            System.out.println("factorial = 1");
        }
        else {
            for(int i = f; i>=1;i--){
                num = num *i;
            }
            System.out.println("factorial = "+num);
        }
        sc.close();
    }
    
}
