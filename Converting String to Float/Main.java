import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
  Scanner in = new Scanner(System.in);
	   StringBuilder sb = new StringBuilder(in.nextLine());
	   
	   float n = 0;
	   int idx = 0 ;
	   
	   
	   
	   while(idx<sb.length() && sb.charAt(idx)!='.'){
		   
		   n = n*10 + sb.charAt(idx) - '0';
		   idx++;
	   }
	   idx++;
	   float count = 10;
	
	while(idx <sb.length()){
		n = n + (((sb.charAt(idx)-'0'))/(count));
		
		count= count *10;
		idx++;
		
	}
    System.out.println(n);
  }
}