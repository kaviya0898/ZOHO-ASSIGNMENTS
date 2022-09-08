
package javaapplication22;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author hp
 */
public class JavaApplication22 {

    public static boolean square(int num)
{
    double number=Math.sqrt(num);
    if(number-Math.floor(number)==0)
    {
        return true;
    }
    return false;
}
public static boolean multiple(int num)
{
    if(num%4==0&&num%6==0)
        return true;
    else
        return false;
    
}
public static boolean even (int num)
{
    if(num%2==0)
        return true;
    return false;
}
    public static void main(String[] args) {
         int arr[]={49,36,8,10,12};
        
        int temp=0;
       
        for(int num:arr)
        {
            temp=0;
           if(square(num))
           {
               temp+=5;
           }
           if(multiple(num))
           {
               temp+=4;
           }
           if(even(num))
           {
               temp+=3;
           }
           
           System.out.println(num+" "+temp);
        }
       
            }
    
}

    
    

