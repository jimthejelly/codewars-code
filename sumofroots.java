/*

Original question:
Given n, take the sum of the digits of n. If that value has more than one digit, continue reducing in
this way until a single-digit number is produced. The input will be a non-negative integer.

*/

public class DRoot {
  public static int digital_root(int n) {
    String fn = n + "";
    int num = 0;
    
    while(fn.length()!=1) {
      num=0;
      for(int i=0; i<fn.length(); i++) {
        String sn = fn.charAt(i) + "";
        num += Integer.parseInt(sn);
      }
      fn = num + "";
    }
    
    return num;
  }
}
