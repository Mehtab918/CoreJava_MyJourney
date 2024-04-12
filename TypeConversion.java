public class TypeConversion {
    
    //Conversion - automtic casting
    //casting - casting explicitly.
    public static void main(String[] args) {
        
        byte b1 = 127;
        System.out.println(b1);

        // beyond the size.....
        //byte b2 = 267;
        //System.out.println(b2); 

        byte b = 123;
         int a = b ; // b value is assigned to a ;

         System.out.println(a);

         //not possible bcz large size value cannot fit it in small. so type cast
         //byte k = a ; incompatible lossy conversion
         byte k = (byte)a ;

         System.out.println(k);
         
         float f = 5.6f;
         int t = (int)f;  // after type casting we will loss .6
        System.out.println(t);

        System.out.println("-----Type promotion-----");
        // WE ARE PERFORMINNG MULTIPLICATION 2 BYTES VALUE - JAVA IS PROMOTING THE TYPES.
        byte byte1= 10;
        byte byte2 = 20;

        int result = byte1 * byte2;
        System.out.println(result);


    }
}
