     class Student {
    String name;
    int age;

    public void studentInfo(String name) {
        System.out.println("Student Name: "+ name);
    }
    public void studentInfo(int age) {
        System.out.println("Student Age: "+ age);
    }
    public static void studentInfo(String name, int age) {
        System.out.println("Student Name: " + name);
        System.out.println("Student Age: " + age);
    }
}
public class Polymorphism {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Daulat Singh";
        s1.age = 20;
        
        Student.studentInfo(s1.name, s1.age);
    }
}
    