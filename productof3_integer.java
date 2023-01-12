import java.util.Scanner;

public class productof3_integer {
    public static int productOfDigit(int n) {
        String temp = String.valueOf(n);
        int res = 1;
        boolean did = false;
        for(int x = 0 ;x<temp.length();x++)
        {
            int t = Integer.parseInt(""+temp.charAt(x));
            if (t != 7) {
                res = res * t;
                did = true;
            }
            else
            {
                res = 1;
                did = false;
            }
        }
        return did ? res : -1;
    }

    public static void main(String[] args) {
        System.out.println("Enter a number : ");
        int N = new Scanner(System.in).nextInt();
        System.out.println(productOfDigit(N));
    }
}