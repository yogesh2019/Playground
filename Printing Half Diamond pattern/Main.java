import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    // Type your code here
      Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		for (int col_row = 1; col_row <= n; col_row++){
			
			for (int col_col = 1; col_col<= n-col_row; col_col++){
				  System.out.print(" ");
			  }
			  for (int space = 1; space <= col_row;space++)
			  {
				  System.out.print("*");
			  }
			  for (int col_col1 = 1; col_col1 <= (col_row-1) ;col_col1++)
			  {
				  System.out.print("*");
			  }
			  for (int space1 = 1; space1 <= n - (col_row-1) ; space1++ )
			  {
				  System.out.print(" ");
			  }
			  
			  
			  System.out.print("\n");
		
		}
}}