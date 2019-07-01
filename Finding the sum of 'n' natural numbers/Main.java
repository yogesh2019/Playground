import java.util.Scanner;
class Main {
    public static void main(String[] args) 
    {
		Scanner in = new Scanner(System.in);
        System.out.println(sumnat(in.nextInt()));
    }
  public static int sumnat(int n)
{
	
	if(n == 1)
		return n;
	else
		return(n+sumnat(n-1));
}
}