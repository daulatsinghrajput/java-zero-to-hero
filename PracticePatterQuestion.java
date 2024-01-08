import java.util.*;
public class PracticePatterQuestion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for(int i = 1; i<=4; i++){
            for(int j =1; j<=5-i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println("sum of first n exen numbers");
        System.out.print("enter the value of n: ");
        int n = sc.nextInt();
        int i = 2;
        int sum = 0;
        while(i<=n){
         sum = sum +i; 
         i = i+2;
        }
        System.out.println("the sum of n even numbers is: "+ sum);

        for(int t=10; t>=1; t--){
            System.out.println(10*t);
        }
        System.out.println("enter the value of factorial: ");
        int factorial = sc.nextInt();
        int add = 1;
        if((factorial==1) || (factorial == 0)){
            System.out.println("Factorial: 1");
        } 
        else{
        for(int f = factorial; f>=1; f--){
            add = add*f;
        }
        System.out.println("Factorial: "+ add);
    }
    sc.close();
    }
}
