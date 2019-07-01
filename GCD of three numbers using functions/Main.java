import java.util.Scanner;
public class Main{
	public static void main(String[]args)
		{
		//Try out your code here
		  Scanner in = new Scanner(System.in);
		  int a = in.nextInt();
		  int b = in.nextInt();
		  int c = in.nextInt();
		  int min = min(a,b,c);
		  for (int i = min ; i >= 1 ; i--){
		  if (a % i == 0 && b % i == 0 && c % i == 0)
		  {System.out.print(i);
		  break;}
		    }
		  
		    

		}
		  public static int min (int a , int b, int c){
		    
		  if (a<b)
			  if (a<c)
		    return a;
			  else 
				  return c;
		    else
		      if (b<c)
		    	return b;
		      else 
		    	  return c;
		  }
}