/*
Original question:

accum("abcd") -> "A-Bb-Ccc-Dddd"
accum("RqaEzty") -> "R-Qq-Aaa-Eeee-Zzzzz-Tttttt-Yyyyyyy"
accum("cwAt") -> "C-Ww-Aaa-Tttt"
*/

public class Accumul {
    
    public static String accum(String s) {
      int num = 1;
      String news = "";
      
      for(int i=0; i<s.length(); i++) {
        String let = s.charAt(i)+"";
        for(int j=1; j<=num; j++) {
          if(j==1) {
            news+=let.toUpperCase();
          }
          else {
            news+=let.toLowerCase();
          }
        }
        news+="-";
        num++;
      }
      
      return news.substring(0, news.length()-1);
    }
}
