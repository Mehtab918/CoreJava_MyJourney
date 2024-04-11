public class conditionalStatement {
    
    public static void main(String[] args) {
        
        int x = 28;

        // if(true)
        // System.out.println("Hello");

        // if(false)
        // System.out.println("it will not print...");

        //comparing two values...
        if(x>10 && x<=20)
        System.out.println("Hello");
        else
        System.out.println("bye");
        //Vote example
        int age = 52;
        if(age>=18)  // if only one statement no need to write curly braces. for more than one please use curly braces.
        {
            System.out.println(age);
            System.out.println("Hello you r eligible for vote...");
        }
        else{
            System.out.println("sorry you r not eligible for vote");
            System.out.println(" try next year ....Bye");
        }
        
        //comparing three values...
        int m = 10;
        int  n = 20; 
        int p= 30;

        if(m>n && n<p && p<m)  // f && T && f  - f 
        System.out.println("if it is true then , this line will print");

        //comparing three values 
        if(m>n && m>p)
        {
            System.out.println("m is greater");
        }
        else if (n>p) {
            System.out.println("n is greater");
        }
        else
        System.out.println("p is greater");


        // converting the if - else condition into trinary operator

       String voterMessage = (age>=18)? "You r eligible for Voting." : "Sorry try next year...";
       System.out.println(voterMessage);
}
}