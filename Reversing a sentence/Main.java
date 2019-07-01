import java.util.Scanner;
 
class Main
{
    public static String reverseTheSentence(String inputString)
    {
        String[] words = inputString.split("\\s");
         
        String outputString = "";
         
        for (int i = words.length-1; i >= 0; i--)
        {
            outputString = outputString + words[i] + " ";
        }
         
        return outputString;
    }
     
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
         
        
         
        String inputString = sc.nextLine();
         
        String outputString = reverseTheSentence(inputString);
         
        
         
        System.out.println(outputString);
         
        sc.close();
    }
}