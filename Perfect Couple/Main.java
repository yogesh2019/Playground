import java.util.Scanner;
class Main{
    public static void main(String args[]) {
     Scanner in = new Scanner(System.in);
	  int n = in.nextInt();
	  int arr[] = new int[n];
	  for(int i = 0 ; i<arr.length ; i++ ){
		  arr[i] =  in.nextInt();
	  }
	  int value = in.nextInt();
	  for(int i = 0 ; i<arr.length-2 ; i++){
		  
		  for(int j = i+1 ; j<arr.length ; j++){
			  if(arr[i]+arr[j]==value)
				  System.out.print(arr[i]+", "+arr[j]+"\n");
            
		  }
		  
	  }
	
	  
    }
}