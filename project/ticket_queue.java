package project;

import java.util.*;
class ticket_queue
{
    int array[],size,front,rear,seat_no,top;
    public ticket_queue()
    {
        size=50;
        array = new int[size];
        for(int x=0;x<size;x++)
        {
            array[x] = -1;
        }
        front=rear=top=-1;
        seat_no=101;
    }

    public boolean addque(int val)
    {
        if(rear<size-1 && seat_no<=100+size && val<=size)
        {
            rear++;
            array[rear]=val;
            return true;
        }
        else
        {
            if(val>size || seat_no>100+size)
            {
                System.out.println("Seats are not available");
            }
            if(!(rear<size-1))
            {
                System.out.println("Queue is full");
            }
            return false;
        }
    }

    public boolean del_que(boolean b)
    {
        if(front<rear && b)
        {
            System.out.println("Customer details that is been deleted");
            System.out.println("Number of tickets bought = "+array[++front]);
            System.out.println("Amount paid = "+(array[front]*150));
            array[front] = 0;
            return true;
        }

        if(top<rear)
        {
            int front = top;
            System.out.println("Number of tickets bought = "+array[++front]);
            System.out.println("Amount to be paid = "+(array[front]*150));
            System.out.print("Balcony seat numbers = ");
            boolean tab_correction=false;
            for(int x=front;x<front+array[front];x++)
            {
                if(tab_correction)
                {
                    System.out.print("\t\t       ");
                }
                System.out.println(seat_no++);
                tab_correction=true;
            }
            top++;
            return true;
        }
        else
        {
            System.out.println("Queue is empty");
            try
            {
                Thread.sleep(5000);
                for(int x=0;x<=5;x++)
                {
                    String t=".";
                    for(int y=0;y<3;y++)
                    {
                        System.out.print("\fResetting Queue"+t);
                        t+=".";
                        Thread.sleep(500);
                    }
                }
                System.out.println("\nProceeding to main menu just a second");
                Thread.sleep(5000);
                System.out.print("\f");
                front=rear=top=-1;
                seat_no=101;
            }
            catch(Exception e)
            {}
            return false;
        }
    }

    public void display()
    {
        int seat_no=101;
        for(int x=0;x<array.length;x++)
        {
            if(array[x]!=0 && array[x]!=-1)
            {
                System.out.println("The number of tickets bought by person number "+(x+1)+ " is : "+array[x]);
                System.out.println("Amount paid by customer = "+(array[x]*150));
                System.out.print("Balcony seat numbers = ");
                boolean tab_correction=false;
                for(int y=x;y<front+array[x];y++)
                {
                    if(tab_correction)
                    {
                        System.out.print("\t\t       ");
                    }
                    System.out.println(seat_no++);
                    tab_correction=true;
                }
                System.out.println();
            }
            else if(array[x]==0)
            {
                System.out.println("Customer Information not available of person number "+(x+1));
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
            System.out.println("\fOption 1 - Addition in queue(Buying number of tickets)\nOption 2 - Deletion in queue(If detatil about the customer is to be deleted)\nOption 3 - Display of queue\nOption 4 - Exit");
            System.out.println("Enter your choice");
            ch=sc.nextInt();

            switch(ch)
            {
                case 1 :
                System.out.print("Enter Number of tickets to be bought : ");
                int temp_val=sc.nextInt();
                if(ob.addque(temp_val))
                {
                    ob.del_que(false);
                }
                sc.nextLine();
                System.out.println("Press enter to continue");
                sc.nextLine();

                break;

                case 2 :
                if(ob.del_que(true))
                {
                    sc.nextLine();
                    System.out.println("Press enter to continue");
                    sc.nextLine();
                }
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
                try{Thread.sleep(10000);}catch(Exception e){}
            }
        }while(ch!=4);
    }
}