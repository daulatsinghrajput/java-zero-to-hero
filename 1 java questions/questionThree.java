/*Write a Java program to check whether a given number is prime or not. Take any positive integer as input, determine if it's a prime number, and print the result. */

import java.util.*;
public class questionThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of p :");
        int p = sc.nextInt();
        boolean condition = false;
        for(int i = 2; i<p; i++){
          if(p%i==0){
            condition=true;
            break;
          }
        }
        if (condition){
            System.out.println("prime");
        }
        else{
            System.out.println("not prime");
        }
        

        sc.close();
    }
}
