public class array {
    public static void main(String[] args) {
        int []marks =  new int[5];
        marks[0] = 54;
        marks[1] = 52;
        marks[2] = 53;
        marks[3] = 58;
        marks[4] = 56;
        System.out.println(marks[4]);

        int []rollNumber = {23, 45, 65, 76, 56};
        System.out.println(rollNumber.length);
        System.out.println("using for loop");
        // for printing complete array 
        for(int i = 0; i<rollNumber.length;i++){
            System.out.println(rollNumber[i]);
        }
        System.out.println("print reverse array");
        // reverse order 
        for(int i=rollNumber.length-1; i>=0; i--){
            System.out.println(rollNumber[i]);
        }
        System.out.println("using for-each loop");
        // new method (for-each loop)
        for(int element: rollNumber){
            System.out.println(element);
        }



        String []student = {"daulat", "dileep", "vikash", "mayank", "kuldeep"};
        System.out.println(student.length);

        // for printing all array 
        System.out.println(student[0]);
        System.out.println(student[1]);
        System.out.println(student[2]);
        System.out.println(student[3]);
        System.out.println(student[4]);


        int []name;
        name = new int[2];
        name[0] = 23;
        name[1] =  45;
        System.out.println(name[0]);
        
    }    
}
