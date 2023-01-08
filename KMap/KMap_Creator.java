package KMap;

import java.util.*;
class KMap_Creator extends KMap
{
    private static int questionArray[],strength;
    private static char selected;
    private static String question[] = new String[0];
    public static void main(String args[])
    {
        String mch;
        do
        {
            Scanner sc = new Scanner(System.in);
            System.out.println("\fSelect Question\n1 - K-Map(0 - 15)\n2 - K-Map(0 - 7)\n3 - K-Map (Random)\n4 - Exit\nEnter your Choice");
            mch = sc.nextLine();
            char posop='\u0000';
            int ch;
            {
                int i1 = mch.indexOf(",");
                try
                {
                    String t = mch.substring(0,i1);
                    t.trim();
                    ch = Integer.parseInt(t);
                    t = mch.substring(i1+1);
                    t.trim();
                    posop = t.charAt(0);
                }
                catch(Exception e)
                {
                    ch = Integer.parseInt(mch);
                }
            }
            switch(ch)
            {
                case 1:
                selected = 'F';
                break;

                case 2:
                selected = '7';
                break;

                case 3:
                selected = '\u0000';
                break;

                case 4:
                break;

                default:
                System.out.println("Wrong Choice");
            }
            if(ch>=1 && ch<=3)
            {
                generate();
                char symbol='\u0000';

                int POSOP=0;
                if(!(posop =='s' || posop == 'S' || posop =='p' || posop == 'P'))
                {
                    POSOP=getNumber(2,1);
                }

                if(posop =='s' || posop == 'S' || POSOP == 1)
                {
                    symbol = SIGMA;
                }
                else if(posop =='p' || posop == 'P' || POSOP == 2)
                {
                    symbol = PI;
                }
                display(questionArray,symbol);

                System.out.println("Press enter key to continue");
                sc.nextLine();
            }
        }while(!(mch.charAt(0) == '4'));
    }

    public static void display(int ar[],char ch)
    {
        String t = (ch+" ( ");
        for(int x=0;x<ar.length;x++)
        {
            t += ar[x];
            if(x<ar.length-1)
            {
                t += ',';
            }
        }
        t += " )";
        System.out.println(t);
        push(t);
    }

    public static void push(String val)
    {
        String a[] = new String[question.length + 1];
        for(int x=0;x<question.length;x++)
        {
            a[x] = question[x]; 
        }
        a[a.length -1] = val;
        question = a;
    }

    public static void generate()
    {
        int length = selector();
        if(length<5)
        {
            boolean b = true;
            while(b)
            {
                length = selector();
                if(length>=5)
                {
                    b=false;
                }
            }
        }
        questionArray = new int[length+1];
        fillWithAnyValue(questionArray,-1);
        assignValue(questionArray);
    }

    public static void fillWithAnyValue(int ar[],int val)
    {
        for(int x=0;x<ar.length;x++)
        {
            ar[x]=val;
        }
    }

    public static void assignValue(int ar[])
    {
        for(int x=0;x<ar.length;x++)
        {
            int t = getNumber(strength,0);
            boolean b;
            if((b=searchResult(ar,t)))
            {
                while(b)
                {
                    t = getNumber(strength,0);
                    if(!searchResult(ar,t))
                    {
                        b=false;
                    }
                }
            }
            ar[x]=t;
        }
        sort(ar);
    }
    
    public static boolean searchResult(int ar[],int n)
    {
        return search(ar,n) != -1;
        /*for(int x=0;x<ar.length;x++)
        {
            if(ar[x] == n)
            {
                return true;
            }
        }
        return false;*/
    }

    public static int selector()
    {
        int digits = (2-1+1);
        int r=0;
        if(selected == '\u0000')
            r = (int)((digits*Math.random())+1);
        //System.out.println(r);
        if(selected == 'F' || r==1)
        {
            strength = 15;
            r = getNumber(strength,0);
        }
        else if(selected == '7' || r==2)
        {
            strength = 7;
            r = getNumber(strength,0);
        }
        return r;
    }

    public static int getNumber(int max,int min)
    {
        int digits = (max-min+1);
        int r = (int)((digits*Math.random())+min);
        //System.out.println(r);
        return r;
    }
}