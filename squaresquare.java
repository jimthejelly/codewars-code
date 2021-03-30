/*
Question:
You just have to check if the given number is a perfect square.
*/

public class Square {    
    public static boolean isSquare(int n) {        
      double sqn = Math.sqrt(n);
      double isqn = (int)sqn + 0.0;
      if(isqn == sqn) {
        return true;
      }
      return false;
    }
}
