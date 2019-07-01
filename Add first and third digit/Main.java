import java.util.Scanner;
class Main{
	public static void main (String[] args) {
      Scanner in = new Scanner(System.in);
      int n1 = in.nextInt();
      int n2 = n1/100;
      int n3 = n1%10;
      int sum = n2+ n3;
      System.out.println(sum);
		// Type your code here
	}
}