import java.util.Scanner;
class Main { 
	public static void main(String[] args){
  		
  		// Type your code here
      Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int sum= 1;
		for (int col_row = 1; col_row <= n; col_row++){
			
		  for(int col_col = 1; col_col<=col_row; col_col++){
			  if (sum%2 ==1)
			  System.out.print("*");
			  else
			  System.out.print("#");
			  sum = sum + 1;
			  
			  }
		System.out.print("\n");
		}
    }
}