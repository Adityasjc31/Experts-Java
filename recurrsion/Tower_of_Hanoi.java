package recurrsion;

class Tower_of_Hanoi
{
    public static void toh(String t,int n,String s,String i,String d)
    {
        t=t+"\t";
        if(n>1)
        {
            toh(t,n-1,s,d,i);
        }
        System.out.println(t+s+"->" + d);
        if(n>1)
        {
            toh(t,n-1,i,s,d);
        }
    }
}