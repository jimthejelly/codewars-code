/*
Question:
Write simple .camelCase method for strings. All words must have their first letter capitalized without spaces.

For instance:
camelCase("hello case"); // => "HelloCase"
camelCase("camel case word"); // => "CamelCaseWord"
*/

public class Solution {

    public static String camelCase(String str) {
      System.out.println(str);
      String news = "";
      boolean space = false;
      
      for(int i=0; i<str.length(); i++) {
        String let = str.charAt(i)+"";
        
        if(i == 0 && !(let.equals(" "))) {
          news+=let.toUpperCase();
        }
        else {
          if(let.equals(" ")) {
            space = true;
          }
          else {
            if(space == true) {
              news+=let.toUpperCase();
              space = false;
            }
            else {
              news+=let;
            }
          }
        }
      }
      return news;
    }
}
