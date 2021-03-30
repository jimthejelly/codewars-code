/*
Question:
You are going to be given a word. Your job is to return the middle character of the word.
If the word's length is odd, return the middle character. If the word's length is even,
return the middle 2 characters.

#Input
A word (string) of length 0 < str < 1000. You do not need to test for this.

#Output
The middle character(s) of the word represented as a string.
*/

class Kata {
  public static String getMiddle(String word) {
    int len = word.length();
    if(len%2 == 0) {
      return word.substring(len/2-1, len/2+1);
    }
    else {
      return word.substring(len/2, len/2+1);
    }
  }
}
