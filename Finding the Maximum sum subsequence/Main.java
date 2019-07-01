import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    	Scanner in = new Scanner(System.in);
		int size = in.nextInt();
	   int arr[]  = new int[size];
	   for(int i = 0 ;i<arr.length ; i++){
		   arr[i] = in.nextInt(); 
	   }
	   int seq[] = new int[2*size];
	   int start_idx = 0 ;
	   int seq_idx = 0 ;
	   
	   
	   // increasing the index of the initial assignments
	   for(int i = 0 ;i<arr.length-1 ; i++){
		   
		   if(arr[i]>arr[i+1])
			   {
			   
			   seq[seq_idx]= start_idx;
			   seq_idx++;
			   seq[seq_idx]= i;
			   seq_idx++;
			   start_idx =i+1;
			   }
		   
	   }
	   
	   
	   // if the start_idx reaches the last one 
	   if(start_idx == arr.length-1)
	   {
		   seq[seq_idx] = start_idx ;
		   seq_idx++;
		   seq[seq_idx] = arr.length-1;
		   seq_idx++;
		     
	   }
	   // if the start idx doesnt reacher the last value 
	   
	   if(start_idx!=arr.length-1){
		   seq[seq_idx] = start_idx ;
		   seq_idx++;
		   seq[seq_idx] = arr.length-1;
		   seq_idx++;
	   }
	   
	   int sumt = 0 ;
		
	// now calculating the sum for the subsequence
	   for(int i = 0 ; i <=(seq_idx-1) ; i = i+2){
		    start_idx = seq[i];
		    
		   
		    int sum = 0 ;
		    
		   int end_idx = seq[i+1];
		   for(int j = start_idx ; j<=end_idx; j++){
			  
			   sum = sum + arr[j];
			   
			  
			   if( sum >= sumt )
			   sumt = sum ;
			   
			   
			  
		   }
		 }
	   System.out.println(sumt);
  }
}