/*
Question:
Given a sequence of numbers, find the largest pair sum in the sequence.

For example

[10, 14, 2, 23, 19] -->  42 (= 23 + 19)
[99, 2, 2, 23, 19]  --> 122 (= 99 + 23)
Input sequence contains minimum two elements and every element is an integer.
*/

public class Solution{
    public static int largestPairSum(int[] numbers){
      int flarge = numbers[0];
      int slarge = numbers[1];
      
      if(numbers[0]<numbers[1]) {
        flarge = numbers[1];
        slarge = numbers[0];
      }
      
      for(int i=2; i<numbers.length; i++) {
        int num = numbers[i];
        if(num>flarge) {
          if(flarge>slarge) {
            slarge = flarge;
          }
          flarge = num;
        }
        else if(num>slarge) {
          slarge = num;
        }
      }
      
      return flarge+slarge;
    }
}
