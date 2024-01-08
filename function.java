import java.util.*;
public class function {
    public static void myName(String Name,int Age){
        System.out.println("Name: "+ Name);
        System.out.println("Age: "+ Age);
        return;
    }
    public static int sumoftwoNumber(int a, int b){
        int sum = a+b;
        return sum;
    }
    public static int productoftwoNumber(int c, int d){
        int product = c*d;
        return product;
    }
    public static void findFactorialNumber(int n){
        if(n<0){
            System.out.println("invalid input try again");
        }
        else if(n==0){
            System.out.println("factorial: 1");
            return;
        }
        else{
    int factorial = 1;
    for(int i=n; i>=1; i--){
    factorial=factorial*i;
    }
    System.out.println("factorinal : "+factorial);
    return;
    }
}
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter your name: ");
    String Name = sc.nextLine();
    System.out.println("Enter your age: ");
    int Age = sc.nextInt();
    myName(Name, Age);
    
    System.out.println("sum of two numbers");
    System.out.print("Enter the value of a: ");
    int a = sc.nextInt();
    System.out.print("Enter the value of b: ");
    int b = sc.nextInt();
    int sum = sumoftwoNumber(a, b);
    System.out.println("Sum of two numbers: "+sum);

    System.out.println("product of two numbers ");
    System.out.println("Enter the value of c: ");
    int c = sc.nextInt();
    System.out.println("Enter the value of d: ");
    int d = sc.nextInt();
    int product = productoftwoNumber(c, d);
    System.out.println("Product of two numbers: "+ product);

    System.out.println("find factorial");
        System.out.println("Enter the value of n: ");
        int n = sc.nextInt();
        findFactorialNumber(n);
    sc.close();
    

}
}