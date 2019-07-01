import java.util.Scanner;
class Main
{
  public static void main (String[]args){
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int batch[] = new int[n];
		
		for(int i = 0 ; i< batch.length ; i++){
			batch[i] = in.nextInt();
		}
		check(batch,n);
		  }
	 public static void check(int batch[], int n ){
		 int sum = 0 ;
		 int sum1 = 0;
		 for(int i = 0 ; i<n/3 ; i++){
			 for(int j = 3*i ; j<(3*i)+3 ;j++){
				 sum =sum + batch[j];
				 if(i==0)
				sum1 = sum;
			 }
			 
		 }
		 if(sum==(sum1*(n/3)))
			 System.out.print("Perfect Batch");
		 else
			 System.out.print("Not a Perfect Batch");
		 
		 
	 }
}