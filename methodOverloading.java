public class methodOverloading {
    
    static void change1(int a){
        a = 98;
    }
    static void change2(int []arr){
        arr[0] = 98;
    }
    static void  foo(){ //parameter are copy
        System.out.println("good morning bro!");
    }
    static void  foo(int a){ //parameter are copy
        System.out.println("good morning bro!"+ a);
    }
    static void  foo(int a, int b){ //parameter are copy
        System.out.println("good morning bro!"+a+" "+b);
    }

    public static void main(String[] args) {
        int num = 23;
        change1(num); // a ki copy change 1 me gyi hai 
        System.out.println(num);

        int []marks = {54, 65, 78, 45, 76};
        change2(marks); // a ka reference marks address change 2 me gya hai 
        System.out.println(marks[0]);

        foo(); // argument are actual
        foo(2023); // argument are actual
        foo(2023, 2024);  // argument are actual
    }
}
