package project;

/**ISC 2017 Q9*/

import java.util.*;
class SwapSort
{
    String wrd,swapwrd,sortwrd;
    int len;
    
    SwapSort()
    {
        wrd=swapwrd=sortwrd=null;
        len=0;
    }
    
    void readword()
    {
        System.out.println("Enter a word in UpperCase");
        wrd = new Scanner(System.in).next();
        len = wrd.length();
        boolean b=true;
        //Checking whether the word is in UpperCase
        for(int x=0;x<len;x++)
        {
            if(Character.isLowerCase(wrd.charAt(x)))
            {
                b = false;
                break;
            }
        }
        if(!b)
        {
            System.out.println("Word is not in UpperCase");
            wrd=null;
        }
    }
    
    void swapchar()
    {
        //Swaping first and last word and storing it in swapwrd
        swapwrd = wrd.charAt(wrd.length() - 1) + wrd.substring(1,wrd.length()-1) + wrd.charAt(0);
    }
    
    void sortword()
    {
        for(char x='A';x<='Z';x++)
        {
            for(int y=0;y<len;y++)
            {
                if(wrd.charAt(y) == x)
                {
                    sortwrd += x;
                }
            }
        }
    }
    
    void display()
    {
        //Displaying the values
        System.out.println("Original Word : "+wrd);
        System.out.println("Swaped Word : "+swapwrd);
        System.out.println("Sorted Word : "+sortwrd);
    }
    
    public static void main(String args[])
    {
        SwapSort ss = new SwapSort();
        ss.readword();
        ss.sortword();
        ss.swapchar();
        ss.display();
    }
}