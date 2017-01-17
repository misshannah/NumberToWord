import java.io.*;
import java.util.*;

/*
Write a method numToWords(N), that takes in a number, N, and returns the word-equivalent for each 
digit that makes up that number.

e.g. numToWords(908) => "nine zero eight"
numToWords(800) => "eight zero zero"

makes sense?
Yes, how much time do I have?
you can do as quick as possible, but we've 50 mins for the challenge(s)
 */

class Solution {
  public static void main(String[] args) {
    // our tests here
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
