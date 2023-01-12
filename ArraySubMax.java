import java.util.Scanner;

public class ArraySubMax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of the array : ");
        int size = sc.nextInt();
        int ar[] = new int[size];
        for (int x = 0; x < size; x++) {
            System.out.println("Enter element at index "+x);
            ar[x] = sc.nextInt();
        }
        int sum = maxSumSubArray(ar);
        System.out.println("Maxmium sum of sub array is : "+sum);
    }

    public static int maxSumSubArray(int ar[]) {
        int sumtill=Integer.MIN_VALUE,sumCont=0;
        for (int x = 0; x < ar.length; x++) {
            sumCont += ar[x];
            if (sumtill < sumCont)
            {
                sumtill = sumCont;
            }

            if(sumCont < 0)
            {
                sumCont = 0;
            }
        }
        return sumtill;
    }
}
