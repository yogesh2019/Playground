import java.util.Scanner;
class Main {
	public static void main (String[] args) {
		// Type your code here
      Scanner in = new Scanner(System.in);
      int n1 = in.nextInt();
      int n2 = n1%100;
      int n3 = n2/10;
      System.out.println(n3);
      
	}
}