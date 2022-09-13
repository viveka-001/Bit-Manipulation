package MathAlgorithm;
import java.util.*;

public class AllPrimes{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n<2)
        {
            System.out.print("NO PRIME NUMBERS");
        }
        else{
            boolean prime[]=new boolean[n+1];
            Arrays.fill(prime,true);
            for(int i=2;i*i<n;i++)
            {
                if(prime[i])
                {
                    for(int j=i*i;j<=n;j+=i)
                    {
                        prime[j]=false;
                    }
                }
            }

            for(int i=1;i<=n;i++)
            {
                if(prime[i])
                {
                    System.out.print(i+" ");
                }
            }
        }
    }
    
}