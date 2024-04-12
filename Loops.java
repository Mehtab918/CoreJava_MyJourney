public class Loops {
    
    
    public static void main(String[] args) {
        
        // loop - while , do while , for 
    
        // repeatitive action = loop 
        // do something till the condition is true.
        
          int x = 1;
          while(x<=6) 
          {
          System.out.println("hi :" +x);

          // nested while loop
          // every time HI - i need to print Hello 3 times 
          int y=1;
         while(y<=3)
         {
            System.out.println("Hello :" + y);
            y++;
         }



          x++;
          // so while loop will execute the condition until the condition is true. once it is false it wont execute.
            
          

          }
    
        }
    }