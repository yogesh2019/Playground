import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      Scanner in = new Scanner(System.in);
       int n = in.nextInt();
       System.out.println(2);
       int i ;
       for ( i = 3 ; i <= n ; i++){
    	   
    	   for (int x = 2 ; x < i && i%x != 0 ; x++)
    		if (x == i-1)
        	   System.out.println(i); 
       }
       
  
  }
}