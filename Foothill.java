import java.util.*;
import java.lang.Math;

public class Foothill
{

   private final static int MAX_PULL = 3;
   private final static String BARS = "Bars";
   private final static String CHERRIES = "Cherries";
   private final static String SPACE = "Space";
   private final static String SEVEN = "7";
   
   public void main (String args[])
   {
    
      int theBet;
      TripleString tripleStr;
      int myPay;
      
      do
      {
        theBet = getBet();
        tripleStr = pull();
        myPay = getPayMultiplier(tripleStr);
        
      } while (theBet !=0);
      
      
      
   }
   
   public static int getBet()
   {
      Scanner keyboard = new Scanner(System.in);
      String userInput;
      int theBet;
   
      
      System.out.println("How much would you like to bet (1 - 100) or 0 to quit? " );
      userInput = keyboard.next();
      theBet = Integer.parseInt(userInput);
     
      
      keyboard.close();

      return theBet;
      
   }
   
   public static TripleString pull()
   {
      int i;
      String randstr;
      
      TripleString tripleStr = new TripleString();
      for (i=0; i < MAX_PULL; i++)
      {
         randstr = randString();
         tripleStr.setString(randstr);
      }
         
      //str.set
      return tripleStr;
      
      
   }
  
   public static String randString()
   {
     
      int result; 
      result = (int) Math.random() * 100;
      if ( result <= 50)
         return BARS;
      else if(result <= 25)
         return CHERRIES;
      else if (result <= 13)
         return SPACE;
      else if( result > 87)
         return SEVEN;
         
       
      return null;
      
   }
   
   public int getPayMultiplier(TripleString thePull)
   {
      
      if (thePull.getString1() == CHERRIES && 
          thePull.getString2() == CHERRIES && 
          thePull.getString3() == CHERRIES)
            return 30;
      else if (thePull.getString1() == BARS && 
               thePull.getString2() == BARS && 
               thePull.getString3() == BARS)
            return 50;
      else if (thePull.getString1() == SEVEN && 
               thePull.getString2() == SEVEN && 
               thePull.getString3() == SEVEN)
            return 100;
      else if (thePull.getString1() == CHERRIES && 
               thePull.getString2().equals(CHERRIES)== false && 
               thePull.getString3().equals(CHERRIES)== false )
            return 5;
      else if (thePull.getString1() == CHERRIES && 
               thePull.getString2().equals(CHERRIES)== true && 
               thePull.getString3().equals(CHERRIES)== false )
         return 15;
     
     
      return 0;
   }
   
   void display (TripleString thePull, int winnings)
   {
      
      System.out.print("Whrrrrr.... and your pull is ....\n");
      System.out.println(thePull.getString());
      if (winnings > 0)
         System.out.print("Congratulations! You Win: " + winnings);
      else
         System.out.print("Sorry, you lost...");
   }
}
