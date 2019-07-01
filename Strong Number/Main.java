import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      int k = n;
      int r = 0;
      int s = 1;
      int sum = 0;
      int fac = 1;
      
      
    while (n>0){
    	s = n%10;
    	fac = 1;
    		while (s>0){
    			fac = fac *s;
    			s--;
    		}
    		
    	sum = fac + sum;
    	
    	n = n/10;
    }
      if (sum ==k)
    System.out.println("Yes");
      else
        System.out.println("No");
      
     
	}
}