package KMap;

public class CountQuads extends KMap
{
    private static String quad[][];
    private static int quads;
    public CountQuads()
    {
        quad = new String[0][0];
        quads = 0;
    }

    public void countQuads()
    {
        outer:
        for(int x=0;x<KMap.length;x++)
        {
            inner:
            for(int y=0;y<KMap[x].length;y++)
            {
                boolean bv=false,bz=false;
                if(KMap[x][y] == set)
                {
                    bv = horizontalCountQuads(KMap[x],x);
                    bz = verticalCountQuads(x);
                }
                if(KMap[x][y] == set)
                {
                    int right=y+1,left=y-1,bottom=x+1,top=x-1;
                    if(left != -1 && top != -1)
                    {
                        boolean b=false,b1=false,b2=false;
                        b = (KMap[x][left] == set);
                        b1 = (KMap[top][y] == set);
                        b2 = (KMap[top][left] == set);

                        if(b && b1 && b2)
                        {
                            String t  = x+""+y;
                            String t1 = x+""+left;
                            String t2 = top+""+y;
                            String t3 = top+""+left;
                            String ar[] = {t,t1,t2,t3};
                            t = makeItToMatchFormat(t,t1,t2,t3);
                            if(removeRedunancy(quad,t))
                            {
                                quad = push(quad,ar);
                                quads++;
                            }
                        }
                    }

                    if(left == -1 || top == -1 || right == KMap[x].length || bottom == KMap.length)
                    {
                        boundaryCountQuads(left,top,right,bottom,x,y);
                        if(bv || bz)
                        {
                            continue outer;
                        }
                        else
                        {
                            continue;
                        }
                    }

                }
            }
        }
        display(quad);
    }

    public String[][] push(String ar[][],String a[])
    {
        String arr [][] = null;
        arr = new String[ar.length+1][cols];
        arr = previousPush(ar,arr);
        arr[arr.length-1] = a;
        return arr;
    }

    public boolean verticalCountQuads(int x)
    {
        boolean b[] = new boolean[KMap.length];
        for(int y=0;y<KMap.length;y++)
        {
            b[y] = (KMap[y][x] == set);
        }

        if(booleanNutirlizer(b))
        {
            String t = makeItToMatchFormat(x,false);
            if(removeRedunancy(quad,t))
            {
                quad = push(quad,x,false);
                //display(quad);
                quads++;
            }
        }
        return booleanNutirlizer(b);
    }

    public boolean horizontalCountQuads(int ar[],int index)
    {
        boolean b[]=new boolean[ar.length];
        for(int x=0;x<ar.length;x++)
        {
            b[x] = (ar[x] == set);
        }

        if(booleanNutirlizer(b))
        {
            String t = makeItToMatchFormat(index,true);
            if(removeRedunancy(quad,t))
            {
                quads++;
                quad = push(quad,index,true);
            }
        }
        return booleanNutirlizer(b);
    }

    public void setQuads(String ar[][])
    {
        quad = ar;
    }

    public void boundaryCountQuads(int left,int top,int right,int bottom,int x,int y)
    {
        //int i=-1;
        if(right == KMap[x].length)
        {
            right = 0;
            //i=y + 1;
        }
        if(left  == -1)
        {
            left = KMap[x].length-1;
            //i=0;
        }
        if(bottom == KMap[x].length)
        {
            bottom = 0;
        }
        if(top  == -1)
        {
            top = KMap.length-1;
        }
        if(edgesQuadCounter())
        {
            quads++;
            return ;
        }

        boolean b=false,b1=false,b2=false;
        b = (KMap[bottom][y] == set);
        b1 = (KMap[bottom][left] == set);
        b2 = (KMap[x][left] == set);
        if(b1 && b && b2)
        {
            String t  = x+""+y;
            String t1 = x+""+left;
            String t2 = bottom+""+left;
            String t3 = bottom+""+y;
            String ar[] = {t,t1,t2,t3};
            t = makeItToMatchFormat(t,t1,t2,t3);
            if(removeRedunancy(quad,t))
            {
                quad = push(quad,ar);
                quads++;
            }
        }

        /*b = (KMap[y][right] == set);
        b1 = (KMap[top][right] == set);
        b2 = (KMap[top][y] == set);
        if(b1 && b && b2)
        {
        System.out.println("Quad");
        }*/
    }

    public  boolean edgesQuadCounter()
    {
        if(KMap[0][0] == set)
        {
            if(KMap[KMap.length - 1][0] == set)
            {
                if(KMap[0][KMap[0].length - 1]  == set)
                {
                    if(KMap[KMap.length-1][KMap[KMap.length -1].length -1] == set)
                    {
                        //System.out.println("EDGE QUAD");
                        String t = makeItToMatchFormat("00", KMap.length - 1+""+0, 0+""+(KMap[0].length- 1), KMap.length-1+""+(KMap[KMap.length -1].length -1));
                        if(removeRedunancy(quad,t))
                        {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public String[][] push(String ar[][],int index,boolean horizontal)
    {
        int n1=ar.length + 1,n2 = cols;
        String arr [][] = new String[n1][n2];
        arr = previousPush(ar,arr);
        for(int y=0; y<arr[arr.length -1 ].length; y++)
        {
            if(horizontal)
            {
                arr[arr.length-1][y] = index+""+y;
            }
            else
            {
                arr[arr.length-1][y] = y+""+index;
            }
        }
        //arr[index];
        return arr;
    }

    public int getQuads()
    {
        return quads;
    }
}