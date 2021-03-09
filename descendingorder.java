/*
Original question:
Your task is to make a function that can take any non-negative integer as an argument
and return it with its digits in descending order. Essentially, rearrange the digits
to create the highest possible number.
*/


import java.util.Arrays;

public class DescendingOrder {
  public static int sortDesc(final int num) {
    String numstr = num+"";
    String newnum = "";
    
    int numarr[] = new int[numstr.length()];
    
    for(int i=0; i<numstr.length(); i++) {
      String cha = numstr.charAt(i) + "";
      numarr[i] = Integer.parseInt(cha);
    }
    
    Arrays.sort(numarr);
    
    for(int j=numarr.length-1; j>=0; j--) {
      newnum += numarr[j];
    }
    
    int nnum = Integer.parseInt(newnum);
    return nnum;
    
  }
}
