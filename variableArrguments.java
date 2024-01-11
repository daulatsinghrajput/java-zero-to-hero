public class variableArrguments {

     static int sum(int ...arr){ // argument become an array
        int result=0;
        for(int a : arr){ // add all number 
            result = result+a; 
        }
        return result;
    }
   public static void main(String[] args) {
    System.out.println("the sum of 2 and 3 is: "+ sum(2, 3));
    System.out.println("the sum of 2,3 and 5 is: "+ sum(2, 3, 5));
    System.out.println("the sum of 2, 3, 5, and 76 is: "+ sum(2, 3, 5, 76));
    System.out.println("the sum of 2, 3, 5 and 34, 23, 4 is: "+ sum(2, 3, 5, 34, 23, 4));
    System.out.println("the sum of nothing is: "+ sum());
    System.out.println("the sum of 2, 3, 5, 7, 9, 0, 54 and 3 is: "+ sum(2, 3, 5, 7, 9, 0, 54, 3));
   }
        
    
}
