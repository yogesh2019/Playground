import java.util.Scanner;
class Main{
   public static void main (String[]args){
	  Scanner in = new Scanner(System.in);
	  int n = in.nextInt();
	  int arr[] = new int[n];
	  int arrn[] = new int [n];
	  for(int i = 0 ; i<arr.length ; i++){
		  arr[i]= in.nextInt();
	  }
	  int ind = 0;
	  for(int i = 0 ; i< arr.length ; i++){
		  if(arr[i]!=0)
			  {arrn[ind] = arr[i];
			  ind++;
			  }
	  }
	  for(int i = 0 ; i<arrn.length ; i++){
		  System.out.print(arrn[i]+" ");
	  }
	  
	}
}