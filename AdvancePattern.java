public class AdvancePattern {
    public static void main(String[] args){

        for(int i = 1; i<=4; i++){
                for(int j=1; j<=i; j++){
                    System.out.print("*");
                }
                for(int j=1; j<=8-(2*i); j++){
                    System.out.print(" ");
                }
                for(int j=1; j<=i; j++){
                    System.out.print("*");
                }
                System.out.println();
        }
           for(int i = 4; i>=1; i--){
                for(int j=1; j<=i; j++){
                    System.out.print("*");
                }
                for(int j=1; j<=8-(2*i); j++){
                    System.out.print(" ");
                }
                for(int j=1; j<=i; j++){
                    System.out.print("*");
                }
                System.out.println();
        }
        System.out.println("hey");


         for(int i = 1; i<=8; i++){
               if(i<=4){
                 for(int j=1; j<=i; j++){
                    System.out.print("*");
                }
                for(int j=1; j<=8-(2*i); j++){
                    System.out.print(" ");
                }
                for(int j=1; j<=i; j++){
                    System.out.print("*");
                }
               }
               else{
                for(int j=1; j<=9-i; j++){
                    System.out.print("*");
                }
                for(int j=1; j<=(2*i)-10; j++){
                    System.out.print(" ");
                }
                for(int j=1; j<=9-i; j++){
                    System.out.print("*");
                }
            }
                System.out.println();
        }
        for(int i = 1; i<=5; i++){
            for(int j = 1; j<=5-i; j++){
                System.out.print(" ");
            }
            for(int j = 1; j<=5; j++){
                System.out.print("* ");
            }
            System.out.println();
        }

        for(int i = 1; i<=5; i++){
            for(int j=1; j<=5-i; j++){
                System.out.print(" ");
            }
            for(int j=1; j<=i; j++){
                System.out.print(i+" ");
            }
            System.out.println();
        }

        for(int i = 1; i<=5; i++){
            for(int j=1; j<=5-i; j++){
                System.out.print(" "+" ");
            }
            for(int j=i; j>=1; j--){
                System.out.print(j+" ");
            }
            for(int j=2; j<=i; j++){
                System.out.print(j+" ");
                
            }
            System.out.println();
        }

        for(int i=1; i<=5; i++){
            for(int j =1; j<=5-i; j++){
                System.out.print(" "+" ");
            }
            for(int j =1; j<=2*i-1; j++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }
        for(int i=4; i>=1; i--){
            for(int j =1; j<=5-i; j++){
                System.out.print(" "+" ");
            }
            for(int j =1; j<=2*i-1; j++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    
    }
    }
    