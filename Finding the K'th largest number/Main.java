import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
      Scanner in = new Scanner(System.in);
		int size = in.nextInt();
		int arr[] = new int[size];
		
		for(int i = 0 ; i<arr.length ; i++){
			arr[i] = in.nextInt();
			
		}
		int k = in.nextInt();
		for(int i = 0 ; i<arr.length ; i++){
			for(int j=i ;j<arr.length ; j++){
				if(arr[i]>arr[j])
				{int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;}
			}
		}
		
	    int l = arr.length-k;
		System.out.println(arr[l]);
    }   
}