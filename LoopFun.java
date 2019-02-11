 

public class LoopFun
{

      /**
       * Given a number, return the factorial of that number.
       * For example, given 5, the factorial is 5 x 4 x 3 x 2 x 1 which should return 120.
       * @param number
       * @return the factorial of the number
       */
      public Integer factorial(Integer number){
          Integer retVal =1; 
          
          for(Integer i=number;i>0;i--) {
              retVal = retVal *i;
            }
          
          
          return retVal;
      }

      /**
       * Given a phrase, get the acronym of that phrase. Acronym is the combination of
       * the first character of each word in upper case.
       * For example, given "Ruby on Rails", this method will return "ROR"
       * @param phrase
       * @return Upper case string of the first letter of each word
       */
      public String acronym(String phrase) {
          String retVal= "";
          
          // split single string into array of words
          String[] splitPhrase = phrase.split(" ");
          
          // loop through array - get first char of word
          for(String word:splitPhrase) {
              retVal = retVal + word.charAt(0);
            }
          // convert to upper chars
          retVal = retVal.toUpperCase();
          
          
          return retVal;
      }

      /**
       * To prevent anyone from reading our messages, we can encrypt it so it will only be readable by its
       * intended audience. This method encrypt the message by shifting the letter by 3 characters. If the character is
       * at the end of the alphabet, it will wraps around.
       * For example:
       *  'a' => 'd'
       *  'w' => 'z'
       *  'x' => 'a'
       *  'y' => 'b'
       * @param word
       * @return the encrypted string by shifting each character by three character
       */
      public String encrypt(String word) {
          String retVal="";
          int len =word.length();
          char tempChar;
          char three1 = '>';
           
          // loop through each char in word
          for(int i=0; i<len;i++) {
              
              tempChar = word.charAt(i);
              // start at a-3 
          
              // force to int to get ascii and back to char
              // also - Mods and resets to 'a' for over lower z
              tempChar = (char)((tempChar +3 -(int)'a')%26 + (int)'a');
              
              // concate and convert back to string
              retVal = retVal + Character.toString(tempChar);
              
            }
            
          
          return retVal;
      }
}
