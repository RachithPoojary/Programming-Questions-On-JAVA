//wap to find factorial of a number using BigInteger
import java.math.BigInteger;
class  usingBigInteger
{
    public static void main(String[] args)
    {
        int n=100;
        BigInteger fact= BigInteger.valueOf(1);
        System.out.println(fact);
        for(int i=1;i<=n;i++)
        {
            BigInteger x=BigInteger.valueOf(i);
            fact = fact.multiply(x);
        }

        System.out.println(fact);
    }
}