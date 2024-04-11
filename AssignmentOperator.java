public class AssignmentOperator {
    
    public static void main(String[] args) {
        
        int num1 = 27 ;
        int num2 = 3;

        int result = num1 / num2;
        System.out.println(result);

        //remainder -> modulus operator 

        int num3 = 33;
        int num4 = 3;

        int mod = num3 % num4;
        System.out.println(mod);

        // increment operator ->   -- , ++

        //shorthand
        // num1 += 1;
        // System.out.println(num1);

        //shortcut 
        num1++; // operation after increment -> post increment
        num3--;
        System.out.println(num1);
        System.out.println(num3);

        ++num1;  // operation before increment -> pre increment 
        // this two operation will behave differently when we FETCH the values.
        System.out.println("--------------------");
        int a = 10;
        int b = 5;
        int result1 = ++a;  //pre increment -> first increment then fetch the value 
        System.out.println(result1);  // 11

        int result2 = b++; //post increment ->  first fetch the value then increment
        System.out.println(result2);   //5 // next time if you fetch u willl receive 6 
        System.out.println(b);

        //decrement operators 
        int c = 20;
        int d = 10;

        int result3 = c--;  // post decrement ->  fetch the value and then decrement
        int result4 = --d; // pre decrement -> decrement the value and then fetch.

        System.out.println(result3); // 20 -> next time if you try to fetch it will give you 19 . 
        System.out.println(result4); // 9 -> now the value of d is 9 .

    }
}
