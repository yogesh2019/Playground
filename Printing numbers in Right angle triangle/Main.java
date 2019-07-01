import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      Scanner in = new Scanner(System.in);
		int n = in.nextInt();
	
		for (int col_row = 1; col_row <= n; col_row++){
			
		  for(int col_col = 1; col_col<=col_row; col_col++){
			  System.out.print(col_row);
			  
			  }
		System.out.print("\n");
		}
	}
}