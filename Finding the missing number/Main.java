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
		int found = 0;
		
		
		
		for(int i = 1 ; i<=arr.length ; i++){
			found = 0 ;
			for(int j = 0 ; j<arr.length ; j++){
			   if(arr[j]==i)
				   {
				   found  = 1;
				   }
			    }
			if(found == 0)
				System.out.println(i);
			}
		
    }
}