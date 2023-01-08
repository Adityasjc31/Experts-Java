import java.io.*;
import java.net.*;
import java.util.*;
public class URL_Checker
{
    public static String id[],defaultPattern="1,3,4,6,8,9,10,12,13,15,17,19,22,29",pattern,testf[];
    public static boolean nopattern=true;
    public static void main(String args[])
    {
        String str = "https://97d967a9-c4b9-4fe5-9894-c051b4306386.usrfiles.com/ugd/97d967_";
        boolean first = false;double c=0;
        boolean p = false;
        try
        {
            initIDs();
            System.out.println("Do you want to check previous Data also\nSelect your choice by entering a boolean value");
            boolean pd = new Scanner(System.in).nextBoolean();

            if(pd)
            {
                for(int x=0;x<id.length;x++)
                {
                    URL url = new URL(str+id[x]+".pdf");
                    URLConnection urlc = url.openConnection();
                    urlc.connect();
                    try
                    {
                        BufferedReader in = new BufferedReader(new InputStreamReader(urlc.getInputStream()));
                    }
                    catch(Exception e)
                    {
                        System.out.println(c+" : "+e.getMessage());
                        c++;
                        continue;
                    }

                    System.out.println(urlc.getURL());
                    p=true;
                    if(p)
                    {
                        System.out.println("Found Something..\nPress Enter to continue");
                        String s = new Scanner(System.in).nextLine();
                    }
                }
            }
        }
        catch(FileNotFoundException e)
        {
            id = new String[1];
        }
        catch(Exception e1)
        {
            System.out.println(e1.getMessage());
        }
        System.out.println("Data Stored : "+id.length);
        System.out.println("Enter pattern or if you want to use default pattern type default");
        String t = new Scanner(System.in).nextLine();
        System.out.println("Enter number of alphabets : ");
        alpha_limit = new Scanner(System.in).nextInt();
        if(alpha_limit == 0)
        {
            alpha_limit = 26;
        }
        if(t.equalsIgnoreCase("default"))
        {
            pattern = defaultPattern;
            nopattern=false;
        }
        else if(t.length()!=0)
        {
            pattern=t;
            nopattern=false;
        }
        else
        {
            pattern="";
        }

        c=id.length;
        outer:
        while(true)
        {
            try
            {
                code_force();
                if(testf==null)
                {
                    String s=str+testF+".pdf";
                    if(isDuplicatedElement(testF))
                    {
                        continue;
                    }
                    push(testF,first);
                    first = true;

                    URL url = new URL(s);
                    URLConnection urlc = url.openConnection();

                    writeLinks(s);
                    writeIDs();
                    urlc.connect();

                    BufferedReader in = new BufferedReader(new InputStreamReader(urlc.getInputStream()));

                    System.out.print("\u0007");
                    System.out.println(urlc.getURL());
                    break;
                }
                else
                {
                    for(int x=0;x<testf.length;x++)
                    {
                        String s=str+testf[x]+".pdf";
                        if(isDuplicatedElement(testf[x]))
                        {
                            continue;
                        }
                        push(testf[x],first);
                        first = true;

                        URL url = new URL(s);
                        URLConnection urlc = url.openConnection();

                        writeLinks(s);
                        writeIDs(testf[x]);
                        urlc.connect();
                        try
                        {
                            BufferedReader in = new BufferedReader(new InputStreamReader(urlc.getInputStream()));

                            System.out.print("\u0007");
                            System.out.println(urlc.getURL());
                            break outer;
                        }
                        catch(Exception e)
                        {
                            c++;
                            System.out.println(c+" : "+e.getMessage());
                        }
                    }
                }
            }
            catch(Exception e)
            {
                c++;
                System.out.println(c+" : "+e.getMessage());
            }
        }
    }

    public static void writeLinks(String s)throws IOException
    {
        FileWriter fw = new FileWriter("E:\\Paperlinks\\links.txt",true);
        BufferedWriter bw = new BufferedWriter(fw);
        PrintWriter pw = new PrintWriter(bw);

        pw.println(s);

        pw.close();
        bw.close();
        fw.close();
    }

    public static void writeIDs()throws IOException
    {
        FileWriter fw = new FileWriter("E:\\Paperlinks\\ids.txt",true);
        BufferedWriter bw = new BufferedWriter(fw);
        PrintWriter pw = new PrintWriter(bw);

        pw.println(testF);

        pw.close();
        bw.close();
        fw.close();
    }

    static int index_LastCharacter;
    public static void writeIDs(String val)throws IOException
    {
        FileWriter fw = new FileWriter("E:\\Paperlinks\\ids.txt",true);
        BufferedWriter bw = new BufferedWriter(fw);
        PrintWriter pw = new PrintWriter(bw);

        pw.println(val);

        pw.close();
        bw.close();
        fw.close();
    }

    public static void initIDs()throws IOException
    {
        FileReader fr = new FileReader("E:\\Paperlinks\\ids.txt");
        BufferedReader br = new BufferedReader(fr);
        String t = "";
        double c = 0;
        while((t=br.readLine())!=null)
        {
            if(t.length()!=0)
                c++;
        }

        br.close();
        fr.close();
        id = new String[(int)c];

        fr = new FileReader("E:\\Paperlinks\\ids.txt");
        br = new BufferedReader(fr);
        t = "";
        for(int x=0;x<c;x++)
        {
            id[x] = br.readLine();
        }

        br.close();
        fr.close();
    }

    public static boolean isDuplicatedElement(String s)
    {
        if(id.length == 0 )
        {
            return false;
        }
        for(int x=0;x<id.length;x++)
        {
            if(id[x].equals(s))
            {
                return true;
            }
        }
        return false;
    }

    public static void push(String val,boolean b)
    {
        if(b || id.length==0)
        {
            String a[] = new String[id.length+1];
            for(int x=0;x<id.length;x++)
            {
                a[x]=id[x];
            }
            a[a.length-1] = val;
            id=a;
        }
        else
        {
            id[id.length-1]=val; 
        }
    }

    public static void push(String val)
    {
        String a[] = new String[id.length+1];
        a[a.length-1] = val;
        id=a;
    }
    static int alpha_limit;
    static String dummy,testF;

    public static void code_force()
    {
        array_Filler();
        dummy_value();
        dataAnalyserFill();
    }

    public static void dataAnalyserFill()
    {
        char ch[] = dummy.toCharArray();
        if(!nopattern)
        {
            Pattern p = new Pattern(pattern,dummy,ar);
            if(p.check())
            {
                testF = dummy;
            }
            else
            {
                testF = p.correctPattern();
            }
        }
        else if(nopattern)
        {
            Pattern p = new Pattern(dummy,ar);
            Pattern.AnalysePatternKnownIds(code);
            if(p.checkUniversal())
            {
                testF = dummy;
            }
            else
            {
                testf = p.correctPatternUniversal();
            }
        }
        else
        {
            testF = dummy;
        }
    }

    public static void dummy_value()
    {
        for(int x=0;x<32;x++)
        {
            int r = (int)(((((ar.length-1)-0+1)*Math.random())+0));
            dummy = dummy + ar[r];
        }
        //System.out.println(dummy);
    }

    public static void setAlpha_Limit(int val)
    {
        alpha_limit = val;
    }

    static char ar[] = new char[alpha_limit+10];
    public static void array_Filler()
    {
        //char chB[] = new char[26];
        ar = new char[alpha_limit+10];
        char chS[] = new char[26];
        char no[]= new char[10];
        int i=0;
        dummy="";
        for(int x=0;x<alpha_limit;x++)
        {
            //chB[x] = (char)(x+65);
            chS[x] = (char)(x+97);
        }

        for(int x=0;x<=9;x++)
        {
            no[x] = (char)(x+48);
        }

        /*for(int x=0;x<26;x++)
        {
        ar[i++]=chB[x];
        }*/

        for(int x=0;x<alpha_limit;x++)
        {
            ar[i++]=chS[x];
        }
        index_LastCharacter = i-1;
        for(int x=0;x<=9;x++)
        {
            ar[i++]=no[x];
        }
    }
    static String code[]={"37b87b9d039940a9b8b7538cbaf7c07b","e1b87c95893c45379493bf71640e28f5","1c7e64137c774a30a2e7a40a6e2f8e9b","26d61f04f2e748d08915150a580f1ce1","25e56aca81f74109a17b3ff5fbbb8e74","eaed94d8bb4546c29b7559581bc031aa","2e87625f55ac4aa4b7263ceca6084f37"};
    public static void checker()
    {
        //Scanner sc = new Scanner(System.in);
        //System.out.println("Enter a url 1");
        String str =    code[0];
        String str1=    code[1];
        String str3 =   code[2]; //"y4075x2312914233b994vf7aqkzm98vk";
        //System.out.println(str.length()==str3.length());
        //System.out.println("Enter a url 2");
        //String str1 = sc.next();

        for(int x=0;x<32;x++)
        {
            char ch1 = str.charAt(x);

            if(Character.isDigit(ch1))
            {
                System.out.print("d  ");
            }
            else if(Character.isLetter(ch1))
            {
                System.out.print("l  ");
            }
            else
            {
                System.out.print("0  ");
            }
        }
        System.out.println();
        for(int x=0;x<32;x++)
        {
            char ch1 = str1.charAt(x);

            if(Character.isDigit(ch1))
            {
                System.out.print("d  ");
            }
            else if(Character.isLetter(ch1))
            {
                System.out.print("l  ");
            }
            else
            {
                System.out.print("0  ");
            }
        }
        System.out.println();
        for(int x=0;x<32;x++)
        {
            char ch1 = str3.charAt(x);

            if(Character.isDigit(ch1))
            {
                System.out.print("d  ");
            }
            else if(Character.isLetter(ch1))
            {
                System.out.print("l  ");
            }
            else
            {
                System.out.print("0  ");
            }
        }
        System.out.println();
        /*for(int x=0;x<32;x++)
        {
        char ch1 = str.charAt(x);
        char ch2 = str1.charAt(x);
        char ch3 = str3.charAt(x);
        if(Character.isDigit(ch1) && Character.isDigit(ch2) && Character.isDigit(ch3))
        {
        System.out.print("d  ");
        }
        else if(Character.isLetter(ch1) && Character.isLetter(ch2) && Character.isDigit(ch3))
        {
        System.out.print("l  ");
        }
        else
        {
        System.out.print("0  ");
        }
        }*/

    }
}