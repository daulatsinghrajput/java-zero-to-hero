public class JavaString {
    public static void main(String[] args) {
        int a = 23;
        float f = 3.3434f;
        double d = 3355.3434;
        String s = "daulat singh";
        char c = 'a';

        System.out.printf("The value of a is %d\n", a);
        System.out.printf("The value of f is %.2f\n", f);  // Added precision specifier for the float
        System.out.printf("The value of d is %.4f\n", d);  // Corrected format specifier for double
        System.out.printf("The name is %s\n", s);
        System.out.printf("The character is %c\n", c);

        System.out.println("Sum of a, f, and d: " + (a + f + d));
        System.out.println("String: " + s);
        System.out.println("Character: " + c);
    }
}
