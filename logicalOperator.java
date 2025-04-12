

public class logicalOperator {
    
    public static void main(String[] args) {
        
        int x = 7;
        int y = 6;

        int a = 8;
        int b = 9;

        boolean result = (x>y && a<b);

        System.out.println(result);

        boolean result1 = (x>y || a>b || a<4); //  true || false || false 
        System.out.println(result1);

    }
}
 