import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
       Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int exp = in.nextInt();
		int res = 1;
		while(exp!=0)
		{
			res = res*n;
			exp--;
		}
		System.out.println(res) ;
    }
}