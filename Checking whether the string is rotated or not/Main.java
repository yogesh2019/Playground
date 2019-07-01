import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
     	Scanner in = new Scanner(System.in);
		String str  = in.nextLine();
		String str1 = in.nextLine();
		StringBuilder sb = new StringBuilder(str);
		StringBuilder sb1 = new StringBuilder(str1);
		StringBuilder sb2 = new StringBuilder(str1);
		for(int i = 0  ; i<sb1.length() ;i++){
			rotate(sb1,i,sb2);
		
		if(check(sb,sb2) == 1)
		{System.out.println("Yes");
			break;
		
		}
		if(i == sb1.length()-1)
			System.out.println("No");}
		
		
		
	}
	
	public static void rotate(StringBuilder sb1, int n,StringBuilder sb2){
		for(int i = 0 ; i<sb1.length();i++){
			int ind = (i+n)%sb1.length() ;
			sb2.setCharAt(ind,sb1.charAt(i));
			
		}
		
	}
	
	public static int check(StringBuilder sb, StringBuilder sb1){
	int z = 1;
		if(sb1.length()!=sb.length())
		      z = 0;
	for(int i = 0 ; i<sb.length()-1 ; i++){
		if(sb.charAt(i)!=sb1.charAt(i))
		{ z=0;
			break;
		}
	}
	return z;
    }
}