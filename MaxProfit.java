import java.util.Scanner;

public class MaxProfit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of the array : ");
        int size = sc.nextInt();
        int ar[] = new int[size];
        for (int x = 0; x < size; x++) {
            System.out.println("Enter element at index "+x);
            ar[x] = sc.nextInt();
        }
        int profit = profit(ar);
        System.out.println("Maxmimum profit : "+profit);
    }

    public static int profit(int ar[]) {
        int profit=0;
        int min=ar[0];
        for (int x = 1; x < ar.length; x++) {
            profit = Math.max(profit, ar[x]-min);
            min = Math.min(min, ar[x]);
        }
        return profit;
    }
}
