public class ControlStatement {
    public static void main(String[] args){
        // if else
        int num = 0;
        if(num>0){
            System.out.println("positive");
        }
        else if(num<0){
            System.out.println("negative");
        }
        else{
            System.out.println("zero");
        }
        //switch
        int dayOfWeek = 2;
        String dayName;
        switch (dayOfWeek){
            case 1:
            dayName = "monday";
            break;
            case 2:
            dayName = "tuesday";
            break;
            case 3:
            dayName = "wednesday";
            break;
            case 4:
            dayName = "thursday";
            break;
            case 5:
            dayName = "friday";
            break;
            case 6:
            dayName = "satruday";
            break;
            case 7:
            dayName = "sunday";
            break;
            default:
            dayName = "invalid day";
        }
    {
         System.out.println("Day is: "+ dayName);
        }



    // for loop
    
    for(int i=1; i<=5; i++ ){
        System.out.println(i);
    }

    //while loop
    int f = 1;
    while(f<5){
        System.out.println(f);
        f++;
    }

    // do while loop
    int p = 1;
    do{
        System.out.println(p);
        p++;
    }while(p<8);
}
}

        
    
