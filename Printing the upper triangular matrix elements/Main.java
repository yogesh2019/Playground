import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
   Scanner in = new Scanner(System.in);
    int row_size = in.nextInt();
    int col_size = in.nextInt();
    int arr[][] = new int [row_size][col_size];
    for(int i = 0 ; i <arr.length ; i++)
    {
      for(int j = 0 ; j<arr[i].length ; j++)
      {
         arr[i][j] = in.nextInt();
      }
    }

   
   
   for(int i = 0 ; i<arr.length;i++)
   { 
	   for(int j = 0 ; i+j<arr.length; j++)
       {  System.out.print( arr[0+j][i+j] );
   System.out.print(" ");}
   }
  }
}