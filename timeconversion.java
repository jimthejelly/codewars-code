/*
Question:
Given a time in 12-hour AM/PM format, convert it to military (24-hour) time.
Note: Midnight is 12:00:00AM on a 12-hour clock, and 00:00:00 on a 24-hour clock. Noon is 12:00:00PM on a 12-hour clock, and 12:00:00 on a 24-hour clock.

A single string containing a time in 12-hour clock format (i.e.: hh:mm:ssAM or hh:mm:ssPM), where 01 <= hh <= 12 and 00 <= mm,ss <= 59.

Convert and print the given time in 24-hour format, where 00 <= hh <= 23.

Sample Input: 07:05:45PM

Sample Output: 19:05:45
*/

public class Time {

  public static String convertTime(String time){
    String newTime = "";
    
    String beg = time.substring(0,2);
    String noon = time.substring(time.length()-2, time.length());
    if(noon.equals("AM")) {
      if(beg.equals("12")) {
        newTime+="00";
      }
      else{
        newTime+=beg;
      }
    }
    else{
      if(beg.equals("12")) {
        newTime+=beg;
      }
      else{
        int begInt = Integer.parseInt(beg);
        newTime+=(begInt+12)+"";
      }
    }
    newTime+=time.substring(2,8);
    
    return newTime;
  }
}
