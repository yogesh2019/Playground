import java.util.Scanner;
class Main{
	
     public static void main(String[]args)
		{
		//Try out your code here
		  Scanner in = new Scanner(System.in);
		  int a = in.nextInt();
		  int b = in.nextInt();
		  int c = in.nextInt();
		  int max = max(a,b,c);
		  System.out.print(max);
		  
		  
		    

		}
		  public static int max (int a , int b, int c){
		    
		  if (a>b)
			  if (a>c)
		    return a;
			  else 
				  return c;
		    else
		      if (b>c)
		    	return b;
		      else 
		    	  return c;
		  }
}