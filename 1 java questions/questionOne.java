// Write a Java program to calculate the sum of all integers from 1 to 10 and print the result.

public class questionOne {

    public static void main(String[] args) {
        int sum = 0;
        for(int i = 1; i<=10; i++){
            sum = sum + i;
        } 
        System.out.println(sum);
    }
}