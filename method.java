public class method {
    static int logic (int a, int b){
        int c;
        if(a>b){
            c = (a+b)*2;
        }
        else{
            c = a+b;
        }
        return c;
    }
    static void greeting(){
        System.out.println("good morning");
    }
    public static void main(String[] args) {
        greeting();

        int num1 = 2;
        int num2 = 3;
        int c;
        c = logic(num1, num2);
        System.out.println(c);

        int num3 = 4;
        int num4 = 3;
        int x;
        x = logic(num3, num4);
        System.out.println(x);
    }    
}
