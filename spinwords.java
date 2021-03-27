/*
Original question:
Write a function that takes in a string of one or more words, and returns the same string,
but with all five or more letter words reversed. Strings passed in will consist of only
letters and spaces. Spaces will be included only when more than one word is present.
*/

import java.util.ArrayList;

public class SpinWords {

  public String spinWords(String sentence) {
    ArrayList<String> words = new ArrayList<String>();
	    String neword = "";
	    int senlen = sentence.length();
	    
	    for(int i=0; i<senlen; i++) {
	      String let = sentence.charAt(i) + "";
	      
	      if(let.equals(" ")) {
	        words.add(neword);
	        neword = "";
	        words.add(let);
	      }
	      else {
	    	  neword += let;
	      }
	    }
	    words.add(neword);
	    
	    System.out.println(words);
	    
	    String newsen = "";
	    for(int j=0; j<words.size(); j++) {
	      String word = words.get(j);
	      
	      if(word.length() > 4) {
	        String temp = word;
	        word = "";
	        for(int p=temp.length(); p>0; p--) {
	          word += temp.substring(p-1, p);
	        }
	      }
	      newsen += word;
	    }
	    
	    return newsen;
  }
}
