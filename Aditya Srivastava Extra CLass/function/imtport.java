package function;import java.util.*;
class imtport
{
    public static void main(String args [])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("1- To input a single digit number and print it in words ");
        System.out.println("2- To input a number and print corresponding month ");
        System.out.println("3- To input a character and print a word starting with it (a-d)(A-D)");
        System.out.println("4- To input a number of month and print season ");
        System.out.println("5- To input a number and print corresponding day of the week ");
        int n=sc.nextInt();
        switch (n)
        {
            case 1:
            Single_Digit obj=new Single_Digit();
            obj.display();
            break;
            case 2:
            month objm=new month();
            objm.display();
            break;
            case 3:            
            Character objc=new Character();
            objc.display();
            break;
            case 4:
            Month_ objq=new Month_();
            objq.display(); 
            break;
            case 5: 
            Week objl=new Week();
            objl.display();
            break;
            default:
            System.out.println("Wrong Input");
        }
    }
}