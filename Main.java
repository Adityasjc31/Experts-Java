import java.util.*;
class Main {
    //static String str[];
    public static int diffSum(int n,int m,int arr[])
    {
        int summax=0,summin=0;
        int temp = arr[0];
        for(int x=0;x<arr.length;x++)
        {
            if(arr[x] < arr[temp])
            {
                temp = arr[x];
            }
        }
        System.out.println(temp);
        return 1;
    }

    public static void main1(String args[])
    {
        int i=5;
        System.out.printf("%d%d%d",++i,i,i++);
        //String s1 = "was";
        //str = s1.split("w");
        //StringTokenizer st =  new StringTokenizer(s1," ");
        /*while(st.hasMoreElements())
        {
        System.out.println(st.countTokens());
        st.nextToken();
        }*/
    }
    /*
    for(int z=0;z<keys.length;z++)
    {
    outer :
    for(int x=0;x<words.length;x++)
    {
    for(int y=0;y<words[x].length();)
    {
    String ch="";
    if((y+S.length()) < words[x].length())
    {
    ch = words[x].substring(y,y+S.length());
    }
    if(ch.equalsIgnoreCase(S) )
    {
    op++;
    System.out.println(words[x]+"=op="+op);
    }
    else if(words[x].indexOf(""+keys[z])>-1 && words[x].indexOf(S)== -1)
    {
    String str[] = words[x].split(keys[z]+"");
    int len = str.length;
    op+= 2 * (((len-1)==0) ? 1 : (len-z)) * (S.indexOf(keys[z]+"")+1);
    System.out.println(words[x]+"=op="+op);
    continue outer;
    }

    if((y+S.length()) < words[x].length())
    {
    y = y+S.length();
    }
    else
    {
    y++;
    }
    }
    }
    }*/
    /*{
    for(int x=0;x<keys.length;x++)
    {
    StringTokenizer st = new StringTokenizer("*"+T," ");
    int lenw = st.countTokens();
    while(st.hasMoreTokens())
    {
    String str = st.nextToken();
    String temp[] = null;
    temp = str.split(keys[x]+"");
    int len = temp.length;
    if(str.indexOf(keys[x])!=-1)
    {
    if(len==2 && keys[x] == str.charAt(0))
    {
    op+=4;
    }
    else
    {
    op += (len*2);
    }
    }
    }
    }
    }*/
    public static void main11(String[] args) {
        Scanner sc = new Scanner(System.in); 
        int[] a = new int[1000];
        int s,i,j,t,l1=0,l2=0,c=0;

        System.out.println("Enter the no of sample");
        s = sc.nextInt();

        System.out.println("Enter the no of range");
        t = sc.nextInt();

        System.out.println("Enter the numbers");
        for (i = 0; i < s; i++) {
            a[i] = sc.nextInt();
        }

        for (i = 0; i< t; i++) {
            System.out.println("Enter the max and min range");
            l1 = sc.nextInt();
            l2 = sc.nextInt();
            for (j = 0; j < s; j++) { 
                if((a[j]>=l1)&&(a[j]<=l2))
                    c++;            
            }
            System.out.println(c);
            c=0;
        }

    }
}