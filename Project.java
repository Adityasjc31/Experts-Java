import java.util.*;
import java.io.*;
class Project
{
    public Project()
    {

    }

    public void read(File fr)
    {
        Scanner sc = new Scanner(fr);
        sc.useDelimiter("\n");
        String l1 = sc.nextLine();
        StringTokenizer st = new StringTokenizer(l1," ");
        int con = Integer.parseInt(st.nextToken());
        int pro = Integer.parseInt(st.nextToken());
        String read;
        while((read = sc.nextLine())!=null)
        {
            String langs=null,con[]=null;
            for(int i=0;i<=con;i++)
            {
                st = new StringTokenizer(read," ");
                String con_name[] = st.nextToken();
                con = push(con,con_name);
                int lan = Integer.parseInt(st.nextToken());
                for(int x=1;x<=lan;x++)
                {
                    langs = push(langs,sc.nexLine());
                }
            }

            for(int i=0;i<=pro ;i++)
            {
                st = new StringTokenizer(read," ");
                
            }
        }
    }

    public static String[] push(String ar[],String val)
    {
        if(ar==null)
        {
            String arr[] = new String[1];
            arr[0] = val;
            return arr;
        }

        String arr[] = new String[ar.length+1];
        for(int x=0;x<ar.length;x++)
        {
            arr[x] = ar[x];
        }
        arr[arr.length-1] = val;
        return arr;
    }
}