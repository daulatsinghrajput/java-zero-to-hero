import java.util.Scanner;
public class SumofNaturalNumber {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        System.out.println("Enter the value of n : ");
        int n = scanner.nextInt();
        for(int i = 1; i<=n; i++){
            sum = sum + i;
        }
        System.out.println(sum);
        scanner.close();
    }
    
}
