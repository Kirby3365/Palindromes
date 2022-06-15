class PalindromeChecker{
  static boolean CheckStringPalindrome(String word){
    char[] wordChars = word.toLowerCase().toCharArray();
    String originalStr = "";
    String newStr = "";
    int charAsNum;
    
    for(int i = 0; i < wordChars.length; i++){
      charAsNum = (int)wordChars[i];
      //System.out.println(charAsNum);
      if((charAsNum > 96 && charAsNum < 123) || (charAsNum > 47 && charAsNum < 58))
        originalStr += wordChars[i];
    }
    
    //Reverse Array
    for(int i = wordChars.length - 1; i >= 0; i--){
      charAsNum = (int)wordChars[i];
      if((charAsNum > 96 && charAsNum < 123) || (charAsNum > 47 && charAsNum < 58))
        newStr += wordChars[i];
    }
    if(originalStr.equals(newStr)){
      return true;
    }
    return false;
  }

  static boolean CheckStringPalindromeUpdate(String word){
    char[] wordChars = word.toLowerCase().toCharArray();
    int charAAsNum;
    int charBAsNum;
    int j = 0;
    
    for(int i = 0; i < wordChars.length / 2; i++){
      charAAsNum = (int)wordChars[i];
      charBAsNum = (int)wordChars[wordChars.length - 1 - j];

      //Ignore punctuation including multiples
      while((charAAsNum < 97 || charAAsNum > 122) && (charAAsNum < 48 || charAAsNum > 57)){
        i++;
        charAAsNum = (int)wordChars[i];
      }
         
      while((charBAsNum < 97 || charBAsNum > 122) && (charBAsNum < 48 || charBAsNum > 57)){
        j++;
        charBAsNum = (int)wordChars[wordChars.length - 1 - j];
      }

      //System.out.println(wordChars[i] + " i = " + i + " compares with " + wordChars[wordChars.length - 1 - j] + " j = " + j);
      
      if(wordChars[i] != wordChars[wordChars.length - 1 - j]){
        return false;
      }
      
      j++;
    }
    
    return true;
  }

  static boolean CheckIntPalindrome(int inputNum){
    return CheckStringPalindrome("" + inputNum);
  }
}