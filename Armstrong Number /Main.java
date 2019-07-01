import java.util.Scanner;
class Main{
	public static void main (String[] args){
	   // Type your code here
      Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      int r = n;
      int k = n;
      int i = 0 ;
      while (n>0){
      n = n/10;
        
        i++;
      }
    
      double sum = 0;
  int q = 0;
      while (r>0){
        
    	  q = r%10;
    	  r = r/10;
         
        
        
        sum = sum + Math.pow(q,i);
      }
      if (k==sum)
  System.out.println("Armstrong Number");
      else
        System.out.println("Not a Armstrong Number");
}}