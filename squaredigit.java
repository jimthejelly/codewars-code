/*
Question:
In this kata, you are asked to square every digit of a number and concatenate them.

For example, if we run 9119 through the function, 811181 will come out, because 92 is 81 and 12 is 1.

Note: The function accepts an integer and returns an integer
*/

public class SquareDigit {

  public int squareDigits(int n) {
    String word = n+"";
    String neword = "";
    
    for(int i=0; i<word.length(); i++) {
      String let = word.charAt(i)+"";
      int num = Integer.parseInt(let);
      
      int nnum = num*num;
      
      neword += nnum+"";
    }
    
    return Integer.parseInt(neword);
  }

}
