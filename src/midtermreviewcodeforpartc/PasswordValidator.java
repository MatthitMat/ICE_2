package midtermreviewcodeforpartc;
/**
 * @author Matthew Cardona at ZenOfProgramming.com
 */
public class PasswordValidator
{

   private String password;

   public PasswordValidator ()
   {

   }

   public PasswordValidator (String password)
   {
      this.password = password;
   }

   public String getPassword ()
   {
      return password;
   }

   public void setPassword (String password)
   {
      this.password = password;
   }



   public boolean checkPassword (String password)
   {

      int specialCharCount = 0;
      //iterate over each character to see if it is a special character
      for (int i = 0; i < password.length(); i++) {
         if (!(Character.isLetterOrDigit(password.charAt(i)))) {
            //now we know there is at least one special character
            specialCharCount++;
         }
      }
      if (specialCharCount > 0 && password.length() > 7) {
         return true;
      }
      else {
         return false;
      }
   }
}
