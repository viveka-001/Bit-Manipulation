import java.util.*;

public class catalan{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        long arr[]=new long[n+2];   

        arr[0]=1;        
        arr[1]=1;     
        for(int i=2;i<n+1;i++)
        {
            for(int j=0;j<i;j++)
            {
                arr[i]+=arr[j]*arr[i-j-1];
            }
        }
        System.out.println(arr[n]);
    }
    
}