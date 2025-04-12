package datatypes;

//Find the output of the following program.

public class Solution1{
       public static void main(String[] args){
                     short x = 10;
                 //    x =  x * 5;  if we do comment out . it will give error.
                     System.out.print(x);
       }
}

/*
 * here we are using multiplication sign which is arithmetic operation .
 * 5 is integer literal so become integer. 
 * so the value will be integer.  and x is short . to make the new value short accepted
 * need to do narrowing typecasting.  
 * 
 * x = (short) x * 5 ;
 * 
 * */
