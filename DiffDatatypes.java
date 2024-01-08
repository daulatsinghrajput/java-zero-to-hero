public class DiffDatatypes {
        public static void main(String[] args) {
            // primitive data types
            //(a) integer data type
            byte smallNumber = 123; // 8 bit signed
            short shortNumber = 12339; // 16 bit signed
            int intNumber = 1233434353; // 32 bit signed
            long longNumber = 12435435546541435L;  // 64 bit signed
    
            // print integer value
            System.out.println(smallNumber);
            System.out.println(shortNumber);
            System.out.println(intNumber);
            System.out.println(longNumber);

            // (b) float datatype
            float floatNumber = 3.14f;
            double doubleNumber = 3.14;
            System.out.println(floatNumber);
            System.out.println(doubleNumber);

            // (c) character datatype
            char charName = 'A';
            System.out.println(charName);

            // (d) boolean datatype 
            boolean flag = true;
            System.out.println(flag);

            // referenca data type 

            // (a) string
            String greeting = "hello i am daulat";
            System.out.println(greeting);

            // (b) array 
            int[] marks = {100, 12, 23, 54, 76, 87, 99};
            
            System.out.println(marks[4]);
            for (int num : marks){
                System.out.println(num);
            }
        }
        
    }
    

