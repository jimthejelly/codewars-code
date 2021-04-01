/*
Question:
The Fibonacci numbers are the numbers in the following integer sequence (Fn):

0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, ...

such as F(n) = F(n-1) + F(n-2) with F(0) = 0 and F(1) = 1.


Given a number, say prod (for product), we search two Fibonacci numbers F(n) and F(n+1) verifying F(n) * F(n+1) = prod.

Your function productFib takes an integer (prod) and returns an array: {F(n), F(n+1), 1}


If you don't find two consecutive F(m) verifying F(m) * F(m+1) = prodyou will return

[F(m), F(m+1), false] or {F(n), F(n+1), 0} or (F(n), F(n+1), False)
F(m) being the smallest one such as F(m) * F(m+1) > prod.

*/

public class ProdFib {
  
	public static long[] productFib(long prod) {
    long[] ret = new long[3];
    
    long num1 = 1;
    long num2 = 0;
    while(num2*num1<=prod) {
      if(num1*num2 == prod) {
        ret[0] = num2;
        ret[1] = num1;
        ret[2] = 1;
        return ret;
      }
      
      long temp = num2;
      num2 = num1;
      if(temp == 0) {
        num1+=1;
      }
      else {
        num1+=temp;
      }
    }
    
    ret[0] = num2;
    ret[1] = num1;
    ret[2] = 0;
    return ret;
   }
}
