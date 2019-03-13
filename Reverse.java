
/**
 * Write a description of class Reverse here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Reverse
{
    public static final String SECRET_PASSWORD = "wildcat02";
   static String obfuscate(String input)
   {
   return input.replace('w','m').replace('c','b').concat("pass").replace('a','o');   
        
  }
   public static void main(String [] args)
   {
       
     if(args.length!= 1)
     {
         System.out.println("Wrong password try again");
         return;
        }
     if(args[0].equals( obfuscate(SECRET_PASSWORD)))
     {
      System.out.println("You win Congratulations!");
        }
     else
     {
       System.out.println("Wrong password, try again");  
        }
     
  }
}
