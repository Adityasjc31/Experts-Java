import java.util.*;

public class fibprimeSeriesEvenOdd {

    public static int fib_term(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return fib_term(n - 1) + fib_term(n - 2);
        }
    }

    public static int nextPrime(int prime) {
        for (int x = 2;x <= prime / 2; x++) {
            if (prime %x == 0) {
                return -1;
            }
        }
        return prime;
    }

    public static void main(String[] args) {
        try {
            int n = new Scanner(System.in).nextInt();
            if(n<0 || n>=100)
            {
                System.out.println(-1);
                return;
            }
            int lastfibo = 1,lastprime = 2;
            int result = 0;
            for (int x = 1; x <= n; x++) {
                if (x % 2 == 1) {
                    result = fib_term(lastfibo);
                    lastfibo++;
                } else {
                    result = nextPrime(lastprime);
                    if(result == -1)
                    {
                        x--;
                    }
                    lastprime++;
                }
            }
            System.out.println(result);
        } catch (Exception e) {
        }
    }
}