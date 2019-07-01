import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner in = new Scanner(System.in);
    System.out.println(fac(in.nextInt()));
  }
  public static int  fac(int n)
{
	if(n == 1)
		return n ;
	else
		return (n*fac(n-1));
}
}