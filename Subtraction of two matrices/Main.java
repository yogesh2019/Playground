import java.util.Scanner;
class Main{ 
  public static void main(String args[]) 
  { 
     Scanner in = new Scanner(System.in);
	 int row_size = in.nextInt();
	 int col_size = in.nextInt();
	 int arr[][] = new int[row_size][col_size];
	 int arr1 [][] = new int [row_size][col_size];
	 int sum[][] = new int [row_size][col_size];
	 for(int i = 0 ; i<row_size ; i++)
	 {
		 for(int j = 0 ; j<col_size ; j++)
		 {
			 arr[i][j] = in.nextInt();
			 
		 }
	 }
	 for(int i = 0 ; i<row_size ; i++)
	 {
		 for(int j = 0 ; j<col_size ; j++)
		 {
			 
			 arr1[i][j] = in.nextInt();
		 }
		
	 }
	 for(int i = 0 ; i<row_size ; i++)
	 {
		 for(int j = 0 ; j<col_size ; j++)
		 {
			 
		sum[i][j] = arr[i][j] - arr1[i][j];
		 }
		
	 }
	 for(int i = 0 ; i<row_size ; i++)
	 {
		 for(int j = 0 ; j<col_size ; j++)
		 {
			 
		System.out.print(sum[i][j]+" ");
		 }
       System.out.println();
		
	 }
  }
}