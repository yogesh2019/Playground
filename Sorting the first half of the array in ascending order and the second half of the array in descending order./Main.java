import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner in = new Scanner(System.in);
		 int size  = in.nextInt();
		 int arr[] = new int[size];
		 for(int i = 0 ; i<arr.length ; i++){
			 arr[i] = in.nextInt();
			 
		 }
		 int limit = (size/2)-1 ;
		 for(int i = 1 ; i<arr.length ; i++)
		 {
			 if(i<=limit){
				 for(int k = 0 ; k<i ; k++){
				 if(arr[k]>arr[k+1])
				 {
					 int temp = arr[k];
					 arr[k] = arr[k+1];
					 arr[k+1] = temp;
				 }
			 }
			 }
			 
			 else {
				 for(int k = limit+1 ; k<i ; k++){
				 if(arr[k]<arr[k+1])
				 {
					 int temp = arr[k];
					 arr[k] = arr[k+1];
					 arr[k+1] = temp;
				 }
			 }
			 }
			 
		 }
    for(int k = 0 ; k<arr.length ;k++){
				 System.out.print(arr[k]+" ");
			 }
			 
  }
}