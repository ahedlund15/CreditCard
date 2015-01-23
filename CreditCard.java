//Ale Hedlund Credit Card verification code
import java.util.ArrayList;

public class CreditCard
{
  
  public int findType(String num)
  {
    String number = num;
    int type = 0;
    String numbOne = number.substring(0,1);
    String numbTwo = number.substring(0,2);
    String numbThree = number.substring(0,3);
    String numbFour = number.substring(0,4);
    
    if (numbOne.equals("4")) {  //Visa check
      type = 2;
      if (number.length() != 13
            || number.length() != 16) type = 0;
    }
    else if (numbTwo.equals("51")  //MC check
          || numbTwo.equals("52")
          || numbTwo.equals("53")
          || numbTwo.equals("54")
          || numbTwo.equals("55")) {
      type = 1;
      if (number.length() != 16) type = 0;
    }
    
    else if (numbTwo.equals("34")  //Amex check
          || numbTwo.equals("37")) {
      type = 3;
      if (number.length() != 15) type = 0;
    }
    else if (numbTwo.equals("36")  //Carte Blanche/Diners Club check
          || numbTwo.equals("38")
          || numbThree.equals("300")
          || numbThree.equals("301")
          || numbThree.equals("302")
          || numbThree.equals("303")
          || numbThree.equals("304")
          || numbThree.equals("305")) {
      type = 5;
      if (number.length() != 14) type = 0;
    }
    else if (numbFour.equals("6011")) { //Discover check
      type = 4;
      if (number.length() != 16) type = 0;
    }
    else type = 0;
    
    return type;
  }
  
  public boolean verify(String num) //declare static???
  {
    String number = num;
    int numlength = number.length();
    boolean answer = true;
    ArrayList creditArray = new ArrayList();
    for (int i = 0; i < numlength - ; i++)
    {
      creditArray.add(number.substring((numlength - 1 - i),(numlength - 1)));
    }
    return answer;
  }
  
  
    
  
  
}