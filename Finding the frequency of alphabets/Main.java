import java.util.Scanner;
class Main{
    public static void main(String args[])
    {Scanner in = new Scanner(System.in);  
		String str = in.nextLine();
		StringBuilder sb = new StringBuilder(str);
		for(int i = 0 ; i < sb.length() ; i++ ){
			if(sb.charAt(i)>='A'&& sb.charAt(i)<='Z')
			{
				int offset = sb.charAt(i)-'A';
				char ch = (char)(offset +'a');
				sb.setCharAt(i,ch);
			}
		}
		
		int arr[] = new int[26];
		
		
		for(int i = 0 ; i<sb.length() ; i++){
			if(arr[sb.charAt(i)-'a']==0)
			{for(int j = 0 ; j<sb.length() ; j++){
				if(sb.charAt(i)==sb.charAt(j))
				{
					
					{arr[sb.charAt(i)-'a']++;}
				}
				
			}}
		}
		for(int i = 0 ; i<sb.length() ; i++){
			if(arr[sb.charAt(i)-'a']!=0)
			{System.out.print(sb.charAt(i));
			System.out.print(arr[sb.charAt(i)-'a']);
			System.out.print(' ');
			arr[sb.charAt(i)-'a'] =0;}
		}
    }
}