/*
Question:
Deoxyribonucleic acid (DNA) is a chemical found in the nucleus of cells and carries the "instructions" for the development and functioning of living organisms.

In DNA strings, symbols "A" and "T" are complements of each other, as "C" and "G". You have function with one side of the DNA (string);
you need to get the other complementary side. DNA strand is never empty or there is no DNA at all.
*/

public class DnaStrand {
  public static String makeComplement(String dna) {
    String newDNA = "";
    
    for(int i=0; i<dna.length(); i++) {
      String s = dna.charAt(i)+"";
      if(s.equals("A")) {
        newDNA+="T";
      }
      else if(s.equals("T")) {
        newDNA+="A";
      }
      else if(s.equals("C")) {
        newDNA+="G";
      }
      else if(s.equals("G")) {
        newDNA+="C";
      }
    }
    
    return newDNA;
  }
}
