package KMap;

class KMap
{
    protected static char SIGMA = '∑' , PI = 'π';
    protected static int KMap[][];
    protected static int rows,cols=4,set;
    public KMap()
    {
    }

    public KMap(int K[][],int s,int r,int c)
    {
        KMap = K;
        set=s;
        rows = r;
        cols = r;
    }

    protected static void display(int ar[])
    {
        for(int x=0;x<ar.length;x++)
        {
            System.out.print(ar[x]+"\t");
        }
        System.out.println();
    }

    protected static void display(String ar[][])
    {
        for(int x=0;x<ar.length;x++)
        {
            for(int y=0;y<ar[x].length;y++)
            {
                System.out.print(ar[x][y]+"\t");
            }
            System.out.println();
        }
    }

    protected static void display(int ar[][])
    {
        for(int x=0;x<ar.length;x++)
        {
            for(int y=0;y<ar[x].length;y++)
            {
                System.out.print(ar[x][y]+"\t");
            }
            System.out.println();
        }
    }

    protected static void sort(int ar[])
    {
        for(int x=0;x<ar.length;x++)
        {
            int i=x;
            for(int y=x+1;y<ar.length;y++)
            {
                if(ar[y]<ar[i])
                {
                    i=y;
                }
            }
            int t=ar[x];
            ar[x]=ar[i];
            ar[i]=t;
        }
    }

    protected static int search(int ar[],int val)
    {
        for(int x=0;x<ar.length;x++)
        {
            if(ar[x] == val)
            {
                return x;
            }
        }
        return -1;
    }

    protected static String[][] previousPush(String originalArray[][],String changeArray[][])
    {
        for(int x=0;x<originalArray.length;x++)
        {
            for(int y=0;y<originalArray[x].length;y++)
            {
                changeArray[x][y] = originalArray[x][y];
            }
        }
        return changeArray;
    }

    public static boolean booleanNutirlizer(boolean b[])
    {
        for(int x=0;x<b.length;x++)
        {
            if(b[x]==false)
            {
                return false;
            }
        }

        return true;
    }
    
    public String makeItToMatchFormat(String t,String t1,String t2,String t3)
    {
        String s = "";
        s= t+","+t1+","+t2+","+t3+",";
        return s;
    }
    
    public String makeItToMatchFormat(int i,boolean horizontal)
    {
        String s = "";
        for(int x=0;x<cols;x++)
        {
            if(horizontal)
            {
                s = s + i+""+x+",";
            }
            else
            {
                s = s + x+""+i+",";
            }
        }
        return s;
    }

    public static boolean removeRedunancy(String ar[][],String match)
    {
        for(int x=0;x<ar.length;x++)
        {
            String t="";
            for(int y=0;y<ar[x].length;y++)
            {
                t += ar[x][y]+",";
            }
            if(match.equals(t))
            {
                return false;
            }
        }
        return true;
    }
    
    public static void mapRollCheck(String ar[][])
    {
        
    }
    
    public void setKMap(int ar[][])
    {
        KMap = ar;
    }
}