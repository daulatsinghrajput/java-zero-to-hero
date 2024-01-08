public class Operators {
    public static void main(String[] args) {
        /*three types of operators
         * (1) arithmetic operators
         * (2) relational operators
         * (3) logical operators
         */
        // (1) arithmetic operators
        int a = 10, b = 20 ;

        //addition operation
        int sum = a+b;
        System.out.println("Sum: "+ sum);

        //subtraction operation 
        int difference = a-b;
        System.out.println("Difference: "+ difference);

        //multiplication operation 
        int product = a*b;
        System.out.println("Multiplication: "+ product);

        // division (quotient)
        int quotient = a/b;
        System.out.println("Quotient: "+ quotient);

        // reminder (modulus)
        int reminder = a%b;
        System.out.println("Reminder: "+ reminder);

        // relational operaters 
        // Equlity 
        boolean isEqual = (a==b);
        System.out.println("Is Equal: "+ isEqual);

        // not equlity 
        boolean isNotEqual = (a!=b);
        System.out.println("Is Not Equal: "+ isNotEqual);

         // less than 
        boolean lessThan = (a<b);
        System.out.println("Is Less then: "+ lessThan);
        
         // greater than 
        boolean greaterThan = (a>b);
        System.out.println("Is Greater Then: "+ greaterThan);

        
         // greater than or equal to
        boolean greaterThanEqualTo = (a<=b);
        System.out.println("Is Less  then or Equal to: "+ greaterThanEqualTo);
        
        
         // less than or equal to
        boolean lessThanEqualTo = (a<b);
        System.out.println("Is Less then or Equal to: "+ lessThanEqualTo);

        // (3) logical operator
                boolean c = true, d = false;
        
                // Logical AND
                boolean andResult = c && d;
                System.out.println("Logical AND: " + andResult);
        
                // Logical OR
                boolean orResult = c || d;
                System.out.println("Logical OR: " + orResult);
        
                // Logical NOT
                boolean notResult = !c;
                System.out.println("Logical NOT: " + notResult);
            }
        }
        

    

