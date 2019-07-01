import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
     	Scanner in = new Scanner(System.in);
		int size = in.nextInt();
		int size1 = in.nextInt();
		int arr[] = new int[size];
		int arr1[] = new int[size1];
		for(int i = 0 ; i<arr.length ; i++)
			{arr[i]= in.nextInt();}
		
		for(int j = 0 ; j<arr1.length ; j++){
		      for(int i = 0 ; i<arr.length ; i++){
		    	  if(arr[i]==(j+1))
		    	  arr1[j]++;
		      }
		}
		for(int i = 0 ; i<arr1.length ; i++)
			{System.out.print(i+1);
			System.out.print(" "+arr1[i]+"\n");}
		
		
		
		
		
    }
}