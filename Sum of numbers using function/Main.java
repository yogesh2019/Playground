import java.util.Scanner;
class Main{
  public static int sum(int num){
    int sum1 = 0;
    int i = 1;
   while (i<=num){
   sum1 = sum1 + i;
     i++;
   }
    return sum1;
  
  }
	public static void main (String[] args){
	    // Type your code here
      Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      int sum = sum(n);
      System.out.print(sum);
	}
}