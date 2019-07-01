import java.util.Scanner;
class Main{
  public static void main(String args[]){
    Scanner in = new Scanner(System.in);
    int row_size = in.nextInt();
    int col_size = in.nextInt();
    int arr[][] = new int[row_size][col_size];
    int tran[][] = new int[col_size][row_size];
    for(int i = 0 ; i<row_size ; i++)
    {
      for(int j = 0 ; j<col_size ; j++)
      {
         arr[i][j] = in.nextInt();
      }
    }
	 for(int i = 0 ; i<col_size ; i++)
	 {
		 for(int j = 0 ;j<row_size; j++)
		 {
			 tran[i][j] = arr[j][i];
			 System.out.print(tran[i][j]+" ");
		 }
		 System.out.println();
	 }
  }
}