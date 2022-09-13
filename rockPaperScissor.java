import java.util.Random;
import java.util.*;

public class rockPaperScissor {

    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
       String[] choice={"rock","paper","scissor"};
        Random r=new Random();
        String computerChoice=choice[new Random().nextInt(choice.length)];
        System.out.println("welcome to the game:");
        System.out.println("what do u want rock or paper or scissor?");
        String playerChoice=sc.next();
        System.out.println("computerChoice is:"+computerChoice);
        if(playerChoice.equals(computerChoice))
        {
            System.out.println("oops soory it is a tie");
        }
        else if(playerChoice.equals("rock"))
        {
           if(computerChoice.equals("paper"))
           {
               System.out.println("computer wins");
           }
           else if(computerChoice.equals("scissor"))
           {
              System.out.println("you win");  
           }
        }
        
        else if(playerChoice.equals("scissor"))
        {
           if(computerChoice.equals("rock"))
           {
               System.out.println("computer wins");
           }
           else if(computerChoice.equals("paperr"))
           {
              System.out.println("you win");  
           }
        }
        
        else if(playerChoice.equals("paper"))
        {
           if(computerChoice.equals("scissor"))
           {
               System.out.println("computer wins");
           }
           else if(computerChoice.equals("rock"))
           {
              System.out.println("you win");  
           }
        }
        
    
}
}