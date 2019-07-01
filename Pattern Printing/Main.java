import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
       Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int count = n; 
		for(int i = n-1 ; i >= 0  ; i --)
			
		{
			int var = count;
			for(int k = 0 ; k < count - i-1 ; k++)
			{
				System.out.print(var);
				var--;
				
			}
			for(int j = i-1+1  ; j >= 0  ; j--)
			{
				System.out.print(i+1);
			}
			System.out.println();
			
		}
    }
}