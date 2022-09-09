package neww;

import java.util.*;
public class marks {

    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int marks=sc.nextInt();
        if(marks<50)
        {
            System.out.println("fail");
        }
        else if(marks>=51&&marks<=60)
        {
            System.out.println("third class");
        }
        else if(marks>=61&&marks<=70)
        {
          System.out.println("second class");  
        }
        else 
        {
            System.out.println("first class");
        }
        
    }
    
}
