import java.util.*;

public class pyramidrev {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int val = sc.nextInt();
        int val = 6;
        char ch1='\0',ch2='\0';
        ch1 =val%2==1  ? '#' : '*' ;
        ch2 =val%2==1  ? '*' : '#' ;
        for(int x=1;x<=val;x++)
        {
            for(int y=1;y<=val;y++)
            {
                if(y>=x || x==1)
                {
                    if(y%2 == 0)
                    System.out.print(ch1);
                    else 
                    System.out.print(ch2);
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}