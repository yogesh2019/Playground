import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
     Scanner in = new Scanner(System.in);
    int row_size = in.nextInt();
    int col_size = in.nextInt();
    int arr[][]= new int [row_size][col_size];
    for(int i = 0 ; i<arr.length; i++)
    {
      for(int j = 0 ; j<arr.length ; j++)
      {
         arr[i][j] = in.nextInt();
      }
    }
    for(int i = col_size-1; i>= 0 ;i--)
   { 
	   for(int j = 0 ; j<row_size; j++)
		   System.out.print( arr[j][i]+" " );
   System.out.println();
   }
    
  }
}