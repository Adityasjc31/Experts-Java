import java.util.Scanner;

class tripletsum
{
    private static String set = "";
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array : ");
        int n = sc.nextInt();
        int ar[] = new int[n];
        System.out.println("Enter value of X : ");
        int X = sc.nextInt();
        System.out.println("Enter values of the array : ");
        for (int i = 0; i < ar.length; i++) {
            ar[i] = Integer.parseInt(sc.next());
        }

        System.out.println("Set is : { " + (find3Numbers(ar, X) ? set : "") + " }");
    }
    
    public static boolean find3Numbers(int ar[],int X) {
        
        return false;
    }
}