/*
Question:
Write a simple parser that will parse and run Deadfish.

Deadfish has 4 commands, each 1 character long:
-> i increments the value (initially 0)
-> d decrements the value
-> s squares the value
-> o outputs the value into the return array

Invalid characters should be ignored.
*/


import java.util.ArrayList;

public class DeadFish {
    public static int[] parse(String data) {
      ArrayList<Integer> numList = new ArrayList<Integer>();
      int num = 0;
      
      for(int i=0; i<data.length(); i++) {
        String getData = data.charAt(i)+"";
        
        if(getData.equals("i")) {
          num++;
	      }
	      else if(getData.equals("d")) {
	        num--;
	      }
	      else if(getData.equals("s")) {
	        num*=num;
        }
	      else if(getData.equals("o")) {
          numList.add(num);
	      }
	      System.out.println(num);
      }
      
      int[] datarr = new int[numList.size()];
      for(int j=0; j<numList.size(); j++) {
        datarr[j] = numList.get(j);
      }
		
	    return datarr;
    }
}
