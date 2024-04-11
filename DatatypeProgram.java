public class DatatypeProgram {
    
    public static void main(String[] args) {
        //byte range from -127 to 127
        //error: incompatible types: possible lossy conversion from int to byte
        // byte b = 128;
        byte b = 127;   // byte rangke from -127 to 127 only .
        System.out.println(b);

        short s = 12;
        System.out.println(s);

        int id = 1212;
        System.out.println(id);

        long phoneno = 9182931232L;
        System.out.println(phoneno);

        //for making it float value , add f at last.
        float marks = 560.34f;
        System.out.println(marks);

        // by default java supports double value .
        double salary = 560.34;
        System.out.println(salary);

        boolean answer = false;
        System.out.println(answer);

        //adding two float number ... 
        float f1 = 212.22f;
        float f2 = 221.32f;
        double result = f1+f2;
        System.out.println(result);

        char c = 'a';
        System.out.println(c);



    }
}
