/*
Original question:
Given an array of integers, find the one that appears an odd number of times.
(There will always be only one integer that appears an odd number of times.)
*/

public class FindOdd {
  public static int findIt(int[] a) {
    int rep = 0;
    
    for(int i=0; i<a.length; i++) {
      int num = a[i];
      for(int j=0; j<a.length; j++) {
        if(num == a[j]) {
          rep+=1;
        }
      }
      if(rep%2 != 0) {
        return a[i];
      }
    }
    
    return 0;
  }
}
