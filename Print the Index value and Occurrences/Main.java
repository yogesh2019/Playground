import java.util.*;
import java.util.regex.*;
import java.io.*;
public class Main {

    public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
      String patt = in.nextLine();
      String text = in.nextLine();
       Pattern pat = Pattern.compile(patt);
      Matcher mat = pat.matcher(text);
      int  c = 0;
      while(mat.find())
      {
         c++;
        System.out.println("found: "+c+" : "+mat.start()+" - "+mat.end());
      }
      if(c!=0)
        System.out.println(c);
      else
        System.out.println("The given word is not present in the string");
     
    }
}