import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int sum = 0;
		for (int col_row = 1 ; col_row<= n ; col_row++)
			System.out.print("*");
		System.out.print("\n");
		for (int col_row = 1; col_row <= n-2 ; col_row++)
		{
			System.out.print("*");
			for (int col_col = 1; col_col <= n-2 ; col_col++)
				System.out.print(" ");
			System.out.print("*");
			System.out.print("\n");
		}
		for (int col_row = 1 ; col_row<= n ; col_row++)
			System.out.print("*");
		System.out.print("\n");
	}
}