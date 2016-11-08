
public class TripleString
{
   public static final int  MAX_LEN = 20;
   private String string1;
   private String string2;
   private String string3;
  
   
   public TripleString()
   {
     string1 = "";
     string2 = "";
     string3 = "";
    
   }
   
   private boolean validString(String str)
   {
      if(str.length() < MAX_LEN && str!= null)
         return true;
      else 
         return false;
   }
   
  public TripleString getString()
  {
      
     return null;
     
  }
  
  public boolean setString(String str)
  {
     if (validString(str) == false)
        return false;
     
     if (string1=="")
        string1 = str;
     else if(string2 == "")
        string2 =  str;
     else if (string3 == "")
        string3 = str;
     
     return true;
     
  }
  
  public String getString1()
  {
     return this.string1;
  }
  
  
  public String getString2()
  {
     return this.string2;
  }
  
  public String getString3()
  {
     return this.string3;
  }
}



