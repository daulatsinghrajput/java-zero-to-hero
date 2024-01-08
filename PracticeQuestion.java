import java.util.*;

public class PracticeQuestion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Your English Subject Marks: ");
        int english = sc.nextInt();

        System.out.print("Enter Your Hindi Subject Marks: ");
        int hindi = sc.nextInt();

        System.out.print("Enter Your Maths Subject Marks: ");
        int maths = sc.nextInt();

        System.out.print("Enter Your Science Subject Marks: ");
        int science = sc.nextInt();

        System.out.print("Enter Your Computer Subject Marks: ");
        int computer = sc.nextInt();

        int totalMarks = english + hindi + maths + science + computer;
        System.out.println("Total Marks: " + totalMarks);

        float percentage = ((float) totalMarks / 500) * 100;
        System.out.println("Your Percentage: " + percentage + "%");

        final int passMarks = 33;

        if (english < passMarks || hindi < passMarks || maths < passMarks || science < passMarks || computer < passMarks) {
            System.out.println("You have failed in one or more subjects.");
        } else if (percentage < 40) {
            System.out.println("You have failed due to low overall percentage.");
        } else {
            System.out.println("Congratulations! You have passed with " + percentage + "%");
        }
        sc.close();
    }
}
