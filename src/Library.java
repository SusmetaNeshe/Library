public class Library {
  public static int max(int a, int b, int c, int d) {
     if(a> b && a > c && a > d) {
        return a;    
     }
     else if (b> a && b > c && b > d) {
        return b;    
     }
     else if (c> a && c > b && c > d) {
        return c;    
     }
     else return d;
     }
  public static double quadratic( double a,double b, double c, double x) {
     return (a*x*x) + (b*x) + c;
  }
  public static int firstDigit(int num) {
     while (num  > 9)
        num/=10;
        return num;
  }
  public static int oddMinusEven(int num) {
     int odd = 0;
     int even =0;
     while (num > 0) {
        int digit = num % 10;
        if (digit % 2 == 0) {
            even += digit;
        } else {
            odd += digit;
        }
        num /= 10;
     }
     return odd-even;
  }
  public static double countChange( int q, int d, int n, int p) {
     int total = q*25 + d*10 + n*5 + p*1;
     double dollars = total/100.0;
     return dollars;
  }
  public static String parityCheck(int num) {
     boolean odd = false, even = false;
     while (num >0) {
        if ( ( num % 10)% 2 == 0) {
           even = true;
        }
        else odd = true;
        num/=10;
     }
     if (odd && even)
        return "Mixed parity";
     else if ( odd)
        return "Odd parity";
     else  
        return "even parity";

  }
  public static int digitMatch ( int a, int b, int c) {
     int count = 0;
     while (a > 0 && b > 0 && c > 0) {
        int digitA = a % 10;
        int digitB = b % 10;
        int digitC = c % 10;

        if (digitA == digitB && digitB == digitC) {
            count++;
        }
        a /= 10;
        b /= 10;
        c /= 10;
        if (a == 0 || b == 0 || c == 0) {
           break;
       }
   }

   return count;
}

  public static int removeOddDigits (int num) {  
     int result = 0;
     int place = 1;
     while(num>0) {
        int digit = num%10;
        if (digit%2 == 0) {
           result += digit*place;
           place *=10;
     }
     num /= 10;
  }
     return result;
  } 
}