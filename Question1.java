import java.util.*;
public class Question1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your english marks : ");
        int english = sc.nextInt();
        System.out.println("enter your hindi marks : ");
        int hindi = sc.nextInt();
        System.out.println("enter your maths maths : ");
        int maths = sc.nextInt();
        System.out.println("enter your science marks : ");
        int science = sc.nextInt();
        System.out.println("enter your sanskrit marks : ");
        int sanskrit = sc.nextInt();

        int totalMarks = english+hindi+maths+science+sanskrit;
        System.out.println("Total Marks: "+ totalMarks);
        
        double presentage = ((double)totalMarks/500)*100;
        System.out.println("Presentage: "+ presentage+"%");


    sc.close();
}
}