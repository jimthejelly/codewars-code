/*
Question:
Assume "#" is like a backspace in string. This means that string "a#bc#d" actually is "bd"

Your task is to process a string with "#" symbols.

"abc#d##c"      ==>  "ac"
"abc##d######"  ==>  ""
"#######"       ==>  ""
""              ==>  ""
*/

import java.util.ArrayList;

public class BackspacesInString {
  public String cleanString(String s) {
    ArrayList<String> word = new ArrayList<String>();
    
    for(int i=0; i<s.length(); i++) {
      String letter = s.charAt(i)+"";
      
      if(letter.equals("#") && word.size()>0) {
        word.remove(word.size()-1);
      }
      else if(!(letter.equals("#"))) {
        word.add(letter);
      }
    }
    
    String str = "";
    for(int j=0; j<word.size(); j++) {
      str+=word.get(j);
    }
    
    return str;
  }
}
