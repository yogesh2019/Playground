import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner in = new Scanner(System.in);
    int row_size = in.nextInt();
    int col_size = in.nextInt();
   int arr[][] = new int [row_size][col_size];
    int arr1 [][] = new int [row_size][col_size];
    for(int i = 0 ;i<arr.length ; i++)
    {
       for(int j = 0 ; j<arr.length; j++)
         arr[i][j] = in.nextInt();
    }
    for(int i = 0 ;i<arr.length ; i++)
    {
       for(int j = 0 ; j<arr.length; j++)
         arr1[i][j] = in.nextInt();
    }
    boolean check = true;
     for(int i = 0; i<row_size ;i++)
   { 
	   for(int j = 0 ; j<col_size; j++)
		   {
		   
		   if((arr[i][j] - arr1[i][j] )!=0)
			   check = false;
		   
		   }
   if(check == false)
	   break;
   }
    if(check)
   System.out.println("Yes");
    else
      System.out.println("No");
  }
}