import java.util.Scanner;
public class InputControlStatement {
 public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    // for loop control statement
    System.out.println("enter the value of a:");
    int userInput = scanner.nextInt();
    int i = userInput;
    for(int a = 1; a<=i; a++){
        System.out.println(a);
    }
    // if else control statement
    System.out.println("enter your age : ");
    int age = scanner.nextInt();
    if(age>=18 && age<110){
        System.out.println("you can vote");
    }
    else if(age<18 && age>1){
        System.out.println("you can't vote");
    }
    else{
        System.out.println("Invalid Input try again");
    }
    scanner.close();
 }   
}
