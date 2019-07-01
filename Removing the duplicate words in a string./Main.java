import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner in = new Scanner(System.in);
	   String str = in.nextLine();
	// StringBuilder sb = new StringBuilder(in.nextLine());
	  
	  String[] words = str.split(" ");
	  for(int  i = 0 ; i<words.length-1; i++){
		  if(words[i]!=null){
		 for(int   j = i+1 ; j<words.length ; j++){
			 if(words[i].equals(words[j]))
				 words[j]= null;
		 }}
	  }
	   for(int i = 0 ; i<words.length ;i++)
	  {
		   if(words[i]!= null)
		   System.out.print(words[i]+" "); }
	
  }
}