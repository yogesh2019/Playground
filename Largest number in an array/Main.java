import java.util.Scanner;
class Main{
    public static void main(String[]args)
		{
		Scanner in = new Scanner(System.in);
		int arr_size = in.nextInt();
		int arr[] = new int[arr_size];
		int sum = 0;
		
		for (int idx = 0; idx < arr_size ; idx++){
			 arr[idx] = in.nextInt();
		}
		for (int idx = 0; idx < arr_size ; idx ++){
			sum = 0;
			for (int id = 0 ; id <arr_size ; id++){
				
				if (arr[idx]>=arr[id])
					sum++;
			}
			if (sum == arr_size)
				System.out.println(arr[idx]);
		}
		
		 
		  }
}