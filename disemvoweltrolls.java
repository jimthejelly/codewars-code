/*
Original question:
Trolls are attacking your comment section!
A common way to deal with this situation is to remove all of the vowels from the trolls' comments, neutralizing the threat.
Your task is to write a function that takes a string and return a new string with all vowels removed.
*/

public class Troll {
    public static String disemvowel(String str) {
      String newword = "";
      for(int i=0; i<str.length(); i++) {
        String word = str.charAt(i) + "";
        if ((!word.equals("a")) && (!word.equals("e")) && (!word.equals("i")) && (!word.equals("o")) && (!word.equals("u") && (!word.equals("A")) && (!word.equals("E")) && (!word.equals("I")) && (!word.equals("O")) && (!word.equals("U"))))
        {
            newword += word;
        }
      }
      return newword;
    }
}
