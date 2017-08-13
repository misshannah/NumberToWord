import java.io.*;
import java.util.*;


class Solution {
  public static void main(String[] args) {
    // my tests here
     System.out.println(numberToWord(11111));
  }
  

    static HashMap<Integer,String> numberMap = new HashMap<Integer,String>();
            static{
                numberMap.put(0,"Zero");
                numberMap.put(1,"One");
                numberMap.put(2,"Two");
                numberMap.put(3,"Three");
                numberMap.put(4,"Four");
                numberMap.put(5,"Five");
                numberMap.put(6,"Six");
                numberMap.put(7,"Seven");
                numberMap.put(8,"Eight");
                numberMap.put(9,"Nine");
            }
    public static String numberToWord(int number)
    {


      String numberAsString = Integer.toString(number);
    
      String wordForm = "";
      for (int i = 0; i < numberAsString.length(); i++) {
         wordForm +=  " " + numberMap.get(Character.getNumericValue(numberAsString.charAt(i)));
      }
      return wordForm;
  }
}
