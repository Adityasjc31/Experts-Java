class Pattern
{
    private String pattern,str;
    private char selection[];
    private int indexs [],digits[];
    public Pattern()
    {
        pattern=null;
    }

    public Pattern(String pattern,String str)
    {
        this.pattern = pattern;
        this.str=str;
        indexCreator();
    }

    public Pattern(String pattern,String str,char select[])
    {
        this.pattern = pattern;
        this.str=str;
        selection = select;
        indexCreator();
    }

    public Pattern(String str,char select[])
    {
        this.str=str;
        selection = select;
    }

    public void setSelection(char str[])
    {
        selection=str;
    }

    public void setPattern(String str)
    {
        this.pattern=str;
        indexCreator();
    }

    public void setString(String str)
    {
        this.str=str;
    }

    public String[] correctPatternUniversal()
    {
        char ar [][] = new char[patternDFIds.length][patternDFIds[0].length];
        for(int x=0;x<ar.length;x++)
        {
            for(int y=0;y<ar[x].length;y++)
            {
                char ch = str.charAt(y);
                if(Character.isLetter(ch) && patternDFIds[x][y] == 'd')
                {
                    int r = (int)((((9-0)+1)*Math.random())+0);
                    ar[x][y] = (r+"").charAt(0);
                }
                else if(Character.isDigit(ch) && patternDFIds[x][y] == 'l')
                {
                    int r = (int)((((URL_Checker.index_LastCharacter - 0)+1)*Math.random())+0);
                    ar[x][y] = selection[r];
                }
                else
                {
                    ar[x][y] = ch;
                }
            }
        }
        commonPattern();

        String cp="";
        for(int x=0;x<commonPattern.length;x++)
        {
            if(commonPattern[x] == 'd')
            {
                int r = (int)((((9-0)+1)*Math.random())+0);
                cp = cp + r;
            }
            else if(commonPattern[x] == 'l')
            {
                int r = (int)((((URL_Checker.index_LastCharacter - 0)+1)*Math.random())+0);
                cp = cp + r;
            }
            else
            {
                int r = (int)((((2-1)+1)*Math.random())+1);
                if(r==1)
                {
                    int r1 = (int)((((9-0)+1)*Math.random())+0);
                    cp = cp + r1;
                }
                else
                {
                    int r1 = (int)((((URL_Checker.index_LastCharacter - 0)+1)*Math.random())+0);
                    cp = cp + selection[r1];
                }
            }
        }

        String a[] = new String[patternDFIds.length+2];
        for(int x=0;x<ar.length;x++)
        {
            String t="";
            for(int y=0;y<ar[x].length;y++)
            {
                t+= ar[x][y]+"";
            }
            a[x]=t;
        }
        a[a.length - 2] = cp;
        String predict="";
        predict();
        for(int x = 0;x<predictVal.length;x++)
        {
            if(predictVal[x] == '0')
            {
                predict+=cp.charAt(0);
            }

            if(predictVal[x] == 'd')
            {
                int r = (int)((((9-0)+1)*Math.random())+0);
                predict += r;
            }
            else if(predictVal[x] == 'l')
            {
                int r = (int)((((URL_Checker.index_LastCharacter - 0)+1)*Math.random())+0);
                predict+= r;
            }
        }
        a[a.length-1]=predict;
        for(int x=0;x<a.length;x++)
        {
            System.out.println(a[x]);
        }

        /*for(int x=0;x<a.length;x++)
        {
        System.out.println(checkUniversal(a[x]));
        }*/

        /*String id[] = new String[patternDFIds.length+1];

        for(int x=0;x<a.length;x++)
        {
        id[x] = a[x];
        }
        id[id.length-1] = str;*/

        return a;
    }

    public String correctPattern()
    {
        char ch[]=new char[str.length()];
        int i=0,x=0;
        while(i<indexs.length)
        {
            int n = (int)((((selection.length-1)-0+1)*Math.random())+0);
            if(Character.isDigit(selection[n]))
            {
                if(!isindexCorrect(x+1))
                {
                    x = indexs[i]+1;
                }
                else
                {
                    x++;
                }
                if(Character.isLetter(str.charAt(indexs[i])))
                {
                    ch[indexs[i]]=selection[n];
                }
                else
                {
                    ch[indexs[i]]=str.charAt(indexs[i]);
                }
                i++;
            }
            else
            {
                ch[x] = str.charAt(x); 
            }
        }
        for(int y=0;y<ch.length;y++)
        {
            if(ch[y] == '\u0000')
            {
                ch[y] = str.charAt(y); 
            }
        }
        String t = new String(ch);
        return t;
    }

    private boolean isindexCorrect(int f)
    {
        for(int x=0;x<indexs.length;x++)
        {
            if(indexs[x]==f)
            {
                return false;
            }
        }
        return true;
    }

    static boolean b[] ;

    public boolean checkUniversal(String str)
    {
        b= new boolean[patternDFIds.length];
        for(int x=0 ;x<b.length;x++){b[x]=true;}

        for(int x=0 ;x<patternDFIds.length;x++)
        {
            for(int y=0 ;y<patternDFIds.length;y++)
            {
                char c = str.charAt(y);
                if(Character.isLetter(c) && patternDFIds[x][y] == 'd')
                {
                    b[x]=false;
                    break;
                }
                else if(Character.isDigit(c) && patternDFIds[x][y] == 'l')
                {
                    b[x]=false;
                    break;
                }
            }
        }
        boolean f=false;
        for(int x=0 ;x<b.length;x++)
        {
            if(b[x])
            {
                f=true;
                break;
            }
        }
        return f;
    }

    public boolean checkUniversal()
    {
        b= new boolean[patternDFIds.length];
        for(int x=0 ;x<b.length;x++){b[x]=true;}

        for(int x=0 ;x<patternDFIds.length;x++)
        {
            for(int y=0 ;y<patternDFIds.length;y++)
            {
                char c = str.charAt(y);
                if(Character.isLetter(c) && patternDFIds[x][y] == 'd')
                {
                    b[x]=false;
                    break;
                }
                else if(Character.isDigit(c) && patternDFIds[x][y] == 'l')
                {
                    b[x]=false;
                    break;
                }
            }
        }
        boolean f=false;
        for(int x=0 ;x<b.length;x++)
        {
            if(b[x])
            {
                f=true;
                break;
            }
        }
        return f;
    }

    public boolean check()
    {
        char ch[] = str.toCharArray();
        int i=0;
        boolean b=true;
        while(i<indexs.length)
        {
            if(!Character.isDigit((ch[indexs[i++]]+"").charAt(0)))
            {
                b=false;
            }
        }
        return b;
    }

    private void indexCreator()
    {
        char ar [] = pattern.toCharArray();
        indexs = new int[ar.length-countCommas()-count2Digits()];
        for(int x=0,i=0;x<ar.length;x++)
        {
            if(ar[x]!=',')
            {
                indexs[i]=ar[x]-48;
                if((x+1)!=ar.length)
                {
                    if(ar[x+1]!=',' && Character.isDigit(ar[x+1]))
                    {
                        String s = ar[x]+""+ar[x+1];
                        indexs[i]=Integer.parseInt(s);
                        x++;
                    }
                }
                i++;
            }
        }
    }

    private int count2Digits()
    {
        char ar [] = pattern.toCharArray();
        int c=0;
        for(int x=0;x<ar.length;x++)
        {
            if(ar[x]!=',')
            {
                if((x+1)!=ar.length)
                {
                    if(ar[x+1]!=',' && Character.isDigit(ar[x+1]))
                    {
                        c++;
                    }
                }
            }
        }
        return c;
    }

    private int countCommas()
    {
        char ar [] = pattern.toCharArray();
        int c=0;
        for(int x=0;x<ar.length;x++)
        {
            if(ar[x]==',')
            {
                c++;
            }
        }
        return c;
    }
    static int digitsPlaces[][];
    static char patternDFIds[][];
    public static void AnalysePatternKnownIds(String ar[])
    {
        digitsPlaces = new int[ar.length][0];
        patternDFIds = new char[ar.length][0];
        boolean f=false;
        for(int x=0;x<ar.length;x++)
        {
            String str = ar[x];
            for(int y=0;y<str.length();y++)
            {
                char ch=str.charAt(y);
                if(Character.isDigit(ch))
                {
                    digitsPlaces[x] = push(digitsPlaces[x],y);
                }
                if(Character.isLetter(ch))
                {
                    patternDFIds[x] = push(patternDFIds[x],'l');
                }
                else if(Character.isDigit(ch))
                {
                    patternDFIds[x] = push(patternDFIds[x],'d');
                }
            }
        }
    }

    static char commonPattern[];
    public static void commonPattern()
    {
        /*for(int x=0;x<patternDFIds.length;x++)
        {
        for(int y=0;y<patternDFIds[x].length;y++)
        {
        System.out.print(patternDFIds[x][y]+"  ");
        }
        System.out.println();
        }*/

        commonPattern = new char[patternDFIds[0].length];
        for(int y=0;y<patternDFIds[0].length;y++)
        {
            boolean b=true;
            for(int x=0;x<patternDFIds.length;x++)
            {
                if(patternDFIds[x][y] != 'l')
                {
                    b=false;
                }
            }

            boolean b1=true;
            for(int x=0;x<patternDFIds.length;x++)
            {
                if(patternDFIds[x][y] != 'd')
                {
                    b1=false;
                }
            }

            if(b)
            {
                //System.out.print("l  ");
                commonPattern[y] = 'l';
                continue;
            }

            if(b1)
            {
                //System.out.print("d  ");
                commonPattern[y] = 'd';
                continue;
            }

            // System.out.print("0  ");
            commonPattern[y] = '0';
        }
        //System.out.println();
        //predict();
    }

    static char predictVal[];
    public static void predict()
    {
        predictVal = new char[commonPattern.length];
        outer:
        for(int y=0;y<patternDFIds[0].length;y++)
        {
            int l=0,d=0;
            for(int x=0;x<patternDFIds.length;x++)
            {
                if(commonPattern[y]!='0')
                {
                    predictVal[y]='0';
                    //System.out.print("0  ");
                    continue outer;
                }

                if(patternDFIds[x][y] == 'l')
                {
                    l++;
                    continue;
                }

                if(patternDFIds[x][y] == 'd')
                {
                    d++;
                    continue;
                }
            }

            if(l>d)
            {
                predictVal[y]='l';
                //System.out.print("l  ");
            }
            else
            {
                predictVal[y]='d';
                //System.out.print("d  ");
            }
        }
    }

    public static char[] push(char ar[],char val)
    {
        char a[] = new char[ar.length+1];
        for(int x=0;x<ar.length;x++)
        {
            a[x]=ar[x];
        }
        a[a.length-1] = val;
        return a;
    }

    public static int[] push(int ar[],int val)
    {
        int a[] = new int[ar.length+1];
        for(int x=0;x<ar.length;x++)
        {
            a[x]=ar[x];
        }
        a[a.length-1] = val;
        return a;
    }
}