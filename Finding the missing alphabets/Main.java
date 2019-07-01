import java.util.Scanner;
class Main{
    public static void main(String args[]){
      Scanner in = new Scanner(System.in);  
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
			if(sb.charAt(i)!=' ')
			arr[sb.charAt(i)-'a']++;
		}
		for(int i = 0 ; i<arr.length ; i++){
			
			{ char a = (char)('a'+i);
				if(arr[i]==0)
					{System.out.print(a);
				    System.out.print(' ');}
				}
			
		}
    }
}