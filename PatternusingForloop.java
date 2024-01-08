public class PatternusingForloop {
    public static void main(String[] args){
        int n = 4;
        int m = 5;
        for(int i = 1; i<5; i++){
            for(int j=1; j<6; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int a =1; a<=n; a++){
            for(int b=1; b<=m; b++){
                if(a==1 || b==1 || a==n || b==m){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
                System.out.println();
            }
        for(int i = 1; i<=4; i++){
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i = 1; i<=4;i++){
            for(int j=1; j<5-i; j++){
                System.out.print("*");
            }
            System.out.println();
        }    
          for(int i = 4; i>=1;i--){
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }    

        for(int i = 1; i<=4; i++){
            for(int j=1; j<=4-i; j++){
                System.out.print(" ");
            }
            for(int j = 1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        for(int i=1; i<=4; i++){
            for(int j=1; j<=i; j++){
            System.out.print(j);
            }
            for(int j=1; j<=4-i; j++){
                System.out.print(" ");
            }
            System.out.println();
        }

        for(int i = 1; i<=5; i++){
            for(int j = 1; j<=6-i; j++){
                System.out.print(j);
            }
            for(int j=1; j<=1-i; j++){
                System.out.print(" ");
            }
            System.out.println();
        }

        int p =1;
        for(int i = 1; i<=5; i++){
            for(int j = 1; j<=i; j++){
                System.out.print(p+" ");
                p++;
            }
            System.out.println();
        }

        for(int i=1; i<=5; i++){
            for(int j=1; j<=i; j++){
                if((i+j)%2!=0){
                    System.out.print("1 ");
                }
                else{
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
    }
}
