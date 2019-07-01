import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    // Type your code here
      Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      int x = n;
      int i = 1;
      while(n>9){
      n = n/10;
        i++;
      }
      
      System.out.println(n+(x%10));
      
	}
}