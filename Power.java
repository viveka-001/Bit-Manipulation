import java.util.*;

public class Power{

    public static void main(String args[]){
    
        Scanner sc=new Scanner(System.in);

        int base=sc.nextInt();

        int power=sc.nextInt();

        int a=1;

        while(power>0){
        
            if(power%2==1){
            
                a=a*base;
            }

            base=base*base;

            power/=2;

        }

        System.out.print(a);
    }
    
}