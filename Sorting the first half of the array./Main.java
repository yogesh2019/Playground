import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
   Scanner in =new Scanner(System.in);
		    int size = in.nextInt();
		    int arr[] = new int[size];
		    for(int i = 0 ; i<arr.length ; i++){
		    	
		    	arr[i] = in.nextInt();
		    	
		    	}
		    int count = 1 ;
		    int size2 = (size-2)/2;
		    
		    for(int i = 1  ; i<=size2; i++){
		    	int key = arr[i];
		    	int idx2 = i-1;
		    	while( idx2>=0 && key<arr[idx2]){
		    		arr[idx2+1] =arr[idx2]; 
		    		idx2--;
		    		
		    		
		    	}
		    	arr[idx2+1] = key;
		    	
		    }
		    for(int i = 0 ; i<arr.length ; i++)
		    	System.out.print(arr[i]+" ");
  }
}