class Student {
    String name;
    int age;
    String city;

    public void pringinfo(){
        System.out.println("student name: "+ this.name);
        System.out.println("student age: "+ this.age);
        System.out.println("student city: "+ this.city);
    }

}
public class Oops {
    public static void main(String[] args){
        Student s1 = new Student();
        s1.name = "daulat singh";
        s1.age = 20;
        s1.city = "jaipur";
        
        s1.pringinfo();

    }
}
