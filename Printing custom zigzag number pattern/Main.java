import java.util.Scanner;
class Main{
	public static void main (String[] args){
	   // Type your code here
      Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int sum = 0;
		for (int col_row = 1 ; col_row<= n ; col_row++)
		    {
			if (col_row%2 == 0){
				for (int col_col = 1 ; col_col <= n ;col_col++){
					if (col_col == 1) 
					 System.out.print(col_row+1);
					else 
						System.out.print(col_row);
				}}
				else
				{
					for (int col_col = 1 ; col_col <= n ;col_col++){
						if (col_col == n) 
						 System.out.print(col_row+1);
						else 
							System.out.print(col_row);
				}
			}
			System.out.print("\n");
		    }

	}
}