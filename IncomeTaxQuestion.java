import java.util.*;
public class IncomeTaxQuestion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your Income: ");
        int income = sc.nextInt();
        if(income<250000){
            System.out.println("You don't need to pay tax");
        }
        else if(income>=250000 && income<500000){
            System.out.println("you will pay tax: "+income*0.5 + " rupees");
        }
        else if(income>=500000 && income<1000000){
            System.out.println("you will pay tax: "+income*0.20+ " rupees");
        }
        else{
            System.out.println("you will pay tax: "+income*0.30+ " rupees");
        }        
        sc.close();
    }
    
}
