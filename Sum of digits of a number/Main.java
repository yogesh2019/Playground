import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    // Type your code here
      Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      
      int i = 1;
      int y = 0;
      int sum= 0;
      while(n>0){
         y = n%10;
        sum = sum+ y;
      n = n/10;
        i++;
      
        
      }
      
      System.out.println(sum);}}
