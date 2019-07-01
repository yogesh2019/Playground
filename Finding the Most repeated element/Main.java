import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner in = new Scanner(System.in);
	int size = in.nextInt();
	int arr[] = new int[size];
	for(int i = 0 ; i<arr.length ; i++){
		arr[i] = in.nextInt();
	}
	int arr1[] = new int[size];
	for(int i = 0 ; i<arr.length  ; i++){
		for(int j = 0 ; j<arr.length ; j++)
		{
			if(arr[i] == arr[j])
				arr1[i]++;
		}
	}
	int max = 0 ;
	int ind = 0;
	for(int i = 0 ; i<arr1.length ; i++)
		{if(arr1[i]>max)
			{max = arr1[i];
			ind =i;
			}
		
		}
	System.out.println(arr[ind]);  
  }
}