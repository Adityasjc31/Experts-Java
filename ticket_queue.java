import java.util.*;
class ticket_queue
{
    private int array[],size,rear,front,seat_no[];

    public ticket_queue()
    {
        size=50;
        front=rear=-1;
        array=new int[size];
        seat_no=new int[150];
        for(int x=0,y=101;x<150;x++,y++)
        {
            seat_no[x]=y;
        }
    }

    public void addque(int val)
    {
        if(rear<size-1)
        {
            rear++;
            array[rear]=val;
        }
        else
        {
            System.out.println("Seats are full");
        }
    }

    public void del_que(boolean deletion)
    {
        if(front<rear)
        {
            int bought = array[++front];
            int price = bought * 150;
            System.out.println("No of tickets bought = "+bought);
            System.out.println("Amount to be paid = "+price);
            System.out.print("Balcony seat numbers = ");
            boolean tab_correction=false;
            for(int x=front;x<front+bought;x++)
            {
                if(tab_correction)
                {
                    System.out.print("\t\t       ");
                }
                System.out.println(seat_no[x]);
                tab_correction=true;
            }

        }
        
        if(deletion)
        {
            if(array[front]!=0)
            {
                System.out.println("Deleted value = "+array[front]+" of person number in queue : "+(front+1));
                array[front]=0;
            }
            else
            {
                System.out.println("Tickets are underflow");
                rear=front=-1;
            }
        }
    }

    public void display()
    {
        for(int x=0;x<array.length;x++)
        {
            if(array[x]!=0)
            {
                System.out.println("The number of tickets bought by person number "+(x+1)+ " is : "+array[x]);
            }
        }
    }

    public static void call_que()
    {
        Scanner sc = new Scanner(System.in);
        int ch;
        ticket_queue ob = new ticket_queue();
        do
        {
            System.out.println("\fOption 1 - Addition in queue(Buying number of tickets)\nOption 2 - Deletion in queue(If the person refuses to buy the tickets)\nOption 3 - Display of queue\nOption 4 - Exit");
            System.out.println("Enter your choice");
            ch=sc.nextInt();

            switch(ch)
            {
                case 1 :
                System.out.print("Enter Number of tickets to be bought : ");
                int temp_val=sc.nextInt();
                ob.addque(temp_val);

                case 2 :
                if(ch==2) 
                {
                    ob.del_que(true);
                }
                else
                {
                    ob.del_que(false);
                }
                sc.nextLine();
                System.out.println("Press enter to continue");
                sc.nextLine();
                break;

                case 3:
                ob.display();
                sc.nextLine();
                System.out.println("Press enter to continue");
                sc.nextLine();
                break;

                case 4: 
                System.out.println("Exited.");
                break;

                default:
                System.out.println("Invalid Choice");
            }
        }while(ch!=4);
    }
}