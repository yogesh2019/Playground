import java.util.Scanner;
class Main
{
  public static void main (String [] args)
  {
	  Scanner in = new Scanner(System.in);
	  String str = in.nextLine();
	  StringBuilder sb = new StringBuilder("");
	  int start_idx = 0 ;
	  int end_idx = 0 ;
	  
	  for(int i = 0 ; i<str.length() ; i++)
	  {
		  
		  if(str.charAt(i)==' ')
		  { end_idx = i-1;
		  string_reverse(str,sb,start_idx,end_idx);
		  sb.append(' ');
		  start_idx = i+1;}
		  else if(i == str.length()-1)
		  { end_idx = i;
		  string_reverse(str,sb,start_idx,end_idx);
		  sb.append(' ');
		  start_idx = i+1;}
		  
	  }
  System.out.println(sb);
  
  }
  public static void string_reverse(String str, StringBuilder sb ,int i ,int j)
  {
	  for(int k = j ; k>=i ; k--)
	  {
		  sb.append(str.charAt(k));
	  }
  }
}