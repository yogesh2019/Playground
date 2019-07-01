import java.util.Scanner;
public class Main
{
    public static void main(String args[])
    {
      Scanner in = new Scanner(System.in);
		int cas = in.nextInt();
		switch(cas)
		{
			case 1:
			{
				int a = in.nextInt();
				System.out.println(a*a);
              break;
			}
			case 2:
			{
				int l = in.nextInt();
				int b = in.nextInt();
				System.out.println(l*b);
              break;
			}
			case 3:
			{
				int base = in.nextInt();
				int height = in.nextInt();
				System.out.println(.5*base*height);
              break;
			}
			case 4 :
			{
				int radius = in.nextInt();
			System.out.println(3.14*radius*radius);
              break;
			}
    }
}
}