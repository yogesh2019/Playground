import java.util.Scanner;
class Main 
{
  public static void main (String[]args){
	  Scanner in = new Scanner(System.in);
	  int n = in.nextInt();
	  
	  int arr[] = new int[n];
	  
	  for(int i = 0 ; i< arr.length ; i++){
		  arr[i] = in.nextInt();
	  }
    int r = in.nextInt();
	  req(arr,n,r);
	  
	 }
	public static void req(int arr[],int n,int r){
		int oddSize = 0;
		if(n%2 == 0 )
			oddSize = n/2;
		else
			oddSize = (n+1)/2;
			
		
		int odd[] = new int[oddSize];
		int even[] = new int[n-oddSize];
		int indOdd = 0;
		int indEven = 0;
		for(int i = 0 ; i<arr.length ; i++){
			if(i%2==0)
				{
					odd[indOdd] = arr[i];
					indOdd++;
				}
			else
			{
				
					even[indEven]  = arr[i];
					indEven++;
				
			}
			
		}
		rotr(odd,r);
		rotl(even,r);
		int oddin =0;
		int evenin = 0;
		for(int i = 0 ; i < arr.length ; i++){
			  if(i%2==0)
				  {arr[i]=odd[oddin];
				  oddin++;}
			  else
			  {
				  arr[i]=even[evenin];
				  evenin++;
			  }
		  }
		for(int i = 0 ; i<arr.length ; i++){
			System.out.print(arr[i]+" ");
		}
		
		
	}
	public static void rotr(int odd[], int r){
		int temp = 0;
		for(int i = 1 ; i <= r ; i++){
			temp = odd[odd.length-1];
			for(int j = odd.length-1 ; j>0 ; j--){
				odd[j] = odd[j-1];
			}
			odd[0] = temp;
		}
	}
	public static void rotl(int even[],int r){
		int temp = 0;
		for(int i = 1 ; i <= r ; i++){
			temp = even[0];
			for(int j = 0 ; j<even.length-1; j++){
				even[j] = even[j+1];
			}
			even[even.length-1]=temp;
		}
		
	}
}