public class arrayRelatedQuestion {
    public static void main(String[] args) {
        float []marks = {1.2f, 2.4f, 4.3f, 5.6f, 4.7f};
        float sum1 = 0f;
        float sum2 = 0f;
        for(int i = 0; i<marks.length; i++){
            sum1 = sum1 + marks[i];
        }
        System.out.println(sum1);

        System.out.println("second method");

        for(float element: marks){
            sum2 = sum2 + element;
        }
        System.out.println(sum2);


    // second question 
    // float checkNumber = 2.9f;
    // boolean ischeckNumber = false;
    //     for(float element: marks){
    //         if(checkNumber==element){
    //             ischeckNumber=true;
    //             break;
    //         }
    //     }
    //     if(ischeckNumber){
    //         System.out.println("match found ");
    //     }
    //     else{
    //         System.out.println("match not found");
    //     }
    //   }
        float checkNumber = 5.6f;
        boolean ischeckNumber = false;
      for(int i = 0; i<marks.length;i++){
        if(checkNumber==marks[i]){
            ischeckNumber = true;
            break;
        }
      }
      if(ischeckNumber){
        System.out.println("match fount");
      }
      else{
        System.out.println("match not found");
      }
 
        int []studentMarks = {23, 45, 65, 76, 87};
        int sum = 0;
        for(int i=0; i<studentMarks.length; i++){
          sum = sum + studentMarks[i];
        }
        System.out.println("Average Marks: "+ sum/studentMarks.length);
}
}