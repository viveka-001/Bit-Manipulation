import java.util.*;
import java.lang.*;

public class Prime{
    public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    for(int i=2;(i*i)<n;i++)
    {
        if(n%i==0)//if there is any factor;
        {
            System.out.print("NOT A PRIME NUMBER");
            System.exit(0);
        }
    }
    System.out.print("PRIME NUMBER");
    }

    
}