import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner in = new Scanner(System.in);
	   int n = in.nextInt();
        int r = n ;
	   if(n<0)
		   n = n*(-1);
	   int num = 0;
	   
	   StringBuilder sb = new StringBuilder("");
	   while(n>0){
		   num = (char)(n%10 + '0');
		   sb.append(n%10);
		   n = n/10;
		   
	   }
	   sb.reverse();
    if(r<0)
	   System.out.println("-"+sb);
    else
      System.out.println(sb);
	
  }
}