import java.io.*;
import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
     Scanner in = new Scanner(System.in);
	  int num = in.nextInt();
	
	  String [] names = new String[num+1];
	  for(int i = 0 ; i<names.length ; i++)
	  {
		names[i] = in.nextLine();  
		
	  }
	  
	  
	  for(int i = 1 ; i<names.length  ; i++)
	  {
	     for(int j = i+1 ; j<names.length ; j++)
	     {
	    	 if(names[i].charAt(0)>names[j].charAt(0))
	    	 {
	    		 String temp = names[i];
	    		 names[i] = names[j];
	    		 names[j]= temp;
	    		 
	    	 }
	     }
	  }
	  for(int i = 1 ;i<names.length ; i++)
		  System.out.println(names[i].toLowerCase());
	  
	  
  }
}