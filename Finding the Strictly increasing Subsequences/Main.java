import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner in = new Scanner(System.in);
    int arr_size = in.nextInt();
    int arr[] = new int[arr_size];
    for(int i = 0 ; i<arr_size ; i++)
       arr[i] = in.nextInt();
		
		
		
			for(int j = 0 ; j<arr.length-1 ; j++)
			{
				for(int k = j+1 ; k<arr.length ; k++)
					{
					
				    if(arr[k]>arr[j])
				    {
				    	if(arr[k]>arr[k-1])
					System.out.println(arr[j]+","+arr[k]+" ");
				    }
					}
				
			}
  }
}