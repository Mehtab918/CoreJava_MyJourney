package Obj;

import java.util.Scanner;

class Father {
    public String property = "50 crore";

    void gold() {
        System.out.println("10kg gold");
    }

    void marryWithSubhaLaxmi(boolean yes) {
    	
    	if(yes)
    	{
    		System.out.println("nice to hear you , now you will get:");
    		System.out.println(this.property);
            this.gold(); // calling another method using 'this'
    	}
    	else
    	{
    		System.out.println("you will not get anything if you marry with your own choice.");
    		System.out.println("you will not get :" + this.property + "or gold");
          
    	}
    	
    }
}

class Son extends Father {
    void boySays() {
    	Scanner sc = new Scanner(System.in);
    	System.out.println("Enter your decision :");
    	boolean decision = sc.nextBoolean();
    	System.out.println("Let me decide first:"); 
    	if(decision)
    	{
    	System.out.println("Yes, I will marry Subhalaxmi.");
    	this.marryWithSubhaLaxmi(true);
    	}
    	else
    	{
    		System.out.println("No i not marry with your choice.");
    		this.marryWithSubhaLaxmi(false);
    	}
    	 
        
    }
}

public class ThisKeywordConcept {
    public static void main(String[] args) {
        Son son = new Son();
        
        son.boySays();
    }
}
