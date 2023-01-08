import java.util.*;
class Info_Log
{
    private static final char breakChar = '§';
    private String log_Info[]= null;
    private boolean isCalculated = false;
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Number of users : ");
        int users = sc.nextInt();
        
        Info_Log iL = new Info_Log();
        
        iL.input(users);
        iL.display();
        iL.calculate();
        iL.display();
    }

    public void input(int users)
    {
        Scanner sc = new Scanner(System.in);
        log_Info = new String[users];
        for(int x=0 ;x<users ;x++)
        {
            System.out.println("Enter User Identification : ");
            int UID = sc.nextInt();
            System.out.println("Enter LOGIN TIME & DATE : ");
            sc.nextLine();
            String loggedIN = sc.nextLine();
            System.out.println("Enter LOGOUT TIME & DATE : ");
            String loggedOut = sc.nextLine();

            String sumUp =(char)breakChar + "" + UID + breakChar + loggedIN + breakChar + loggedOut + breakChar;
            log_Info[x] = sumUp;
        }
    }

    public void display()
    {
        System.out.println("USER\t\tLOGIN\t\tLOGOUT"+(isCalculated() ? "\t\tDURATION" : "")+"\nIDENTIFICATION\tTIME&DATE\tTIME&DATE"+(isCalculated() ? "\tHOURS:MINS" : ""));
        for(int x=0;x<log_Info.length;x++)
        {
            StringTokenizer st = new StringTokenizer(log_Info[x],breakChar+"");
            boolean first=true;
            while(st.hasMoreTokens())
            {
                System.out.print(st.nextToken()+"\t");
                if(first)
                {
                    System.out.print("\t");
                    first=false;
                }
                System.out.print("");
            }
            System.out.println();
        }
    }
    
    private boolean isCalculated()
    {
        return isCalculated;
    }
    
    public void calculate()
    {
        for(int x=0;x<log_Info.length;x++)
        {
            log_Info[x] += DifferenceCalculator(log_Info[x]);
        }
        isCalculated = true;
    }

    public String DifferenceCalculator(String time)
    {
        StringTokenizer st = new StringTokenizer(time,breakChar+"");
        st.nextToken();
        int start[] = toIntegerTimeDate(st.nextToken());
        int end[] = toIntegerTimeDate(st.nextToken());
        int dateDiff = end[2] - start[2];
        int mins = 0;
        if(dateDiff != 0)
        {
            for(int x=1;x<=dateDiff;x++)
            {
                mins += end[0] * 60 ;
                mins += (24 - start[0]) * 60;
                mins += Math.abs(end[1]-start[1]);
            }
        }
        else
        {
            mins += end[0] - start[0];
            mins += Math.abs(end[1]-start[1]);
        }

        return toHRSMINS(mins);
    }

    public int[] toIntegerTimeDate(String time)
    {
        time = " " + time + " ";
        int i1 = time.indexOf(':');
        if(i1 == -1)
        {
            return null;
        }
        String Min = time.substring(i1+1,i1+3).trim();;
        String Hr = time.substring(i1-2,i1).trim();

        int i2 = time.indexOf('-');
        String month = time.substring(i2+1,i2+3).trim();;
        String date = time.substring(i2-2,i2).trim();
        int overall[] = new int[3];
        overall[0] = Integer.parseInt(Hr);
        overall[1] = Integer.parseInt(Min);
        overall[2] = Integer.parseInt(date);
        return overall;
    }

    public String toHRSMINS(int mins)
    {
        int hrs=0;
        for(;mins>=60;mins=mins-60)
        {
            hrs++;
        }
        
        return (hrs<10 ? "0"+hrs : hrs) + ":" + (mins<10 ? "0"+mins : mins);
    }
}