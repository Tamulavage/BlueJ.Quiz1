
public class StringUtilities {
    /**
     * @param input value to be returned
     * @return `input`
     */
    public String returnInput(String input) {
        return input;
    }

    /**
     * @param baseValue value to be added to
     * @param valueToBeAdded value to add
     * @return the concatenation of `baseValue` and `valueToBeAdded`
     */
    public String concatenate(String baseValue, String valueToBeAdded) {
        return baseValue+valueToBeAdded;
    }

    /**
     * @param valueToBeReversed value to be reversed
     * @return identical string with characters in opposite order
     */
    public String reverse(String valueToBeReversed) {
        String retVal = "";
        for (int i=(valueToBeReversed.length()-1);i>=0;i--) {
            retVal=retVal+valueToBeReversed.charAt(i);
        }
        return retVal;
    }

    /**
     * @param word word to get middle character of
     * @return middle character of `word`
     */
    public Character getMiddleCharacter(String word) {
        int len=word.length(); // get string length
        
        if(len%2 == 0) // check for evens
        {
            len--; // force to pick the first middle (change to odd)
        }
        
        len = len/2; // get middle number
        
        return word.charAt(len);
    }

    /**
     * @param value value to have character removed from
     * @param charToRemove character to be removed from `value`
     * @return `value` with char of value `charToRemove` removed
     */
    public String removeCharacter(String value, Character charToRemove) {
        int len=value.length(); // get string length
        String retVal="";
        
        for(int i=0;i<len;i++) // loop through string
        {  
            if(value.charAt(i) != charToRemove)
            {
                retVal = retVal+value.charAt(i);
            }
        }
        
        return retVal;
    }

    /**
     * @param sentence String delimited by spaces representative of a sentence
     * @return last `word` in sentence
     */
    public String getLastWord(String sentence) {
        String retVal = "";
        int len=sentence.length();
        int spaceIndex;
        
        // reverse the string
        String reverseString = reverse(sentence);
        
        // Get first space index
        spaceIndex = reverseString.indexOf(" ");
        
        // set retVal = 0 to space index
        retVal = reverseString.substring(0, spaceIndex);
        // reverse it back
        retVal = reverse(retVal);
        
        
        return retVal;
    }
}
