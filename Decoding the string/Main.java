import java.util.Scanner;
class Main{
  public static void main(String args[]) {
    Scanner in = new Scanner(System.in);
    StringBuilder str = new StringBuilder(in.nextLine());
     int key = in.nextInt();
     for(int i = 0 ; i<str.length() ; i++)
     {
    	 if(str.charAt(i)>='A'&& str.charAt(i)<='Z')
    	 {
    		 int offset = str.charAt(i)-'A';
    		 int no = 'Z'-'A'+1;
    		 int ind = offset - key;
    		 
    		 if(ind<0)
    			 ind =  ind + no;
    			 
    		 
    		 char ch = (char)((ind)+'A');
    		 
    		 System.out.print(ch);
    	 }
    	 else if(str.charAt(i)>='a'&& str.charAt(i)<='z')
    	 {
    		 int offset = str.charAt(i)-'a';
    		 int no = 'z'-'a'+1;
    		 int ind = offset - key;
    		 
    		 if(ind<0)
    			 ind =  ind + no;
    			 
    		 
    		 char ch = (char)((ind)+'a');
    		 
    		 System.out.print(ch);
    	 }
    	 else
    		 System.out.print(" ");
     }
  
  
  }
}