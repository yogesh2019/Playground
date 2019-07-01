import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
		   int size = in.nextInt();
		   int arr[] = new int[size];
						
			for(int i = 0 ; i<arr.length ; i++){
				arr[i]= in.nextInt();
			}	
			// check for the palindrome
			int left = 0 ;
			int right = arr.length-1;
			int  flag = 1 ;
			
			
			while(left<right){
				if(arr[left]!=arr[right])
					flag = 0;
				left++;
				right--;
				
			}
			
			
			if(flag==1)
			System.out.println("Yes");
			else 
			System.out.println("No");
						
    }
}