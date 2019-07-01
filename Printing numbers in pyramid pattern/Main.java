import java.util.Scanner;
class Main{
	public static void main (String[] args){
    	// Type your code here
      Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int sum = 0;
		for (int col_row = 1; col_row <= n; col_row++){
			for(int space = 1; space<= n -col_row ; space++)
			{
				System.out.print(" ");
			}
			for (int col_col =1; col_col<= col_row; col_col++){
				
				sum ++;
				System.out.print(sum+" ");
				  
			  }
			
			  
			  
			  
			  
			  System.out.print("\n");
		
		}

    }    
}