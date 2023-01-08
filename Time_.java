import java.util.*;
class Time_
{
    public static void main(String args [])
    {
        String words[]={"zero","one","two","three","four","five","six","seven","eight","nine","ten","eleven","twelve","thriteen","fourteen","fifteen","sixteen","seventeen","eighteen","nighteen","twenty","twenty-one","twenty-two","twenty-three","twenty-four","twenty-five","twenty-six","twenty-seven","twenty-eigth","twenty-nine","thirty"};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of hours");int h=sc.nextInt();
        System.out.println("Enter number of minutes");int m=sc.nextInt();
        if(m==0)
        {
            System.out.println(words[h]+" O'Clock");
        }
        else if(m==15)
        {
            System.out.println("Quarter past to "+words[h]);
        }
        else if(m==30)
        {
            System.out.println(words[h]+" Half past");
        }
        else if(m==45)
        {
            System.out.println("Quarter to "+(h<12 ? h+1:1));
        }
        else if(m>0 && m<30)
        {
            System.out.println(words[m]+" minutes to "+words[h]);
        }
        else if(m>30 && m<=59)
        {
            System.out.println(words[60-m]+" minutes to "+words[(h<12 ? h+1:1)]);
        }
    }
}