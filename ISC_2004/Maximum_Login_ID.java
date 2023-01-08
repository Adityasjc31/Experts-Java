package ISC_2004;

import java.util.*;
class Maximum_Login_ID
{
    static int time[][];
    static String UI[];
    static String date[][];
    public static void main(String args[])
    {
        System.out.print("Number of users : ");
        int n=new Scanner(System.in).nextInt();
        time=new int[n][2];
        UI=new String[n];
        date=new String[n][2];
        for(int x=0;x<n;x++)
        {
            Scanner sc = new Scanner(System.in);
            System.out.print("USER IDENTIFICATION : ");
            UI[x]=sc.next();
            System.out.print("LOGIN TIME : ");
            String t=sc.next();
            timetoMinutes(t,x,0);
            System.out.print("Date(dd-mm) : ");
            date[x][0]=sc.next();
            System.out.print("LOGOUT TIME : ");
            t=sc.next();
            timetoMinutes(t,x,1);
            System.out.print("Date(dd-mm) : ");
            date[x][1]=sc.next();
        }
    }

    public static void timetoMinutes(String n,int i,int j)
    {
        time[i][j]=Integer.parseInt(n.substring(0,n.indexOf(':')))*60+Integer.parseInt(n.substring(n.indexOf(':')+1));
    }

    // public static String LongestTimeIDOpen()
    // {
        // int u=0,l=0;
        // for(int i=0,c=0;i<date.length;i++)
        // {
            // String d1=date[x][c].substring(0,date[x][c].indexOf('-'));
            // String d2=date[x][1].substring(0,date[x][1].indexOf('-'));
            // String m1=date[x][0].substring(date[x][0].indexOf('-')+1);
            // String m2=date[x][1].substring(date[x][1].indexOf('-')+1);
            // if(m1.equalsIgnoreCase(m2) && d1.equalsIgnoreCase(d2))
            // {
                // for(int x=0;x<time.length;x++)
                // {
                    // for(int y=0;y<2;y++)
                    // {
                        // if(time[x][y]>time[u][l])
                        // {
                            // u=x;
                            // l=y;
                        // }
                    // }
                // }
                // return u+" "+l; 
            // }
            // else if(!m1.equalsIgnoreCase(m2))
            // {
                // u=i;
                // l=45;
            // }
            // else
            // {
            // }
        // }
        // return null;
    // }
}