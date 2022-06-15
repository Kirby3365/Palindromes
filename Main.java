class Main {
  public static void main(String[] args) {
    //Clear the console
    System.out.print("\033[H\033[2J");
    System.out.flush();

    System.out.println("What is a palindrome?");
    System.out.println("");
    
    System.out.println("A palindrome is a word, number, phrase, or other sequence of characters which reads the same backward as forward. Punctuation, capitalization, and spaces are usually ignored.");
    System.out.println("");
    
    System.out.println("Examples: ");
    
    System.out.println("");
    
    //String Panindromes
    System.out.println("Taco cat: " + PalindromeChecker.CheckStringPalindrome("Taco cat"));
    System.out.println("never odd or even: " + PalindromeChecker.CheckStringPalindrome("never odd or even"));
    System.out.println("Is this a Palindrome: " + PalindromeChecker.CheckStringPalindrome("Is this a Palindrome"));
    System.out.println("Was it a cat I saw?: " + PalindromeChecker.CheckStringPalindrome("Was it a cat I saw?"));
    
    System.out.println("");
    
    //Int Panindromes
    System.out.println("123454321: " + PalindromeChecker.CheckIntPalindrome(123454321));
    System.out.println("1234567890: " + PalindromeChecker.CheckIntPalindrome(1234567890));
    System.out.println("123656321: " + PalindromeChecker.CheckIntPalindrome(123656321));
    System.out.println("123: " + PalindromeChecker.CheckIntPalindrome(123));

    System.out.println("");
    
    //Updated String Panindromes
    System.out.println("Taco cat: " + PalindromeChecker.CheckStringPalindromeUpdate("Taco cat"));
    System.out.println("never odd or even: " + PalindromeChecker.CheckStringPalindromeUpdate("never odd or even"));
    System.out.println("Is this a Palindrome: " + PalindromeChecker.CheckStringPalindromeUpdate("Is this a Palindrome"));
    System.out.println("Was it a cat I saw?: " + PalindromeChecker.CheckStringPalindromeUpdate("Was it a cat I saw?"));
    System.out.println("W?as it a cat I saw?: " + PalindromeChecker.CheckStringPalindromeUpdate("W?as it a cat I saw?"));
    System.out.println("tac,,oc.at: " + PalindromeChecker.CheckStringPalindromeUpdate("tac,,oc.at"));
    System.out.println("123656321: " + PalindromeChecker.CheckStringPalindromeUpdate("123656321"));
  }
}