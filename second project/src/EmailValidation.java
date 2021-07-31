import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailValidation {

   public static void main(String args[]) {
      List emails = new ArrayList();
      emails.add("Abdulazizhattar@gmail.com");
      emails.add("Mohammed1322@gmail.com");
      emails.add("Alisaleh@gmail.com");
      emails.add("kishore@gmail.com");
      emails.add("simplilearn.com");
      
      String regex = "^(.+)@(.+)$";
      Pattern pattern = Pattern.compile(regex);
      
      for (Object email : emails) {
         Matcher matcher = pattern.matcher((CharSequence) email);
         System.out.println(email + " : " + matcher.matches());
      } 
   }
}
