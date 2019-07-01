import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
  Scanner in = new Scanner(System.in);
		 StringBuilder sb = new StringBuilder(in.nextLine());
		 int middle = (sb.length()-1)/2;
		 int count = 1;
		 int count2  = 1 ;
		 for(int i = 0 ; i<sb.length(); i++){
			 
			 for(int star = sb.length()-2-i ; star>=0 ;star--)
			 {System.out.print(" ");}
			
			 for(int j = middle ; j<(middle+count); j++)
			 { System.out.print(sb.charAt(j));
			 
			 }
			 if(i<middle)
				 count++;
			 if(i>middle)
				 count2++;
			 
			if(i>middle) {for(int k = 0 ;k<count2-1 ; k++){
				 System.out.print(sb.charAt(k));
			 }}
			
			 System.out.println();
		 }
  }
}