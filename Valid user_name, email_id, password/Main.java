import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.io.*;
import java.util.*;
public class Main {
    private static Pattern userNamePtrn = Pattern.compile("^[a-zA-z0-9_-]*$");
    public static boolean validateUserName(String userName)
    {
       Matcher match = userNamePtrn.matcher(userName);
       if(match.matches())
       {
        return true;
       }
      return false;
      
    }
  
   private static Pattern emailNamePtrn = Pattern.compile("^[@_.a-z0-9]*$");
  public static boolean validateEId (String  EId)
  {
     Matcher  mat = emailNamePtrn.matcher(EId);
    if(mat.matches())
    {
      return true;
    }
    return false;
  }
  private static Pattern password = Pattern.compile("^[a-zA-Z0-9@#$%]*$");
  public static boolean validatepass(String pass)
  {
       Matcher mat = password.matcher(pass);
      if(mat.matches())
        return true;
    else
      return false;
  }
  
  
  public static void main(String a[]){
      Scanner in = new Scanner(System.in);
      String userName = in.nextLine();
      String Eid = in.nextLine();
      String pass= in.nextLine();
    System.out.println("Is "+userName+" a valid user name? "+validateUserName(userName));
     System.out.println("Is "+Eid+" a valid email address? "+validateEId(Eid));
     System.out.println("Is "+pass+" a valid password? "+validatepass(pass));
    
    
    }
}