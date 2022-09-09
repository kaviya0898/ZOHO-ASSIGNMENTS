import java.math.BigInteger;

public class chess {

    public static void main(String[] args) {
        BigInteger start=new BigInteger("1");
        BigInteger multiply=new BigInteger("2");
        int box=64;
        while(box!=0)
        {
            start=multiply.multiply(start);
            box--;
            
        }
        System.out.println(start);
    }
    
}
