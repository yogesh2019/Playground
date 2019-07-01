import java.util.Scanner;
class Main{
  public static void main(String args[])
 {
    Scanner in = new Scanner(System.in);
    StringBuilder str = new StringBuilder(in.nextLine());
    int col_count = in.nextInt();
    delete_spaces(str);
    
    
    int row_count = str.length()/col_count ;
    if(str.length()%col_count != 0 )
    {
    	row_count++;
    }
    for(int col_idx = 0 ; col_idx <col_count ; col_idx++)
    {
    	for(int row_idx = 0 ; row_idx <row_count ; row_idx ++)
    	{
    		int char_curr_idx = col_idx + (row_idx*col_count);
    		if(row_idx%2==1)
    		{
    			int char_idx = (row_idx*col_count)+(col_count-1);
    			 
    			char_curr_idx = char_idx - col_idx;
    			
    		}
    		if(char_curr_idx > str.length()-1)
    			System.out.print("X");
    		else
    			System.out.print(str.charAt(char_curr_idx));
    	}
    }
    
 }
  
  
  public static void delete_spaces(StringBuilder str){
	  for(int i = 0 ; i<str.length() ; i++)
	  {
		 if(str.charAt(i)== ' ') 
			 str.delete(i,i+1);
	  }
	  
  }
 
  
 
}