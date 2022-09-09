
import java.util.*;


public class Prime{

   public static void main (String[] args){
   		
       int n=sc.nextInt();

       for (int i = 1; i <= n; i++){         
       		  	  
          int c=0;
 	  
          for(int num =i; num>=1; num--){
	  
             if(i%num==0){
	     
 		c=+1;;

	     }

	  }

	  if (c==2){
	  
	     prime= prime + i + " ";
	  }
	
       }
	
       System.out.println(prime);
   }
}