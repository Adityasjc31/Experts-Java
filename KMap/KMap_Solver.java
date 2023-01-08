package KMap;

import java.util.*;
class KMap_Solver extends KMap
{
    private  int maxDigits;
    private  int position[];
    private  char symbol;
    private  int question[];
    public void set()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter limit of K - Map");
        maxDigits = new Scanner(System.in).nextInt();
        if(maxDigits == 8)
        {
            position = new int[8];
            KMap = new int[rows=position.length/4][cols];
            for(int x=0;x<position.length;x++)
            {
                position[x] = x;
            }
            //display(position);
            /*interchange(position,2,3);
            //display(position);
            interchange(position,6,7);*/
            //display(position);
        }
        else if(maxDigits == 16)
        {
            position = new int[16];
            KMap = new int[rows=position.length/4][cols];
            for(int x=0;x<position.length;x++)
            {
                position[x] = x;
            }
            /*interchange(position,8,11,12,15);
            interchange(position,2,3);
            interchange(position,6,7);
            interchange(position,10,11);
            interchange(position,14,15);*/
            //display(position);
        }

        System.out.println("Enter the question : ");
        String biffercation = sc.nextLine();

        int bifferBracketstart = biffercation.indexOf('(');
        int bifferBracketEnd = biffercation.indexOf(')');

        String syl = biffercation.substring(0,6);
        syl=syl.trim();
        syl=syl.toUpperCase();
        if(syl.matches("PI") || syl.indexOf("P")!=-1)
        {
            symbol = PI;
        }
        else if(syl.matches("SIGMA") || syl.indexOf("S")!=-1 )
        {
            symbol = SIGMA;
        }

        String q = biffercation.substring(bifferBracketstart+1 , bifferBracketEnd);
        q=q.trim();

        question = replacer(q);
        solver();
    }

    public int[] replacer(String s)
    {
        s = s+",";
        int i = s.indexOf(',');
        int a[] = new int[0];
        for(int x=0;x<s.length();x++)
        {
            if(i!=-1)
            {
                String t = s.substring(x,i);
                x=i;
                i = s.indexOf(',',x+1);
                int ti=Integer.parseInt(t);
                a = push(a,ti);
            }
        }
        sort(a);
        return a;
    }

    public  int[] push(int ar[],int val)
    {
        int a[] = new int[ar.length+1];
        for(int x=0;x<ar.length;x++)
        {
            a[x] = ar[x];
        }
        a[a.length - 1] = val;
        return a;
    }

    public  void solver()
    {
        if(symbol==SIGMA)
        {
            set=1;
        }
        else if(symbol == PI)
        {
            for(int x=0,i=0,p=0;x<KMap.length;x++)
            {
                for(int y=0;y<KMap[x].length;y++)
                {
                    KMap[x][y] = 1;
                }
            }
        }

        outer:
        for(int x=0,i=0,p=0;x<KMap.length;x++)
        {
            for(int y=0;y<KMap[x].length;y++)
            {
                int t = position[p++];
                if(t == question[i])
                {
                    KMap[x][y] = set;
                    i++;
                }
                if(i==question.length)
                {
                    break outer;
                }
            }
        }
        //display(KMap);
        //System.out.println();
        if(maxDigits == 16)
        {
            for(int x=0;x<4;x++)
            {
                interchange(KMap,x,2,x,3);
            }

            int t[] = KMap[2];
            KMap[2] = KMap[3];
            KMap[3] = t;
        }
        else if(maxDigits == 8)
        {
            for(int x=0;x<2;x++)
            {
                interchange(KMap,x,2,x,3);
            }
        }
        display(KMap);
        anaylseKMap();
    }

    private  int octets=0,pairs=0,singles=0;
    private  String[] octet[],pair[],single;
    private CountQuads cq;
    public  void anaylseKMap()
    {
        octet = pair = new String[0][0];
        single = new String[0];
        cq = new CountQuads();
        cq.countQuads();
        System.out.println(cq.getQuads());
    }

    public  void interchange(int ar[][],int x1,int y1,int x2,int y2)
    {
        int t = ar[x1][y1];
        ar[x1][y1] = ar[x2][y2];
        ar[x2][y2] = t;
    }

    public  int[] StringToInteger(String n)
    {
        char ch [] = n.toCharArray();
        int ar[] = new int[ch.length];
        for(int x=0;x<ch.length;x++)
        {
            if(Character.isDigit(ch[x]))
            {
                ar[x] = ch[x] - 48;
            }
            else 
            {
                if(Character.isUpperCase(ch[x]))
                {
                    ar[x] = ch[x] - 64;
                }
                else
                {
                    ar[x] = ch[x] - 96;
                }
            }
        }
        return ar;
    }

    public  void interchange(int ar[],int start,int end,int changeStart,int changeEnd)
    {
        int i1Start = search(ar,start);
        int i2Start = search(ar,changeStart);

        int i1End = search(ar,end);
        int i2End = search(ar,changeEnd);

        int temp[] = new int[(i1End - i1Start) +1];
        for(int x=0,y=i1Start;x<temp.length;x++)
        {
            temp[x] = ar[y++];
        }
        //display(ar);
        //display(temp);

        for(int x=i2Start;x<ar.length;x++)
        {
            ar[i1Start++] = ar[x];
        }
        //display(ar);

        for(int x=i2Start,y=0;x<ar.length;x++,y++)
        {
            ar[x] = temp[y];
        }
        //display(ar);
    }

    public  void interchange(int ar[],int val,int change)
    {
        for(int x=0;x<ar.length;x++)
        {
            if(ar[x] == val)
            {
                int y=0;
                for(;y<ar.length;y++)
                {
                    if(ar[y] == change)
                    {
                        break;
                    }
                }
                ar[x] = change;
                ar[y] = val;
                break;
            }
        }
    }
}